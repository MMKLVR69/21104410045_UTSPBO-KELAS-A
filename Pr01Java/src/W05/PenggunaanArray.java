/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W05;

import org.w3c.dom.css.Counter;

/**
 *
 * @author FarrelAgiaRahmana
 * TI-A
 */
public class PenggunaanArray
{
    public static void main(String[] args)
    {
        String cobaArray[][] = new String[2][3];
        int counter = 0;
       //perulangan for 
        for(int i=0; i<2; i++
        {
            //perulangan bersarang
            for(int j=0;j<3; j++
            {
                //panggil array
                //convert biar tidak eror string ke int
                //String.valueOf(diisi counter)
                cobaArray[i][j]= String.valueOf(counter);
                counter++;
            }
        }
        //menampilkan array
        for(int i=0; i<2; i++){
            for(int j=0;j<3; j++){
                   System.out.println(cobaArray[i][j]);
            }
            System.out.println("");
    }
}
