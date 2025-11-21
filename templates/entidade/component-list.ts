import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { I${entidade.singularPascalCase} } from './${entidade.singularCamelCase}';
import { ${entidade.singularPascalCase}Service } from './${entidade.singularCamelCase}.service';
@Component({
    templateUrl: './${entidade.singularCamelCase}-list.component.html'
})
export class ${entidade.singularPascalCase}ListComponent implements OnInit{
    pageTitle: string = '${entidade.singularPascalCase} List';
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
    this.filtered${entidade.pluralPascalCase} = this.performFilter(value);
  }

  filtered${entidade.pluralPascalCase}: I${entidade.singularPascalCase}[] = [];

    performFilter(filterBy: string): I${entidade.singularPascalCase}[] {
      filterBy = filterBy.toLocaleLowerCase();
      return this.${entidade.pluralCamelCase}.filter((${entidade.singularCamelCase}: I${entidade.singularPascalCase}) =>
        ${entidade.singularCamelCase}.${campo.dicionario.name}.toLocaleLowerCase().includes(filterBy));
    }
#end
#end
    constructor(private ${entidade.singularCamelCase}Service: ${entidade.singularPascalCase}Service) {}

    ${entidade.pluralCamelCase}: I${entidade.singularPascalCase}[] = [];

  ngOnInit(): void {
    this.sub = this.${entidade.singularCamelCase}Service.get${entidade.pluralPascalCase}().subscribe({
      next: ${entidade.singularCamelCase} => {
        this.${entidade.pluralCamelCase} = ${entidade.singularCamelCase};
        this.filtered${entidade.pluralPascalCase} = this.${entidade.pluralCamelCase};
      },
      error: err => this.errorMessage = err
        });
    }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}