/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_matriz;

/**
 *
 * @author invitado
 */
public class EVA3_6_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = new int[5];//ARREGLO UNIDIMENSIONAL
        //ARREGLO DE DOS DIMENSIONES --> MATRIZ: HOJA DE EXCEL
        int[][] matriz = new int[3][3];
        matriz[0][0] = 100;//PRIMER POSICIÓN
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;//ÚLTIMA POSICIÓN
        //IMPRIMIR MATRIZ:
        for (int i = 0;i < 3; i++){//PRIMER DIMENSIÓN: FILAS
            for (int j = 0; j < 3; j++){//2DA DIM: COLUMNAS
                System.out.print("[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
    }
    
}
