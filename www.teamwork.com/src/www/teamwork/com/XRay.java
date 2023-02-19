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
public class XRay extends INFO {
    
    private String XRayType;
    private String XRayComment;

    public XRay() {
    }

    public XRay(String XRayType, String XRayComment) {
        this.XRayType = XRayType;
        this.XRayComment = XRayComment;
    }

    public XRay(String XRayType, String XRayComment, String Reson, String Result) {
        super(Reson, Result);
        this.XRayType = XRayType;
        this.XRayComment = XRayComment;
    }

    public XRay(String XRayType, String XRayComment, String Reson, String Result, String date) {
        super(Reson, Result, date);
        this.XRayType = XRayType;
        this.XRayComment = XRayComment;
    }
    

    public String getXRayType() {
        return XRayType;
    }

    public void setXRayType(String XRayType) {
        this.XRayType = XRayType;
    }

    public String getXRayComment() {
        return XRayComment;
    }

    public void setXRayComment(String XRayComment) {
        this.XRayComment = XRayComment;
    }
    
    public void Print()
    {
        
       
        System.out.println("\nDate : " + getDate());
        System.out.println("\nReson : " + getReson());
        System.out.println("\nX-Ray Type : " + getXRayType());
        System.out.println("\nResult : " + getResult());
        System.out.println("\nX-Ray Comment : " + getXRayComment());
      
    }
    
}
