
import java.util.Scanner;

public class DemoArray3 {
	
	public static void main(String[] args) {
		int arr[] = new int [10];
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un valor");
        int v = entrada.nextInt();
        int i=0;
        
        while(v!=0 && 1<10 ) {
        	arr[i++] = v;
        	System.out.println("Introduzca un valor");
        	v = entrada.nextInt();
        }
        for (int j=0; j<i;j++) {
        	System.out.println(arr[j]);
        }
}
}