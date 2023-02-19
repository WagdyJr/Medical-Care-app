/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.time.*;
/**
 *
 * @author q
 */
public abstract class INFO {
   
    
    String Reson;
    String Result;
    String date;

    public INFO() {
        Date D = new Date();
        date = D.toString();
    }

    public INFO(String Reson, String Result) {
        this.Reson = Reson;
        this.Result = Result;
        Date D = new Date();
        date = D.toString();
        
    }

    public INFO(String Reson, String Result, String date) {
        this.Reson = Reson;
        this.Result = Result;
        this.date = date;
    }

    public String getReson() {
        return Reson;
    }

    public void setReson(String Reson) {
        this.Reson = Reson;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    abstract public void Print(); 
            
    
    
    
    
    
}
