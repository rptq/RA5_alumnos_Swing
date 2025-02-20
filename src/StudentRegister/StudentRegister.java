/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentRegister;

import java.io.*;
import java.lang.System.Logger;
import java.util.*;
import java.util.logging.Level;
import model.FileManager;
import static model.FileManager.*;
import model.Student;

/**
 *
 * @author RobertTerolLacasta
 */

public class StudentRegister {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Student> students = new ArrayList<>();

  

    public static void main(String[] args) {
        
        initFiles();
        filetoArray();
        menu();

    } 
    /**
     *muestra el menu y llama a metodos
     */
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String opc;
        
        do {
            System.out.println("""
                           Menu:
                           1 - Add new student
                           2 - Show student list
                           3 - Delete student from register
                           4 - Search student by DNI
                           
                           0 - exit
                           """);
            opc = sc.nextLine();

            switch (opc) {
                case "1":
                    newstudent();
                    break;
                case "2":
                    showstudents();
                    break;
                case "3":
                    deletestudent();
                    break;
                case "4":
                    searchStudent();
                    break;
                case "0":

                    break;
                default:
                    break;
            }
        } while (!opc.equals("0"));

    }
    
    public static void newstudent() {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese el nombre del alumno");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido del alumno");
        String surname = sc.nextLine();
        System.out.println("Ingrese la edad del alumno");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el curso del alumno");
        String course = sc.nextLine();
        System.out.println("Ingrese el DNI del alumno");
        String dni = sc.nextLine();

        Student stdnt = new Student(name, surname, age, course, dni);
        
        boolean studentexists = false;
        
        for(Student existingstudent : students){
            if (stdnt.getDni().equalsIgnoreCase(existingstudent.getDni())){
                studentexists=true;
            }
        }
        if (!studentexists){
        
        students.add(stdnt);
        System.out.println("Added " + name + " " + surname);
        
        try{
        FileWriter fw = new FileWriter(registerFile);

        BufferedWriter bw = new BufferedWriter(fw);

        for (var student : students) {
            bw.write(student.tostringFormat());
        }

        bw.flush();
        bw.close();
        } catch (IOException e) {
                System.err.println("No se ha podido crear el archivo.");
            }
        }
        else{
            System.out.println("Ya hay un alumno registrado con el mismo dni. \n");
        }
        
    }

    public static void showstudents() {
        for (var student : students) {
            System.out.println(student.toString());
        }

    }

    public static void deletestudent() {
        Scanner sc = new Scanner(System.in);
        String inputdni = null;
        for (var student : students) {
            System.out.println(student.toString());
        }
        
        System.out.println("Cual es el dni del estudiante que quieres eliminar?");
        
        inputdni = sc.nextLine();
        boolean dniexists = false;
        
        for(Student selectedStudent : students){
            if (selectedStudent.getDni().equals(inputdni)) {
                dniexists = ture;
                students.remove(selectedStudent);
                try{
        FileWriter fw = new FileWriter(registerFile);

        BufferedWriter bw = new BufferedWriter(fw);

        for (var student : students) {
            bw.write(student.tostringFormat());
        }

        bw.flush();
        bw.close();
        
                    System.out.println("Estudiante eliminado \n");
        } catch (IOException e) {
                System.err.println("No se ha podido realizar la operacion.\n");
            }
            }
            else if(!dniexists){
            
                System.out.println("El alumno con el dni indicado no existe \n");
                break;
            }
            
            
        }
        
        
    }

    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        String inputdni = null;
        
        System.out.println("Cual es el dni del estudiante que quieres buscar?");
        
        inputdni = sc.nextLine();
        boolean dniexists = false;
        
        for(Student selectedStudent : students){
            
            if (selectedStudent.getDni().equals(inputdni)) {
                System.out.println(selectedStudent.toString() + "\n");
            dniexists = true;
            }
            
            else if(!dniexists){
                System.out.println("El alumno con el dni indicado no existe \n");
                break;
            }
        }
    }

}
