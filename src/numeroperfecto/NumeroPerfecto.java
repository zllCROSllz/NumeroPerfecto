package numeroperfecto;

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        int suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el rango de numeros que deseas \ndesde");
        int i = entrada.nextInt();
        System.out.println("hasta");
        int rango = entrada.nextInt();
        
        System.out.println("Números perfectos entre "+i+ " y " +rango);
        for(i=7;i <= rango;i++){      // i es el número que vamos a comprobar
            suma = 0;
            for(int j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1                          
                 if(i % j==0){
                    suma = suma + j; // si es divisor se suma
                 }
            }
          if(i == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
             System.out.println(i);
          }
        }
    }
}