
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author RobertTerolLacasta
 */
public class FileManager {

    public static String mainroute = System.getProperty("user.dir");

    public static String separator = File.separator;

    public static String folderRoute = mainroute + separator + "files";

    public static String fileRoute = folderRoute + separator + "register.txt";
    public static File registerFile;
    public static File filesfolder;

    /**
     *
     */
    public static void initFiles() {

        filesfolder = new File(folderRoute);

        if (filesfolder.exists() == false) {
            filesfolder.mkdir();
        }

        registerFile = new File(fileRoute);
        if (!registerFile.exists()) {
            try {
                registerFile.createNewFile();
            } catch (IOException e) {
                System.err.println("No se ha podido crear el archivo.");
            }

        }

    }

    public static void filetoArray() {
        try {
            FileReader fr = new FileReader(registerFile);

            BufferedReader br = new BufferedReader(fr);

            String name = null;
            String surname = null;
            int edad = 0;
            String curso = null;
            String dni = null;
            String line = br.readLine();
            if (line == null) {
                System.out.println("archivo nulo");
            } else {
                do {

                    String[] parts = line.split(";");

                    name = parts[0];
                    surname = parts[1];
                    edad = Integer.parseInt(parts[2]);
                    curso = parts[3];
                    dni = parts[4];

                    Student stud = new Student(name, surname, edad, curso, dni);
                    StudentRegister.StudentRegister.students.add(stud);
                    line = br.readLine();
                } while (line != null);

            }
        } catch (IOException e) {
            System.err.println("No se ha podido crear el archivo.");
        }
    }
}
