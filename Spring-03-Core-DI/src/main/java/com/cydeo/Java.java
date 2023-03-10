package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field injection
   //  @Autowired // without autowired it gives null pointer exception
   // OfficeHours officeHours;


    //Constructor injection
    OfficeHours officeHours;

//    @Autowired // if there is only one constructor in the class, omit writing the @Autowired annotation(Spring 4.3)
//
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){

        System.out.println("Weekly teaching hours : "+ (20+officeHours.getHours()));
    }

}
