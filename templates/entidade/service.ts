import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable, throwError } from "rxjs";
import { catchError, map, tap } from 'rxjs/operators';
import { I${entidade.nome} } from "./${entidade.nameLower}";

@Injectable({
  providedIn: 'root'
})
export class ${entidade.Nome}Service {
    private ${entidade.nameLower}Url = 'api/${entidade.pluralNameLower}/${entidade.pluralNameLower}.json';
    constructor(private http: HttpClient) { }

    get${entidade.pluralName}(): Observable<I${entidade.nome}[]> {
    return this.http.get<I${entidade.nome}[]>(this.${entidade.nameLower}Url)
          .pipe(
            tap(data => console.log('All: ', JSON.stringify(data))),
            catchError(this.handleError)
          );
    }

    private handleError(err: HttpErrorResponse): Observable<never> {
    // in a real world app, we may send the server to some remote logging infrastructure
    // instead of just logging it to the console
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      errorMessage = `An error occurred: ${err.error.message}`;
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
    }
    console.error(errorMessage);
    return throwError(errorMessage);
  }

}