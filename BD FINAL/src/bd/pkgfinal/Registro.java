/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.pkgfinal;

/**
 *
 * @author jruiz
 */
public class Registro implements Comparable<Registro> {
    String resto;
    int numID;

    public Registro(int numID, String resto) {
        this.numID=numID;
        this.resto = resto;
        
    }

    @Override
    public String toString() {
        return "C"+ numID +" "+ resto ;
    }

    public String getResto() {
        return resto;
    }

    public int getNumID() {
        return numID;
    }
    
    
    @Override
    public int compareTo(Registro o) {
        if (this.numID != o.getNumID()) {
            return this.numID - o.getNumID();
        }
        return this.resto.compareTo(o.getResto());
    }
}
   
    

