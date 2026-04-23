<<<<<<< HEAD
// STUDENT MANAGMENT SYSTEM
import java.util.Scanner;

class Students{
    int id;
    int marks;
    String name;
     
    Students(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of students :");
        int list = sc.nextInt();
        
        Students[] s = new Students[list];

        for(int i = 0; i < list; i++){
            System.out.println("Enter id:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();
            
            System.out.println("Enter marks:");
            int marks = sc.nextInt();

            s[i] = new Students(id, name, marks);

        }

        System.out.println("\n-----STUDENTS LIST -----");
        for(int i = 0; i < list; i++){
            System.out.println(
                s[i].id + " " + s[i].name + " " + s[i].marks
            );
        }
        
        

    }
    
=======
class Main {
    public static void main(String[] args){
        System.out.println("iam learning java");
    }
>>>>>>> 05d1e6d526f8fd7e1d6c45e9a8bfe318c4e9df9f
}
