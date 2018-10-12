/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concusemana1;

/**
 *
 * @author Manuel
 */
public class Clase1 {
    public static int[]arrayAleatorio(int size){
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=(int)(Math.random()*100);
        }
        return ar;
    }
    public static void imprimir(int ar[]){
        String imp=" ";
        for(int i=0;i<ar.length;i++){
            imp=imp+" "+ar[i];
        }
        System.out.println(imp);
    }
 
    public static void main(String[]args){
         imprimir(arrayAleatorio(5));
    }
    
}
