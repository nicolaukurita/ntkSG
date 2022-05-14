import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
#foreach( $entidade in $entidades )
import { ${entidade.nome}ListComponent } from 'src/${entidade.nome.toLowerCase()}/${entidade.nome.toLowerCase()}-list.component';
import { ${entidade.nome}DetailComponent } from 'src/${entidade.nome.toLowerCase()}/${entidade.nome.toLowerCase()}-detail.component';
#end
import { FormsModule } from '@angular/forms';
import { WelcomeComponent } from 'src/home/welcome.component';

@NgModule({
  declarations: [
#foreach( $entidade in $entidades )
    ${entidade.nome}ListComponent,
#end
    WelcomeComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
#foreach( $entidade in $entidades )
          { path: '${entidade.pluralNameLower}', component: ${entidade.nome}ListComponent },
          { path: '${entidade.pluralNameLower}/:id', component: ${entidade.nome}DetailComponent },
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
