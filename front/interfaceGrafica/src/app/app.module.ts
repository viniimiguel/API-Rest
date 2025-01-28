import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { NavbarComponent } from './_components/navbar/navbar.component';
import { FooterComponent } from './_components/footer/footer.component';
import { SidebarComponent } from './_components/sidebar/sidebar.component';
import { CpfGenerateComponent } from './cpf-generate/cpf-generate.component';
import { CnpjGenerateComponent } from './cnpj-generate/cnpj-generate.component';
import { RgGenerateComponent } from './rg-generate/rg-generate.component';
import { CnhComponentComponent } from './cnh-component/cnh-component.component';
import { PasswordGenerateComponent } from './password-generate/password-generate.component';
import { NameGenerateComponent } from './name-generate/name-generate.component';
import { LoremGenerateComponent } from './lorem-generate/lorem-generate.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    SidebarComponent,
    CpfGenerateComponent,
    CnpjGenerateComponent,
    RgGenerateComponent,
    CnhComponentComponent,
    PasswordGenerateComponent,
    NameGenerateComponent,
    LoremGenerateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent, CpfGenerateComponent]
})
export class AppModule { }
