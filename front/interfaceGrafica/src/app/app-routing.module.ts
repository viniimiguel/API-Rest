import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { FooterComponent } from './_components/footer/footer.component';
import { CpfGenerateComponent } from './cpf-generate/cpf-generate.component';
import { CnpjGenerateComponent } from './cnpj-generate/cnpj-generate.component';
import { RgGenerateComponent } from './rg-generate/rg-generate.component';
import { PasswordGenerateComponent } from './password-generate/password-generate.component';
import { NameGenerateComponent } from './name-generate/name-generate.component';
import { LoremGenerateComponent } from './lorem-generate/lorem-generate.component';
import { CnhComponentComponent } from './cnh-component/cnh-component.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: '', component: HomeComponent},
  {path: 'cpf-generate', component: CpfGenerateComponent},
  {path: 'cnpj-generate', component: CnpjGenerateComponent},
  {path: 'cnh-generate', component: CnhComponentComponent},
  {path: 'rg-generate', component: RgGenerateComponent},
  {path: 'password-generate', component: PasswordGenerateComponent},
  {path: 'name-generate', component: NameGenerateComponent},
  {path: 'lorem-generate', component: LoremGenerateComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
