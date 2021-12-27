import { Component, OnInit } from '@angular/core';
import {MinifiguresService} from "../../services/minifigures-service";
import {Minifigure} from "../../models/minifigure";

@Component({
  selector: 'app-minifigures',
  templateUrl: './minifigures.component.html',
  styleUrls: ['./minifigures.component.css']
})
export class MinifiguresComponent implements OnInit {

  minifigures: Minifigure[];

  constructor(private service: MinifiguresService) {
    this.minifigures = service.minifigures;
  }

  ngOnInit(): void {
  }

}
