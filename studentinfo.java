
package studentaccs;

public class studentinfo {
    String university;
    String college;
    String term;
    
    public studentinfo(String college, String term){
        this.university = "U.C";
        this.college = college;
        this.term = term;
    }
    
    private String idnumber;
    private String familyname;
    private String firstname;
    private String academicprogram;
    private String track;
    
    
    public void setId(String Idnum){
        idnumber = Idnum;
    }
    public String getId(String Idnum){
        return idnumber;
    }
    public void setFamilyname(String Familyname){
        familyname = Familyname;
    }
    public String getFamilyname(String Famiyname){
        return familyname;
    }
    public void setFirstname(String Firstname){
        firstname = Firstname;
    }
    public String getFirstname(String Firstname){
        return firstname;
    }
    public void setAcademicprogram(String Academicprogram){
        academicprogram = Academicprogram;
    }
    public String getAcademicprogram(String Academicprogaram){
        return academicprogram;
    }
    public void setTrack(String Track){
        track = Track;
    }
    public String getTrack(String Track){
        return track;
    }
    
    public void print(){
        System.out.println(this.university + "\n" + this.college + "\n" + this.term + "\nStudent Information: "+ "\nID Number: "+ this.idnumber + "\nName: "+ this.familyname +","+ this.firstname + "\nAcademic Program: "+ this.academicprogram +" - " + this.track);
    }
}
