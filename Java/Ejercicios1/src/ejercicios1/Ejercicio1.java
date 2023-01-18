/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alejandro Sanchez
 */
public class Ejercicio1 {
    public static void main (String args[]){
        var numeroPi = 3.1416;
        Scanner consola = new Scanner (System.in);
        System.out.println("Introduce el radio del circulo:");
        var radio = consola.nextInt();
        var calculo = numeroPi * radio * (int)2;
        
        System.out.println(calculo);
    }
}
