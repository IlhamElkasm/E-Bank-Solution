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

  comptes: Compte[] = [];
dataSource: any;

  constructor(private compteService: CompteService, private router: Router) {}

  ngOnInit(): void {
    this.getComptes();
  }

  getComptes(): void {
    this.compteService.getComptes().subscribe(
      (response) => {
        this.comptes = response;
      },
      (error) => {
        console.error("Error occurred while fetching comptes", error);
      }
    );
  }
}
