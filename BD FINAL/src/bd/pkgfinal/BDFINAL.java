/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bd.pkgfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jruiz
 */
public class BDFINAL {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Registro> misRegistros = new ArrayList<>();
        // BufferedReader object for file1.txt
        
        try ( // PrintWriter object for file3.txt
                PrintWriter pw = new PrintWriter("Resultados.txt")) {
            // BufferedReader object for file1.txt
            BufferedReader br = new BufferedReader(new FileReader("AlumnosIS.txt"));
            String line = br.readLine();
            
            // loop to copy each line of file1.txt to file3.txt
            while (line != null) {
                
                Registro r = new Registro(Integer.parseInt(line.substring(1, 5)), line.substring(5, line.length()));
                misRegistros.add(r);
                line = br.readLine();
            }
            
            br = new BufferedReader(new FileReader("AlumnosBD.txt"));
            line = br.readLine();
            
            // loop to copy each line of file2.txt to  file3.txt
            while (line != null) {
                
                Registro a = new Registro(Integer.parseInt(line.substring(1, 5)), line.substring(5, line.length()));
                misRegistros.add(a);
                line = br.readLine();
            }
            
            
            Collections.sort(misRegistros);
            
            for (Registro r : misRegistros) {
                pw.println(r);
            }
            
            pw.flush();
            
            // closing resources
            br.close();
        }

        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}


    
    

