import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ${entidade.singularNameUpper}ListComponent } from 'src/${entidade.pluralNameLower}/${entidade.singularNameLower}-list.component';
import { ${entidade.singularNameUpper}DetailComponent } from 'src/${entidade.pluralNameLower}/${entidade.singularNameLower}-detail.component';
import { ${entidade.singularNameUpper}DetailGuard } from 'src/${entidade.pluralNameLower}/${entidade.singularNameLower}-detail.guard';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    ${entidade.singularNameUpper}ListComponent,
    ${entidade.singularNameUpper}DetailComponent
  ],
  imports: [
    RouterModule.forChild([
      { path: '${entidade.pluralNameLower}', component: ${entidade.singularNameUpper}ListComponent },
      { path: '${entidade.pluralNameLower}/:id', canActivate: [${entidade.singularNameUpper}DetailGuard], component: ${entidade.singularNameUpper}DetailComponent }
    ]),
    CommonModule,
    FormsModule
  ]
})
export class ${entidade.singularNameUpper}Module { }