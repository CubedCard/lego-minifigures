import {Injectable} from '@angular/core';
import {Minifigure} from "../models/minifigure";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class MinifiguresService {

  minifigures: Minifigure[];

  constructor(private http: HttpClient) {
    this.minifigures = [];
    this.getAllMinifigures().subscribe((minifigures: Minifigure[]) => this.minifigures.push(...minifigures));
  }

  getAllMinifigures(): Observable<Minifigure[]> {
    return this.http.get<Minifigure[]>(`${environment.apiUrl}/user`).pipe(map(content => {
      return content;
    }));
  }
}
