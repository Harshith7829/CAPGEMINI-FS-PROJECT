import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { UpdatemovieComponent } from './updatemovie/updatemovie.component';
import { AddtheaterComponent } from './addtheater/addtheater.component';
import { GetmoviesComponent } from './getmovies/getmovies.component';
import { AddshowComponent } from './addshow/addshow.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const routes: Routes = [
  {path :"", component : HomeComponent},
  {path :"addnewmovie",component:AddmovieComponent},
  {path :"getallmovies",component : GetmoviesComponent},
  {path :"updatemovie/:movieId",component: UpdatemovieComponent},
  {path : "addnewtheater",component:AddtheaterComponent},
  {path:"addshow",component:AddshowComponent},
  {path:'**',component:PagenotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
