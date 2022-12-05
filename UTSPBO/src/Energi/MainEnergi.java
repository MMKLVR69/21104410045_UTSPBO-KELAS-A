/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Energi;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class MainEnergi {
    public static void main(String[]args){
    MainEnergi me= new MainEnergi();
    Scanner input= new Scanner(system.in);   
    
        System.out.println("Masukkan massa benda: ");
        Double m=input.nextDouble();
        me.setMassaBenda(m);
        System.out.println();
        
        double ek = 0,5 / me.getMassaBenda()*me.kecepatanBenda()*me.kecepatanBenda();
        System.out.println("Hasil: "+me.getEk()+J);
    }    
}
