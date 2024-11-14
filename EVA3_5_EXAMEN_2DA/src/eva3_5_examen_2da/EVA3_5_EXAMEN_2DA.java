/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        int jugada;
        int resuJug;
        do{
            resu = pedirJugada("Introduce tu jugada (1- Piedra, 2- Papel, 3- Tijera, 0- Salir");
            jugada = generarJugadaComp();
            System.out.println(jugada);
            resuJug = evaluarPartida(resu, jugada);
            System.out.println(resuJug);
        }while (resu != 0);
        
        
    }
    //PEDIR DATOS AL USUARIO
    public static int pedirJugada(String mensaje){
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = cap.nextInt();
        return seleccion;    
    }
    //GENERAR LAJUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int jugada;
        double valor = Math.random();
        //¿CÓMO GENERAMOS LA JUGADA?
        if((valor >= 0) && (valor < 0.3))
            jugada = PIEDRA; 
        else if((valor >= 0.3) && (valor < 0.6))
            jugada = PAPEL; 
        else 
            jugada = PAPEL;
        return jugada;
    }
    //EVALUAR LA JUGADA
    public static int evaluarPartida(int jugadaUsu, int jugadaComp){
        int resu; //0- Empate, 1- gana, 2 - Pierde
        resu = EMPATE;
        if((jugadaUsu == 1) && (jugadaComp == 1))
            resu = EMPATE;
        else if((jugadaUsu == PIEDRA) && (jugadaComp == PAPEL))
            resu = PIERDE;
        else if((jugadaUsu == PIEDRA) && (jugadaComp == TIJERA))
            resu = GANA;
        else if((jugadaUsu == PAPEL) && (jugadaComp == PIEDRA))
            resu = GANA;
        else if((jugadaUsu == PAPEL) && (jugadaComp == PAPEL))
            resu = EMPATE;
        else if((jugadaUsu == PAPEL) && (jugadaComp == TIJERA))
            resu = PIERDE;
        else if((jugadaUsu == TIJERA) && (jugadaComp == PIEDRA))
            resu = PIERDE;
        else if((jugadaUsu == TIJERA) && (jugadaComp == PAPEL))
           resu = GANA;
        else
            resu = EMPATE;
        return resu;
    }
    
}
