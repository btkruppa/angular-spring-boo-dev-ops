import { Component, OnInit, OnDestroy } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Subscription } from 'rxjs/Subscription';
import { TimerObservable } from 'rxjs/Observable/TimerObservable';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html'
})
export class PipesComponent implements OnInit, OnDestroy {
  currentTime: Date;
  interval: Observable<number>;
  subscription: Subscription = null;

  constructor() {

  }

  ngOnInit() {
    this.interval = TimerObservable.create(0, 1000);
    this.start();
  }

  start() {
    if (this.subscription === null) {
      this.subscription = this.interval.subscribe(() => {
        console.log('hello');
        this.currentTime = new Date();
      });
    }
  }

  stop() {
    if (this.subscription !== null) {
      this.subscription.unsubscribe();
      this.subscription = null;
    }
  }

  ngOnDestroy() {
    this.stop();
  }
}
