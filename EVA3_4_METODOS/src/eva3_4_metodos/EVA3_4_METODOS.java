/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Mayor de 7 y 8 = " + buscarMayor(7, 8));
        System.out.println(buscarDiaSemana(5));
        
    }
    //Determinar el mayor de dos números
public static int buscarMayor(int num1, int num2){
    int resu;
    if(num1 > num2){
        resu = num1;
    }else{
        resu = num2;
    }
    return resu;
}
    //DETERMINAR EL DÍA DE LA SEMANA
public static String buscarDiaSemana(int buscar){
    Scanner cap = new Scanner(System.in);
    int nDia;
    System.out.println(buscar);
    nDia = cap.nextInt();
    switch(nDia){
    case 1: 
        return "Lunes";
    case 2:
        return "Martes";
    case 3:
        return "Miércoles";
    case 4:
        return "Jueves";
    case  5:
        return "Viernes";
    default:
        return "Dia no válido";
}
}
}

