import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

/**
 * Injectable service to handle API requests to Labseq (Quarkus).
 */

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  // Base URL for the Labseq API
  private baseUrl = 'http://localhost:8080/labseq'; 

  // Injecting the HttpClient service for making HTTP requests
  constructor(private http: HttpClient) { }

  /**
   * Makes a GET request to obtain the Labseq value for a given number (n).
   * 
   * @param n The number for which to calculate the Labseq Value.
   * @returns An Observable containing the Labseq value.
   */
  getLabseqValue(n: number) {
    return this.http.get<number>(`${this.baseUrl}/${n}`);
  }
}
