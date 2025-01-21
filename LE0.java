/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Juet {

     String name;
     int age;
     String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    public static void main(String[] args) {
        Juet person = new Juet();
        person.setName("Dushyant singh raghuwanshi");
        person.setAge(20);

        System.out.println(" "+ person.getName());
        System.out.println(" "+ person.getAge());
    }
}
