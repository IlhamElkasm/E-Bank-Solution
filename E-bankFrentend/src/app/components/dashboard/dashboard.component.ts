import { Component } from '@angular/core';
import { JwtService } from 'src/app/service/jwt.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent {

  constructor(
    private service: JwtService
  ){}

  ngOnInit(){
    this.sayHello();
  }
  sayHello(){
    this.service.sayHello().subscribe(
      (response) =>{
        console.log(response);
      }
    )
  }
}
