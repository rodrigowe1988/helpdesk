import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Credenciais } from '../models/Credenciais';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  apiUrl: string = ''

  constructor(private http: HttpClient) { }

  authenticate(creds: Credenciais) {
      return this.http.post(this.apiUrl)
  }
}
