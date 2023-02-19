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
enum Type{Celluer_And_Chemical_Analysis , Diagnostic_Imaging , Genetic_Testing , Measurement , Physical_And_Visual_EXamination};
public class MedicalAnalysis extends INFO {
    Type type;
    String Comment;

    public MedicalAnalysis() {
    }

    public MedicalAnalysis(Type type, String Comment, String Reson, String Result) {
        super(Reson, Result);
        this.type = type;
        this.Comment = Comment;
    }

    public MedicalAnalysis(Type type, String Comment, String Reson, String Result, String date) {
        super(Reson, Result, date);
        this.type = type;
        this.Comment = Comment;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    
    
    public void Print()
    {
        System.out.println("\nDate : " + getDate());
        System.out.println("\nReson : " + getReson());
        System.out.println("\nMedical Analysis Type : " + getType());
        System.out.println("\nResult : " + getResult());
        System.out.println("\nMedical Analysis Comment : " + getComment());
    
    
    }
    
    
}
