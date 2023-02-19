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
public class WwwTeamworkCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       XRay x1= new XRay(); 
       XRay x2= new XRay(); 
       MedicalReport m= new MedicalReport();
       m.AddXray(x2);
       m.AddXray(x1);
       m.print();

    }
    
}
