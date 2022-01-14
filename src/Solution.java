


import java.util.*;
public class Solution
{
    // 4.-Elabore un método que simule el proceso de subir a un piso en un ascensor, donde el numero de
    // piso es ingresado por teclado.

    public static class Ejercicio4 {
        public int b;
        Scanner dato=new Scanner(System.in);
        public void subir(int b){
            System.out.println("Ingrese el numero de piso");
            b = dato.nextInt();
            for(int a=1;a<=b;a++){
                System.out.println(" sube al piso "+a);
            }
        }
        public static void main(String[]args){
            Ejercicio4 sub = new Ejercicio4();
            sub.subir( 0);
        }
    }
}
