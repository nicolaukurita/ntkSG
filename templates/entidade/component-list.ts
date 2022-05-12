import { Component, OnInit } from '@angular/core';
import { I${entidade.nome} } from './${entidade.nameLower}';
import { ${entidade.nome}Service } from './${entidade.nameLower}.service';
@Component({
    selector: '${projeto.angularAppName}-${entidade.pluralNameLower}',
    templateUrl: './${entidade.nome.toLowerCase()}-list.component.html'
})
export class ${entidade.Nome}ListComponent implements OnInit{
    pageTitle: string = '${entidade.nome} List';
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
#foreach( $campo in $campos)
#if ($campo.hasFilter == true)
        this.listFilter${campo.nome}='';
#end
#end
        this.${entidade.pluralNameLower} = this.${entidade.nameLower}Service.get${entidade.pluralName}();
        this.filtered${entidade.pluralName} = this.${entidade.pluralNameLower};
        console.log('In ngOnInit');
    }
}