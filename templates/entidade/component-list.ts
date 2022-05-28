import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { I${entidade.singularNameUpper} } from './${entidade.singularNameLower}';
import { ${entidade.singularNameUpper}Service } from './${entidade.singularNameLower}.service';
@Component({
    templateUrl: './${entidade.singularNameLower}-list.component.html'
})
export class ${entidade.singularNameUpper}ListComponent implements OnInit{
    pageTitle: string = '${entidade.singularNameUpper} List';
      errorMessage = '';
sub!: Subscription;

#foreach( $campo in $campos)
#if ($campo.hasFilter == true)
  private _listFilter${campo.dicionario.name} = '';
  get listFilter${campo.dicionario.name}(): string {
    return this._listFilter${campo.dicionario.name};
  }
  set listFilter${campo.dicionario.name}(value: string) {
    this._listFilter${campo.dicionario.name}= value;
    this.filtered${entidade.pluralNameUpper} = this.performFilter(value);
  }

  filtered${entidade.pluralNameUpper}: I${entidade.singularNameUpper}[] = [];

    performFilter(filterBy: string): I${entidade.singularNameUpper}[] {
      filterBy = filterBy.toLocaleLowerCase();
      return this.${entidade.pluralNameLower}.filter((${entidade.singularNameLower}: I${entidade.singularNameUpper}) =>
        ${entidade.singularNameLower}.${campo.dicionario.name}.toLocaleLowerCase().includes(filterBy));
    }
#end
#end
    constructor(private ${entidade.singularNameLower}Service: ${entidade.singularNameUpper}Service) {}

    ${entidade.pluralNameLower}: I${entidade.singularNameUpper}[] = [];

  ngOnInit(): void {
    this.sub = this.${entidade.singularNameLower}Service.get${entidade.pluralNameUpper}().subscribe({
      next: ${entidade.singularNameLower} => {
        this.${entidade.pluralNameLower} = ${entidade.singularNameLower};
        this.filtered${entidade.pluralNameUpper} = this.${entidade.pluralNameLower};
      },
      error: err => this.errorMessage = err
        });
    }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}