import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        int choice;
        boolean found = false;
        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Topper");
            System.out.println("7. Show Average Marks");
            System.out.println("8. Show Pass and Fail Count");
            System.out.println("9. Exit");
            System.out.print("Enter your choice :  ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter class: ");
                    String studentClass = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();

                    Student newStudent = new Student(name, age, studentClass, marks);
                    student.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (student.size() == 0) {
                        System.out.println("No students available 🤔!");
                    } else {
                        for (int i = 0; i < student.size(); i++) {
                            System.out.println("Name:"+ student.get(i).name);
                            System.out.println("Age:"+ student.get(i).age);
                            System.out.println("Class:"+ student.get(i).studentClass);
                            System.out.println("Marks:"+ student.get(i).marks);
                        }

                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    found = false;

                    for (int i = 0; i < student.size(); i++) {
                        if (searchName.equalsIgnoreCase(student.get(i).name)) {
                            Student foundStudent = student.get(i);
                            found = true;
                            System.out.println("Name: " + foundStudent.name);
                            System.out.println("Age: " + foundStudent.age);
                            System.out.println("Class: " + foundStudent.studentClass);
                            System.out.println("Marks: " + foundStudent.marks);
                            System.out.println("Student exist ✔️");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found! ");
                    }
                    break;

                case 4:

                    System.out.print("Enter student name : ");
                    String updateName = scanner.nextLine();

                    found = false;
                    for (int i = 0; i < student.size(); i++) {
                        if (updateName.equalsIgnoreCase(student.get(i).name)) {
                            Student updateStudent = student.get(i);
                            found = true;

                            System.out.println("1. Update Name");
                            System.out.println("2. Update Age");
                            System.out.println("3. Update Class");
                            System.out.println("4. Update Marks");
                            System.out.print("Enter your choice: ");
                            int updateChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (updateChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    String newName = scanner.nextLine();
                                    updateStudent.name = newName;
                                    System.out.println("Student updated successfully!");

                                    break;

                                case 2:
                                    System.out.print("Enter new age: ");
                                    int newAge = scanner.nextInt();
                                    scanner.nextLine();
                                    updateStudent.age = newAge;
                                    System.out.println("Student updated successfully!");

                                    break;

                                case 3:
                                    System.out.print("Enter new class: ");
                                    String newClass = scanner.nextLine();
                                    updateStudent.studentClass = newClass;
                                    System.out.println("Student updated successfully!");
                                    break;

                                case 4:
                                    System.out.print("Enter new marks: ");
                                    double newMarks = scanner.nextDouble();
                                    scanner.nextLine();
                                    updateStudent.marks = newMarks;
                                    System.out.println("Student updated successfully!");
                                    break;

                                default:
                                    System.out.println("invalid choise! ");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }

                    break;

                case 5:
                    System.out.print("Enter student name to delete: ");
                    String deleteName = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < student.size(); i++) {
                        if (deleteName.equalsIgnoreCase(student.get(i).name)) {
                            found = true;
                            student.remove(i);
                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }

                    break;



                case 6:
                    if (student.size() == 0){
                        System.out.println("No student available! ");

                    }else{
                        Student topper = student.get(0);
                        for (int i = 0 ; i < student.size(); i++){
                            if (student.get(i).marks > topper.marks){
                                topper = student.get(i);
                            }
                        }
                        System.out.println("Topper Student:");
                        System.out.println("Name: " + topper.name);
                        System.out.println("Age: " + topper.age);
                        System.out.println("Class: " + topper.studentClass);
                        System.out.println("Marks: " + topper.marks);
                    }
                    break;


                case 7:
                    if (student.size()==0){
                        System.out.println("No student available!");
                    }else{
                        double total = 0;
                        for (int i = 0 ; i < student.size(); i++){
                            total = total + student.get(i).marks;
                        }
                        double average = total /student.size();
                        System.out.println("Average marks:" + average);
                    }
                    break;


                case 8:

                    if (student.size()==0){
                        System.out.println("No student available!");
                    }else{
                        int passCount = 0;
                        int failCount = 0;
                        for (int i = 0; i < student.size(); i++){
                            if (student.get(i).marks >= 40){
                                passCount++;

                            }else{
                                failCount++;
                            }
                        }
                        System.out.println("pass count:"+ passCount);
                        System.out.println("fail count:"+ failCount);
                    }
                    break;



                case 9:
                    System.out.println("Exiting...");
                    break;




                default:
                    System.out.println("invalid choice! ");
            }


        } while (choice != 9);


        scanner.close();
    }
}
class Student {
    String name;
    int age;
    String studentClass;
    double marks;

    public Student(String name, int age, String studentClass, double marks) {
        this.name = name;
        this.age = age;
        this.studentClass = studentClass;
        this.marks = marks;
    }
}
