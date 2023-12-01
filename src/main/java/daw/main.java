/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

/**
 *
 * @author daniel
 */
public class main {

//    nuevo proyecto
//clase baraja
//	atributo array de naipes 
//	constructor por defecto que añade todos los naipes de la baraja
//	
//	
//main para crear naipes sueltos
//	y crear baraja y mostrar todas las cartas  
//      sacar catas aleatoriamente hata que salga la carta que se solicita al ususario
    public static void main(String[] args) {

        naipe[] pruebaArray = new naipe[50];

        for (int i = 0; i < pruebaArray.length; i++) {
            pruebaArray[i] = new naipe();

        }
        for (int i = 0; i < pruebaArray.length; i++) {
            System.out.println(pruebaArray[i]);

        }
        
    }
}
