import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const url = ["http://localhost:8084/api/v1/auth/"]

@Injectable({
  providedIn: 'root'
})
export class JwtService {

  constructor(private http: HttpClient) { }

  register(singRequest:any): Observable<any>{
    return this.http.post(url+'register', singRequest)
  }
  login(loginRequest:any): Observable<any>{
    return this.http.post(url+'authenticate', loginRequest)
  }
}
