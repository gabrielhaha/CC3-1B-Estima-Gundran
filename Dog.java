
package classesandobjects;

public class Dog {
    String name;
    int age;
    String breed;
    char gender;
    
    public void setName(String dogName){
        name= dogName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int dogAge){
        age= dogAge;
    }
    public int getAge(){
        return age;
    }
    public void setBreed(String dogBreed){
        breed = dogBreed;
    }
    public String getBreed(){
        return breed;
    }
    public void setGender(char dogGender){
        gender = dogGender;
    }
    public char getGender(){
        return gender;
    }
    
}
