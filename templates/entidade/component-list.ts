import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { I${entidade.nome} } from './${entidade.nameLower}';
import { ${entidade.nome}Service } from './${entidade.nameLower}.service';
@Component({
    templateUrl: './${entidade.nameLower}-list.component.html'
})
export class ${entidade.Nome}ListComponent implements OnInit{
    pageTitle: string = '${entidade.nome} List';
      errorMessage = '';
sub!: Subscription;

#foreach( $campo in $campos)
#if ($campo.hasFilter == true)
  private _listFilter${campo.nome} = '';
  get listFilter${campo.nome}(): string {
    return this._listFilter${campo.nome};
  }
  set listFilter${campo.nome}(value: string) {
    this._listFilter${campo.nome}= value;
    this.filtered${entidade.pluralName} = this.performFilter(value);
  }

  filtered${entidade.pluralName}: I${entidade.nome}[] = [];

    performFilter(filterBy: string): I${entidade.nome}[] {
      filterBy = filterBy.toLocaleLowerCase();
      return this.${entidade.pluralNameLower}.filter((${entidade.nameLower}: I${entidade.nome}) =>
        ${entidade.nameLower}.${campo.nome}.toLocaleLowerCase().includes(filterBy));
    }
#end
#end
    constructor(private ${entidade.nameLower}Service: ${entidade.nome}Service) {}

    ${entidade.pluralNameLower}: I${entidade.nome}[] = [];

  ngOnInit(): void {
    this.sub = this.${entidade.nameLower}Service.get${entidade.pluralName}().subscribe({
      next: ${entidade.nameLower} => {
        this.${entidade.pluralNameLower} = ${entidade.nameLower};
        this.filtered${entidade.pluralName} = this.${entidade.pluralNameLower};
      },
      error: err => this.errorMessage = err
        });
    }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}