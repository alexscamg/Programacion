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
                var pi = 3.1416;
       		Scanner sc = new Scanner(System.in);
		double a,r; // área y radio
		System.out.print("Introduce el radio de un circulo: ");//
		var radio = sc.nextDouble();//leemos o pedimos el radio
		var area = pi*(radio*radio); // calculamos el area del circulo
		System.out.println("El area de una circunferencia de radio " + radio + " es: " + area);//imprimimos el resultado
	

}
    }

