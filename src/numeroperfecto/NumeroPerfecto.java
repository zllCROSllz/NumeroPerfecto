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
        for(i=7;i <= rango;i++){      
            suma = 0;
            for(int j = 1;j < i;j++){                             
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
          if(i == suma){                          
             System.out.println(i);
          }
        }
    }
}