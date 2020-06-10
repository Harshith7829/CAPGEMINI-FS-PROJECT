import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addshow',
  templateUrl: './addshow.component.html',
  styleUrls: ['./addshow.component.css']
})
export class AddshowComponent implements OnInit {

  err:string;
  success:string;
  constructor(private admin: AdminService) { 

  }

  addshow(form:NgForm){
    this.admin.addshow(form.value).subscribe(data=>{
      console.log(data)
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
    })
  }

  ngOnInit(): void {
  }

}
