/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;

import java.util.Scanner;

/**
 *
 * @author q
 */
enum BloodType{O,A,B,AB};
public class patient extends Person  {
    
    BloodType BType;
    Doctor doctor;
    MedicalReport Mreport;
    double Visa;
    double Insurance;

    public patient() {
    }

    public patient(BloodType BType, MedicalReport Mreport, double Visa, double Insurance, String Name, Address address, String Nationality, int PhoneNumber, int ID, String Mail, Gender SE) {
        super(Name, address, Nationality, PhoneNumber, ID, Mail, SE);
        this.BType = BType;
        this.Mreport = Mreport;
        this.Visa = Visa;
        this.Insurance = Insurance;
    }

    public patient(BloodType BType, Doctor doctor, MedicalReport Mreport, double Visa, double Insurance, String Name, Address address, String Nationality, int PhoneNumber, int ID, String Mail, Gender SE) {
        super(Name, address, Nationality, PhoneNumber, ID, Mail, SE);
        this.BType = BType;
        this.doctor = doctor;
        this.Mreport = Mreport;
        this.Visa = Visa;
        this.Insurance = Insurance;
    }

   

    public BloodType getBType() {
        return BType;
    }

    public void setBType(BloodType BType) {
        this.BType = BType;
    }

    public MedicalReport getMreport() {
        return Mreport;
    }

    public void setMreport(MedicalReport Mreport) {
        this.Mreport = Mreport;
    }

    public double getVisa() {
        return Visa;
    }

    public void setVisa(double Visa) {
        this.Visa = Visa;
    }

    public double getInsurance() {
        return Insurance;
    }

    public void setInsurance(double Insurance) {
        this.Insurance = Insurance;
    }
  public void AddNewDocter(Doctor D)
  {
      int m=0 ;
      Scanner x = new Scanner(System.in);
      
      while(m==0)
      {
          
          System.out.println("Enter 1 for pay by your Insurance");
          System.out.println("Enter 2 for pay by your Visa");
          System.out.println("Enter 3 Exit");
          m = x.nextInt();
          if(m==1)
          {
              if(D.getPrice()>Insurance)
              {
                  System.out.println("You Don't have Enough money in your Insurance ");
                  
              
              }
              else
              {
                
                Insurance=Insurance-D.getPrice();
                Mreport.AddDoctor(D.getName());
                this.doctor=D;  
              }
          
          
          }
          if(m==2)
          {
              if(D.getPrice()>Visa)
              {
                  System.out.println("You Don't have Enough money in your Visa ");
                
 
              }
              else
              {
                Visa=Visa-D.getPrice();
                Mreport.AddDoctor(D.getName());
                this.doctor=D;
                
                  
              }
          
          
          }
          if(m==3)
          {
              return;
          }
          else
          {
              m=0;
          
          }
      
      
      }
      System.out.println("Thanks ( = ");
      
  
  }
    
    
}
