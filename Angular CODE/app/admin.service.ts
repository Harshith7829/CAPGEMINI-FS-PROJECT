import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  url ='http://localhost:8080'
  constructor(private http : HttpClient ) { }

  addMovie(movieDetails) : Observable<any>{
    return this.http.post<any>(`${this.url}/add-newmovie`, movieDetails)
  }

  getmovies():Observable<any>{
   return this.http.get<any>(`${this.url}/get-allmovies`)
  }

  deletemovie(movie):Observable<any>{
    return this.http.delete<any>(`${this.url}/delete-movie/${movie.movieId}`)
  }

 updatemovie(movie):Observable<any>{
  return this.http.put<any>(`${this.url}/modify-movie`,movie);
 }

 addtheater(theater):Observable<any>{
   return this.http.post<any>(`${this.url}/add-newtheater`,theater);   
 }

 addshow(show): Observable<any>{
   console.log(show)
   return this.http.post<any>(`${this.url}/add-newshow`,show);
 }
}
