import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Compte } from 'src/app/module/compte';
import { CompteService } from 'src/app/service/compte.service';

@Component({
  selector: 'app-comptecreate',
  templateUrl: './comptecreate.component.html',
  styleUrls: ['./comptecreate.component.scss']
})
export class ComptecreateComponent {

  compte: Compte = new Compte();
  errorMessage: string = '';

  constructor(private compteService: CompteService) { }

  ngOnInit(): void {
  }

  creerCompte(): void {
    this.compteService.creerCompte(this.compte).subscribe(
      (response: Compte) => {
        console.log('Compte créé avec succès:', response);
      },
      (error: HttpErrorResponse) => {
        if (error.status === 403) {
          this.errorMessage = 'Accès refusé. Vous n\'avez pas les permissions nécessaires pour créer un compte.';
        } else {
          this.errorMessage = `Erreur lors de la création du compte: ${error.message}`;
        }
        console.error('Erreur lors de la création du compte', error);
      }
    );
  }
}
