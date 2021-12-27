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

  private findById(id: number): Minifigure | null {
    for (let i = 0; i < this.minifigures.length; i++) {
      if (this.minifigures[i].id == id) return this.minifigures[i];
    }
    return null;
  }

  add(minifigure: Minifigure) {
    this.addMinifigure(minifigure).subscribe((response: Minifigure) => this.minifigures.push(response));
  }

  private getAllMinifigures(): Observable<Minifigure[]> {
    return this.http.get<Minifigure[]>(`${environment.apiUrl}/mini`).pipe(map(content => {
      return content;
    }));
  }

  private addMinifigure(minifigure: Minifigure): Observable<Minifigure> {
    return this.http.post<Minifigure>(`${environment.apiUrl}/mini`, minifigure).pipe(map((content) => {
      return content;
    }))
  }
}
