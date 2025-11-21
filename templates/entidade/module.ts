import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ${entidade.singularPascalCase}ListComponent } from 'src/${entidade.pluralCamelCase}/${entidade.singularCamelCase}-list.component';
import { ${entidade.singularPascalCase}DetailComponent } from 'src/${entidade.pluralCamelCase}/${entidade.singularCamelCase}-detail.component';
import { ${entidade.singularPascalCase}DetailGuard } from 'src/${entidade.pluralCamelCase}/${entidade.singularCamelCase}-detail.guard';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    ${entidade.singularPascalCase}ListComponent,
    ${entidade.singularPascalCase}DetailComponent
  ],
  imports: [
    RouterModule.forChild([
      { path: '${entidade.pluralCamelCase}', component: ${entidade.singularPascalCase}ListComponent },
      { path: '${entidade.pluralCamelCase}/:id', canActivate: [${entidade.singularPascalCase}DetailGuard], component: ${entidade.singularPascalCase}DetailComponent }
    ]),
    CommonModule,
    FormsModule
  ]
})
export class ${entidade.singularPascalCase}Module { }