import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
#foreach( $entidade in $entidades )
import { ${entidade.singularNameUpper}ListComponent } from 'src/${entidade.nameLower}/${entidade.nameLower}-list.component';
import { ${entidade.singularNameUpper}DetailComponent } from 'src/${entidade.nameLower}/${entidade.nameLower}-detail.component';
import { ${entidade.singularNameUpper}DetailGuard } from 'src/${entidade.nameLower}/${entidade.nameLower}-detail.guard';
#end
import { FormsModule } from '@angular/forms';
import { WelcomeComponent } from 'src/home/welcome.component';

@NgModule({
  declarations: [
#foreach( $entidade in $entidades )
    ${entidade.singularNameUpper}ListComponent,
#end
    WelcomeComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
#foreach( $entidade in $entidades )
          { path: '${entidade.pluralNameLower}', component: ${entidade.singularNameUpper}ListComponent },
          { path: '${entidade.pluralNameLower}/:id', canActivate: [${entidade.singularNameUpper}DetailGuard], component: ${entidade.singularNameUpper}DetailComponent },
#end
          { path: 'welcome', component: WelcomeComponent },
          { path: '', redirectTo: 'welcome', pathMatch: 'full' },
          { path: '**', redirectTo: 'welcome', pathMatch: 'full' }
        ]),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
