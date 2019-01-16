
package classesandobjects;
import java.util.Scanner;
public class ClassesandObjects {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dog gong= new Dog();
        
        System.out.println("Enter dog1 name: ");
        String name = sc.next();
        gong.setName(name);
        String dog1= gong.getName();
        
        
        
        System.out.println("Enter dog1 age: ");
        int age = sc.nextInt();
        gong.setAge(age);
        int age1 = gong.getAge();
        
        
        System.out.println("Enter dog1 breed: ");
        String breed = sc.next();
        gong.setBreed(breed);
        String breeds= gong.getBreed();
        
        
        System.out.println("Enter dog1 gender: ");
        char g = sc.next().charAt(0);
        gong.setGender(g);
        char gender= gong.getGender();
        
        System.out.println("===============================");
        System.out.println("Your dog1's attribute:  ");
        System.out.println("Dog1 name: " + dog1);
        System.out.println("Dog1 age: " + age1);
        System.out.println("Dog1 breed: " + breeds);
        System.out.println("Dog1 gender: " + gender);
        System.out.println("===============================");
    
    
        Dog las= new Dog();
        
        System.out.println("Enter dog2 name: ");
        String name1 = sc.next();
        las.setName(name1);
        String dog2= las.getName();
        
        
        
        System.out.println("Enter dog2 age: ");
        int Age = sc.nextInt();
        gong.setAge(Age);
        int ages = gong.getAge();
        
        
        System.out.println("Enter dog2 breed: ");
        String Breed = sc.next();
        gong.setBreed(Breed);
        String breed1= gong.getBreed();
        
        
        System.out.println("Enter dog2 gender: ");
        char G = sc.next().charAt(0);
        gong.setGender(G);
        char genders= gong.getGender();
        
        System.out.println("===============================");
        System.out.println("Your 2nd dog's attribute:  ");
        System.out.println("Dog2 name: " + dog2);
        System.out.println("Dog2 age: " + ages);
        System.out.println("Dog2 breed: " + breed1);
        System.out.println("Dog2 gender: " + genders);
        System.out.println("===============================");
    }
}
