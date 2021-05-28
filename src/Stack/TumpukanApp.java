/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Fajar Sidiq
 */
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println("");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println("");
        tumpukan.pop();
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println("");
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println("");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai top = "+nilai);
        System.out.println(" ");
        
        
    }
}
