import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { JwtService } from 'src/app/service/jwt.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{

  loginForm!: FormGroup;
  router: any;
  constructor(
    private service: JwtService,
    private fb: FormBuilder
  ){}
  ngOnInit(): void {
    this.loginForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required]],
    })
  }
  submitForm() {
    console.log(this.loginForm.value);
    this.service.register(this.loginForm.value).subscribe(
      (response) => {
          console.log(response)
          if (response.jwt != null) {
            alert("Hello, Your token is " + response.jwt);
          }
        }
    )
  }
}
