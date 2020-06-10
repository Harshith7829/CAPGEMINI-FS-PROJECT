import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import {NgForm} from '@angular/forms'

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  err: string;
  success:string;
  today=Date.now();
  constructor(private admin : AdminService) { }

  addNewMovie(form: NgForm){
    this.admin.addMovie(form.value).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        this.success = data.discription;
        setTimeout(() => {
          this.success = null;
        }, 8000);
        form.reset();
      }else{
        form.reset();
        this.err=data.discription;
      }
    });
  }
  ngOnInit(): void {
  }

}
