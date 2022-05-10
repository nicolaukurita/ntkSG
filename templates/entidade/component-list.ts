import { Component } from '@angular/core';

@Component({
    selector: '${projeto.angularAppName}-${entidade.pluralName.toLowerCase()}',
    templateUrl: './${entidade.nome.toLowerCase()}-list.component.html'
})
export class ${entidade.Nome}ListComponent {
    pageTitle: string = '${entidade.nome} List';
#foreach( $campo in $campos)
#if ($campo.hasFilter == true)
    listFilter${campo.nome}: string = '';
#end
#end
    ${entidade.pluralName.toLowerCase()}: any[] = [
      {
        "productId": 2,
        "productName": "Garden Cart",
        "productCode": "GDN-0023",
        "releaseDate": "March 18, 2019",
        "description": "15 gallon capacity rolling garden cart",
        "price": 32.99,
        "starRating": 4.2,
        "imageUrl": "assets/images/garden_cart.png"
      },
      {
        "productId": 5,
        "productName": "Hammer",
        "productCode": "TBX-0048",
        "releaseDate": "May 21, 2019",
        "description": "Curved claw steel hammer",
        "price": 8.9,
        "starRating": 4.8,
        "imageUrl": "assets/images/hammer.png"
      }
    ];
}