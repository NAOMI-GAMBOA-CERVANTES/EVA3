/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("Introduce tu nombre");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad = capturarEdad("Introduce tu edad");
        double salario = capturarSalario("Introduce tu Salario");

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        
    }
    public static String capturarTexto(String mensaje){
        Scanner cap = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = cap.nextLine();
        return texto;
    }
    public static int capturarEdad(String mensaje){
        Scanner cap = new Scanner(System.in);
        int edad;
        System.out.println(mensaje);
        edad = cap.nextInt();
        return edad;
    }
    public static double capturarSalario(String mensaje){
        Scanner cap = new Scanner(System.in);
        double sal;
        System.out.println(mensaje);
        sal = cap.nextDouble();
        return sal;
    }

}
