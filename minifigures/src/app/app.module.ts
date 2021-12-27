import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './mainpage/home/home.component';
import { MinifiguresComponent } from './mainpage/minifigures/minifigures.component';
import {RouterModule, Routes} from "@angular/router";
import {HttpClientModule} from "@angular/common/http";

const appRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'minifigures', component: MinifiguresComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MinifiguresComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
