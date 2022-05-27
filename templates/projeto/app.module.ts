import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { WelcomeComponent } from 'src/home/welcome.component';
import { ${entidade.singularNameUpper}Module } from 'src/${entidade.pluralNameLower}/${entidade.singularNameLower}.module';

@NgModule({
  declarations: [
    WelcomeComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
          { path: 'welcome', component: WelcomeComponent },
          { path: '', redirectTo: 'welcome', pathMatch: 'full' },
          { path: '**', redirectTo: 'welcome', pathMatch: 'full' }
        ]),
    ${entidade.singularNameUpper}Module
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
