import { Component } from '@angular/core';

@Component({
    selector: '${projeto.angularAppName}-${entidade.pluralName.toLowerCase()}',
    templateUrl: './${entidade.nome.toLowerCase()}-list.component.html'
})
export class ${entidade.Nome}ListComponent {
    pageTitle: string = '${entidade.nome} List';
}