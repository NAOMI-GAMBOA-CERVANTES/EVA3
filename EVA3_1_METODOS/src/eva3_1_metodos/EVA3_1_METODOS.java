/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // INVOCAR EL MÉTODO, LLAMADA A MÉTODO --> USARLO
        imprimirMensaje("HOLA MUNDO!");
    }
    
    //Declaración del método
    //MODIFICADORES
            //VALOR RETORNO
                //NOMBRE (empieza en min)
                                //PARÁMETROS (OPCIONALES)
    //SON ÚTILES PARA REUTILIZAR CÓDIGO
    public static void imprimirMensaje(String mensaje){
        //Cuerpo del método
        System.out.println("Tu mensaje: " + mensaje);
    }
}
