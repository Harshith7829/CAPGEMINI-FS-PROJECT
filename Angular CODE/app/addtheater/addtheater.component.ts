import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addtheater',
  templateUrl: './addtheater.component.html',
  styleUrls: ['./addtheater.component.css']
})
export class AddtheaterComponent implements OnInit {
    err:string;
    success:string;
  constructor(private adminService : AdminService ) {

   }
   addNewTheater(form: NgForm){
     this.adminService.addtheater(form.value).subscribe(data=>{
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
