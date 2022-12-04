/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package01;

/**
 *
 * @author x
 */
public class Mobil
{
    
    String pabrikan;
    String tipe;
    String warna;
    
    public static void main(String[]args)
    {
        //untuk membuat objek  dari class disebut dengan instance
        //inisiasi
        
        Mobil toyota=new Mobil();
        toyota.pabrikan= "Avanza";
        toyota.tipe="TRD";
        toyota.warna="abu-abu";
        System.out.println("Toyota pabrikan : "+toyota.pabrikan);
        System.out.println("Toyota tipe : "+toyota.tipe);
        System.out.println("Toyota warna : "+toyota.warna);
        
        toyota.maju();
        toyota.mundur();
        toyota.parkir();
        
        Mobil honda=new Mobil();
        honda.pabrikan= "Jazz";
        honda.tipe="TRD";
        honda.warna="merah";

        System.out.println("Honda pabrikan : "+honda.pabrikan);
        System.out.println("Honda tipe : "+honda.tipe);
        System.out.println("Honda warna : "+honda.warna);
        
        honda.maju();
        honda.mundur();
        honda.parkir();
    }
     
       void  maju(){
        System.out.println("bergerak maju");
    }
       void mundur(){
        System.out.println("bergerak mundur");
    }
       void parkir(){
        System.out.println("bergerak parkir");
    }    
}
