import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
#foreach( $entidade in $entidades )
import { ${entidade.nome}ListComponent } from 'src/${entidade.nome.toLowerCase()}/${entidade.nome.toLowerCase()}-list.component';
#end
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
#foreach( $entidade in $entidades )
    ${entidade.nome}ListComponent,
#end
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
