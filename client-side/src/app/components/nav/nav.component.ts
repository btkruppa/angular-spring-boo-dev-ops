import { Component } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent {
  hideNav = true;
  toggleCollapse(): void {
    this.hideNav = !this.hideNav;
  }
}
