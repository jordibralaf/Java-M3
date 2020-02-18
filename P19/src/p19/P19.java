//Author: Jordi Brasó Lafuente
package p19;

import java.util.Scanner;


public class P19 {

    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
       
   keyboard.useDelimiter("\n");
        
        int option =-1;
       

        while( option !=0){
            userMenu();
            option = keyboard.nextInt();
        switch (option) {//inicio switch
        case 1:
        p1();
        break;
        
        case 2:
        p2();
        break;
        
        case 3:
        p3();
        break;
        
        case 4:
        p4();
        break;
        
        case 5:
        p5();
        break;
        
        case 6:
        p6();
        break;
        
        case 7:
        p7();
        break;
        
        case 8:
        p8();
        break;
        
        case 9:
        p9();
        break;
        
        case 10:
        p10();
        break;
        
        default: System.out.println("Invalid Option"); 
    }//switch final
        }
   
    }
    
    private static void userMenu(){
        System.out.println("");
        System.out.println("Choose one exercise:");
        System.out.println("Exercise 1");
        System.out.println("Exercise 2");
        System.out.println("Exercise 3");
        System.out.println("Exercise 4");
        System.out.println("Exercise 5");
        System.out.println("Exercise 6");
        System.out.println("Exercise 7");
        System.out.println("Exercise 8");
        System.out.println("Exercise 9");
        System.out.println("Exercise 10");
        System.out.println("Insert 0 to exit");
        System.out.print("\nYour asnwer: ");
    }
    
    private static float p1(){

        System.out.print("Inserta una cantidad: ");
        int cantidad= keyboard.nextInt();
        float converter = (float) cantidad;
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
}
    
     private static double p2(){
         
         System.out.print("Inserta una cantidad: ");
        int cantidad= keyboard.nextInt();
        double converter = (double) cantidad;
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
     }
    
     private static String p3(){
        System.out.print("Inserta una cantidad: ");
        int cantidad= keyboard.nextInt();
       String converter = Integer.toString(cantidad);
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
     }
     
     private static int p4(){
        System.out.print("Inserta una cantidad: ");
        String cantidad= keyboard.next();
        int converter = Integer.parseInt(cantidad);
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
     }
     
     private static int p5(){
        System.out.print("Inserta una cantidad: ");
        float cantidad= keyboard.nextFloat();
        int converter = (int) cantidad;
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
     }
     
     private static String p6(){
        System.out.print("Inserta una cantidad: ");
        float cantidad= keyboard.nextFloat();
        String converter = Float.toString(cantidad);
        
        System.out.println(cantidad + "€ = " + converter + "x");
        
        return converter;
     }
     
     private static void p7(){
       System.out.println("Introduce un caracter: ");
        String aux = keyboard.next();
        char letra = aux.charAt(0);
        int a = (int) letra;
        System.out.println("Equivalente en entero = " + a);
        System.out.println("Equivalente en binario = " + Integer.toBinaryString(a));;
     }
     
     private static String p8(){
         System.out.print("Introduce un caracter: ");
        String aux = keyboard.next();
        char letra = aux.charAt(0);
        int a = (int) letra;
        
        System.out.println("Equivalente en binario = " + Integer.toBinaryString(a));;
        
        return Integer.toBinaryString(a);
     }
     
     private static char p9(){
         
         System.out.print("Introduce un caracter: ");
         int cantidad = keyboard.nextInt();
         char converter='a'; 
         
         if(cantidad<=255&&cantidad>=0){
            converter = (char) cantidad;
            System.out.println("Equivalente en char = " + converter);
            
         }
         else{
             System.out.println("Tiene que ser de 0 a 255");
         }
         
         return converter;
     }
     
     private static void p10(){
         
        char letra=0;
   for(int i=0; i<=255 ; i++ )
        System.out.println("El codigo ASCII de la letra " + 
                            letra++ + " es " + i);  
        
     }
}
