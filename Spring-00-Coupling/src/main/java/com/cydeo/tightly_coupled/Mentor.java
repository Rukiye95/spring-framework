package com.cydeo.tightly_coupled;

import com.cydeo.loosely_coupled.FullTimeMentor;

public class Mentor {


    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor){
        this.fullTimeMentor=fullTimeMentor;
        this.partTimeMentor=partTimeMentor;
    }


    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
