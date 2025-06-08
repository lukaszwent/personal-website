import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HelloWorldService } from './hello-world.service';

@Component({
  imports: [RouterModule],
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  title = 'frontend';
  message: string = '';

  constructor(private helloWorldService: HelloWorldService) {}

  ngOnInit(): void {
    this.helloWorldService.getHelloWorld().subscribe((response) => {
      this.message = response;
      console.log(this.message);
    });
  }
}
