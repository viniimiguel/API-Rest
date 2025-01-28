import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  standalone: false,

  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.css'
})
export class SidebarComponent {

  constructor(private router: Router) {}

  navigateToCpfGenerate() {
    this.router.navigate(['/cpf-generate']);
  }
  navigateToCnpjGenerate(){
    this.router.navigate(['cnpj-generate']);
  }
  navigateToCnhGenerate(){
    this.router.navigate(['cnh-generate']);
  }
  navigateToRgGenerate(){
    this.router.navigate(['rg-generate']);
  }
  navigateToLoremGenerate(){
    this.router.navigate(['lorem-generate']);
  }
  navigateToNameGenerate(){
    this.router.navigate(['name-generate']);
  }
  navigateToPasswordGenerate(){
    this.router.navigate(['password-generate'])
  }
}
