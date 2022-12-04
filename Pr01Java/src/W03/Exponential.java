
import static java.time.Clock.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FarrelAgiaRahmana
 * TI-A
 */
public class Exponential {
    //konstruktor
    //null param
    public Exponential() {
        System.out.println("ini constructor default");
    }

    public Exponential(double hasil) {
        System.out.println("ini konstruktor dengan 1 param");
    }
    
    
    public double hasil;
    
    public static void main(String[] args) {
        Exponential exponential =new Exponential();
        //panggil method
        //tanpa param
        exponential.pangkat();
        exponential.showhasil();
        //dengan 2 param
        exponential.pangkat(2,4);
        exponential.showhasil();
        
        //Exponential exponential = new Exponential();
        //Exponential exponential2 = new Exponential(hasil:2);      
    }
        //method
    private double pangkat()
    {
        return hasil =Math.pow(5, 2);
    }
    private void showhasil()
    {
        System.out.println("hasil pangkat adalah "+hasil);
    }
    private double pangkat(int x, int y)
    {
        return hasil =Math.pow(x, y);
    }
}
