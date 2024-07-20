import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Compte } from '../module/compte';

@Injectable({
  providedIn: 'root'
})
export class CompteService {

  private apiUrl = 'http://localhost:8084/api/compte';

  constructor(private http: HttpClient) {}

  getComptes(): Observable<Compte[]> {
    const headers = this.createAuthorizationHeader();
    return this.http.get<Compte[]>(`${this.apiUrl}/affiche`, { headers });
  }

  private createAuthorizationHeader(): HttpHeaders | undefined {
    const jwtToken = localStorage.getItem('jwt');
    if (jwtToken) {
      return new HttpHeaders().set("Authorization", "Bearer " + jwtToken);
    } else {
      console.log("JWT token not found in local storage");
      return undefined;
    }
  }
}
