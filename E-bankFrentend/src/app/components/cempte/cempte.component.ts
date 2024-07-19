import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Compte } from 'src/app/module/compte';
import { CompteService } from 'src/app/service/compte.service';

@Component({
  selector: 'app-cempte',
  templateUrl: './cempte.component.html',
  styleUrls: ['./cempte.component.scss']
})
export class CempteComponent implements OnInit {

  
  compte : Compte[]= [];

  constructor(private serviceCompte:  CompteService,
    private router : Router ){}
  ngOnInit(): void {
    this.getCompte();
  }

  private getCompte(){
    this.serviceCompte.getCompte().subscribe(data =>
      {
        this.compte= data;
      });
  }
}
