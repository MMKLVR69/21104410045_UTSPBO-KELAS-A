/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package WO4;

/**
 *
 * @author FarrelAgiaRahmana
 * TI-A
 */
public class Warung {

    private static Warung warung;
    //variabelisasi type data
    String makan,minum;
    //Konstruktor
    //alt+insert
    //right click+inser code
    //getter & satter

    public String getMakan() {
        return makan;
    }

    public void setMakan(String makan) {
        this.makan = makan;
    }

    public String getMinum() {
        return minum;
    }

    public void setMinum(String minum) {
        this.minum = minum;
    }
    
        
    public static void main(String[] args)
    {
        Warung.warung =new Warung();
        warung.setMakan (makan : "Nasi goreng");
        warung.setMinum (minum : "Es teh gelas");
        
        System.out.println("Makanannya : "+warung.getMakan());
        System.out.println("Mimumnyanya : "+warung.getMinum());
    }

}
