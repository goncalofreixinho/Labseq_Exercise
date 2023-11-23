import { Component } from '@angular/core';
import { ApiService } from './api.service';

/**
 * Component representing the main application view.
 */

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // Private property to store the input number.
  private _n: number = 0 ;

  // Getter for the input number.
  get n(): number {
    return this._n;
  }

  // Setter for the input number.
  set n(value: number) {
    this._n = value;
  }

  // Variable to store the calculated Labseq Value.
  labseqValue: number;

  // Injecting ApiService for API interactions.
  constructor(private apiService: ApiService) {}

  /**
   * Handles the calculation of the Labseq Value when the button is clicked.
   * Validates the input number and then uses ApiService to get Labseq Value.
   */

  onGetLabseqValue() {
    if (this.n !== undefined && !isNaN(this.n)) {
      this.apiService.getLabseqValue(this.n).subscribe(value => {
        this.labseqValue = value;
      });
    } else {
      console.error('Valor de n é inválido:', this.n);
    }
  }
  
  /**
   * Updates the input number based on user input.
   * 
   * @param value The new value for n, as entered by the user.
   */

  onNChange(value: number) {
    this.n = value;
  }
}
