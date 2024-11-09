/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_return;

/**
 *
 * @author invitado
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Invocar o llamar al método
        //SI REGRESA RESULTADOS, TENEMOS DOS OPCIONES
        //HACER ALGO CON EL VALOR}
            //GUARDARLO Y USARLO VARIAS VECES
        int valor;
        valor = sumarDosEnteros(100, 50);
        System.out.println("Resultado = " + valor);
        //USARLO UNA VEZ
        System.out.println("Resultado = " + sumarDosEnteros(100, 50));
       //IGNORAR EL VALOR
        sumarDosEnteros(100, 50);
    }
    //SUMAR DOS ENTEROS
    public static int sumarDosEnteros(int num1, int num2){
	//int resu;
	int resu;
	resu = num1 + num2;
	return  resu;
}
    
}
