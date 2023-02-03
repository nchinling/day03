package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOMain {

    public static void main(String[] args) throws IOException {

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
        System.out.printf("Full path %s\n", f.getAbsolutePath());


        //Open the file for reading
        InputStream is = new FileInputStream(f);
        OutputStream os = new FileOutputStream("Copy of %s".formatted(args[0]));
        
        //Fill the buffer with data
        byte[] buffer = new byte[1024]; //1k buffer
        int size = 0;

        //READING BUFFERS

        while ((size = is.read(buffer))>0){
            os.write(buffer, 0, size);
        // }
        // while(size >= 0){
        //     //read number of buffer
        //     size= is.read(buffer);
        //     if(size > 0)
        //     os.write(buffer, 0, size);
        // }

    os.flush();
    os.close();

    is.close();

    }
    
}

}
