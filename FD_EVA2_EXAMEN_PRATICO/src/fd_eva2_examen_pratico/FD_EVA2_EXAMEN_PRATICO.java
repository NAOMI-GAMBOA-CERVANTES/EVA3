/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fd_eva2_examen_pratico;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class FD_EVA2_EXAMEN_PRATICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mov;
        Scanner cap = new Scanner(System.in);
        System.out.println("Piedra = 1, Papel = 2, Tijeras = 3");
        System.out.println("Seleccione su movimiento: ");
        mov = cap.nextInt();
        double comp = Math.random();
        System.out.println("Movimiento de la computadora: " + comp );
        while (comp == mov){
            System.out.println("EMPATE");
        }
        for (int i = 0; i <= 3; i++ ){
            if (mov > comp || mov == 3 && mov < 1){
                System.out.println("GANA USUARIO");
            }
            
            System.out.println("Ganados por la computadora: ");
            System.out.println("Ganados por el usuario: " + i);
            System.out.println("Empates: ");
           
        }
        
    }
    
}
