/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa_ord_prac_3ra;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXA_ORD_PRAC_3RA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /**
     *
     * @param prom
     */
    
            int califs, valores[];
            int[] arreglo = new int [20];
            int numEst, est;
            Scanner cap = new Scanner (System.in);
            System.out.print("Ingrese el número de estudiantes: ");
            numEst = cap.nextInt();
            if (numEst <= 0){
                System.out.println("Numero inválido");
            }
            int i;
            for(i = 1; i <= numEst; i++){
                
                int calif;
                System.out.print("Ingrese la calificación del estudiante " + i + ": ");
                calif = cap.nextInt();
                if (calif > 100 || calif < 0){
                    System.out.println("Número inválido");
                
                }
                for (int j = 0; j >= numEst; j++){
                    double resu = 0;
                    double prome = 0;
                    int sum = 0;
                    sum = sum + j;
                    prome = prome + sum/numEst;
                    System.out.println("Promedio de calificaciones: " + prome);
                    //return resu;
                }
                
            }
            
                
                //method.obtenerCalificacionMasAlta();
                //obtenerCalificacionMasBaja();
                //Metodo 1:
                /*public static double calcularPromedio(double prom){
                //Arreglo
                //?????
                Scanner cap = new Scanner (System.in);
                int numEst;
                System.out.print("Ingrese el número de estudiantes: ");
                numEst = cap.nextInt();
                */
                
                
                
                //Metodo 2:
                /*public static void contar(double CalProm){
                    //Arreglo
                    for (int i = 0; i <= Calif; i++){
                    if (calif == prom || calif > prom){
                        System.out.println("Número de calificaciones mayores o iguales al promedio: " + i );
                    }
                */
                
                //Metodo 3:
                //------------------------------------------------------------
                /*public static void obtenerCalificacionMasAlta(double CalAlta){
                //???
                int numEst, est;
                Scanner cap = new Scanner (System.in);
                System.out.print("Ingrese el número de estudiantes: ");
                numEst = cap.nextInt();
                if (numEst <= 0){
                System.out.println("Número inválido");
                }
                int i;
                for(i = 1; i <= numEst; i++){
                
                int calif;
                System.out.print("Ingrese la calificación del estudiante " + i + ": ");
                calif = cap.nextInt();
                if (calif > 100 || calif < 0){
                    System.out.println("Número inválido");
                }
                if (calif > 90){
                    System.out.println("Calificacion más alta: " + calif);
                }
                }
                
            }
            //System.out.println("-------------------------------------------------");
            
            
            /*int suma = 0; 
                suma = calif + suma;    
            int prom = 1;
            if (calif == prom && calif > prom) {
                
            
            }5
            */ 

            //public static void calcularPromedio(int prom){
                
            //int arreglo[] = {}
            //arreglo.length
           
        }
        
}
    


