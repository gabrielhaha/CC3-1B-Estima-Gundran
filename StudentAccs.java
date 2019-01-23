
package studentaccs;

public class StudentAccs {
    
    
    public static void main(String[] args) {
        studentinfo student = new studentinfo("CITCS", "2nd Term 2018-2019");
        System.out.println("================================");
        student.setId("18-7189-310");
        student.setFamilyname("Estima");
        student.setFirstname("Gabriel");
        student.setAcademicprogram("BSIT");
        student.setTrack("Net. Sec.");
        student.print();
    }
}
