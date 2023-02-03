package myapp;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOMain {

    public static void main(String[] args){

        for (String a: args){
            System.out.printf(">>> %s\n", a);
        }

        //Get a reference to the file
        Path p = Paths.get(args[0]);

        //Get the actual file object
        File f = p.toFile();

        System.out.printf("Exists? %b\n", f.exists());
        System.out.printf("Is file? %b\n", f.isFile());
        System.out.printf("Is directory? %b\n", f.isDirectory());
        System.out.printf("Can read? %b\n", f.canRead());
        System.out.printf("Get full path %s\n", f.getAbsolutePath());




    }
    
}
