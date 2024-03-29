import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "app-nav",
  templateUrl: "./nav.component.html",
  styleUrls: ["./nav.component.css"],
})
export class NavComponent implements OnInit {
  github: string = "https://github.com/rodrigowe1988/helpdesk";

  constructor(private router: Router) {}

  ngOnInit(): void {
    this.router.navigate(["home"]);
  }
}
