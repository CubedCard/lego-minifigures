import {Component, OnInit} from '@angular/core';
import {MinifiguresService} from "../../services/minifigures-service";
import {Minifigure} from "../../models/minifigure";
import {StupidLevel} from "../../models/enums/stupid-level";
import {Owner} from "../../models/owner";
import {Size} from "../../models/enums/size";
import {Packaging} from "../../models/enums/packaging";
import {House} from "../../models/house";

@Component({
  selector: 'app-minifigures',
  templateUrl: './minifigures.component.html',
  styleUrls: ['./minifigures.component.css']
})
export class MinifiguresComponent implements OnInit {

  packages = Object.entries(Packaging).filter(e => !isNaN(e[0] as any));
  sizes = Object.entries(Size).filter(e => !isNaN(e[0] as any));
  stupidLevels = Object.entries(StupidLevel).filter(e => !isNaN(e[0] as any));
  minifigures: Minifigure[];

  constructor(private service: MinifiguresService) {
    this.minifigures = service.minifigures;
  }

  ngOnInit(): void {
  }

  add(owner: HTMLInputElement, name: HTMLInputElement, location: HTMLInputElement, female: HTMLInputElement, old: HTMLInputElement, theme: HTMLInputElement, job: HTMLInputElement, homeless: HTMLInputElement, house: HTMLInputElement, stupidLevel: HTMLSelectElement) {
    // this.service.add(new Minifigure([new Owner(owner.value)], name.value, location.value, female.checked, old.checked, theme.value, job.value, homeless.checked, new House(house.value), stupidLevel.selectedIndex));
    this.service.add(new Minifigure([], name.value, location.value, female.checked, old.checked, theme.value, job.value, homeless.checked, stupidLevel.selectedIndex));
  }
}
