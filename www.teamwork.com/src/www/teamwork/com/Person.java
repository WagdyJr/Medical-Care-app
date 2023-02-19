/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;

/**
 *
 * @author q
 */
enum Gender{male , female};
public class Person  {
    
    private String Name ; 
    Address address;
    private String Nationality;
    private int PhoneNumber;
    private int ID; 
    private String Mail;
    private Gender SE;

    public Person() {
    }

    public Person(String Name, Address address, String Nationality, int PhoneNumber, int ID, String Mail, Gender SE) {
        this.Name = Name;
        this.address = address;
        this.Nationality = Nationality;
        this.PhoneNumber = PhoneNumber;
        this.ID = ID;
        this.Mail = Mail;
        this.SE = SE;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public Gender getSE() {
        return SE;
    }

    public void setSE(Gender SE) {
        this.SE = SE;
    }


    
    
    
    
}
