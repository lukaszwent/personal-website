import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class HelloWorldService {
  private apiUrl = '/api/hello';

  constructor(private http: HttpClient) {}

  getHelloWorld(): Observable<string> {
    return this.http
      .get(this.apiUrl, { responseType: 'text' })
      .pipe(tap(console.log));
  }
}
