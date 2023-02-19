/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;
import java.util.ArrayList;
/**
 *
 * @author q
 */
public class MedicalReport {
    
   
    ArrayList<String> ArrayOfDoctor = new ArrayList<String>();
    ArrayList<String> Medicine = new ArrayList<String>();
    ArrayList<XRay> xray = new ArrayList<XRay>();
    ArrayList<MedicalAnalysis> medicalanalysis = new ArrayList<MedicalAnalysis>();

    public MedicalReport() {
    }

    
    public void AddDoctor(String DoctorName)
    {
        ArrayOfDoctor.add(DoctorName);
 
    }
    public void AddMedicine(String NameOfMedicine)
    {
        Medicine.add(NameOfMedicine);
 
    }
     public void AddXray(XRay X)
    {
        xray.add(X);
 
    }
    public void AddMedicalAnalysis(MedicalAnalysis M)
    {
        medicalanalysis.add(M);
 
    }
    
    public void print()
    {
       System.out.println("X - Ray\n");
       for(int i=0 ; i<xray.size();i++)
       {
           int x = i+1;
           System.out.println("\n\nX - Ray Number " +x );
           xray.get(i).Print();
           
       }
       System.out.println("\n\nMedical analysis");
       for(int i=0 ; i< medicalanalysis.size();i++)
       {
            medicalanalysis.get(i).Print();
           
       }
       System.out.println("\n\nMore\n");
       System.out.println("Doctors Names  : " + ArrayOfDoctor );
       System.out.println("Number Of Medicines = " + Medicine.size() );
       System.out.println("Medicines Names : " + Medicine );
       
       
    
    }
}
