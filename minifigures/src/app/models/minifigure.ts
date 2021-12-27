import {StupidLevel} from "./stupid-level";
import {House} from "./house";
import {Owner} from "./owner";

export class Minifigure {
  id: number;
  owners: Owner[];
  name: string;
  location: string;
  female: boolean;
  old: boolean;
  theme: string;
  job: string;
  homeless: boolean;
  house: House;
  stupidLevel: StupidLevel;

  constructor(id: number, owners: Owner[], name: string, location: string, female: boolean, old: boolean, theme: string, job: string, homeless: boolean, house: House, stupidLevel: StupidLevel) {
    this.id = id;
    this.owners = owners;
    this.name = name;
    this.location = location;
    this.female = female;
    this.old = old;
    this.theme = theme;
    this.job = job;
    this.homeless = homeless;
    this.house = house;
    this.stupidLevel = stupidLevel;
  }
}
