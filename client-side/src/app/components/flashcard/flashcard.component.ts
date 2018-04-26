import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-flashcard',
  templateUrl: './flashcard.component.html',
  styleUrls: ['flashcard.component.css']
})
export class FlashcardComponent {
  @Input()
  public flashcard;
  public display = false;

  public toggleAnswer() {
    this.display = !this.display;
  }
}

