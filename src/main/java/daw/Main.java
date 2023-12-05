/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;


/**
 *
 * @author daniel
 */
public class Main {

//    nuevo proyecto
//clase baraja
//	atributo array de naipes 
//	constructor por defecto que añade todos los naipes de la baraja
//	
//	
//main para crear naipes sueltos
//	y crear baraja y mostrar todas las cartas  
//      sacar cartas aleatoriamente hata que salga la carta que se solicita al ususario
    
    //prueba git 
    //prueba git 2
    public static void main(String[] args) {
            
        Naipe carta;
        Naipe ReyOros= new Naipe(10, Palos.Oro);
        
         
        
          do{
              carta = new Naipe();
              System.out.println(carta);
          }while(!((carta.getNumero()==ReyOros.getNumero())&&carta.getPalo()==ReyOros.getPalo()));
        
//        Naipe[] pruebaArray = new Naipe[50];
//
//        for (int i = 0; i < pruebaArray.length; i++) {
//            pruebaArray[i] = new Naipe();
//
//        }
//        for (int i = 0; i < pruebaArray.length; i++) {
//            System.out.println(pruebaArray[i]);
//
//        }
//     
//        try{
//        Naipe pruebaNaipe = new Naipe( 7, Palos.Oro);
//        System.out.println("prueba naipe es : " + pruebaNaipe);
//        }catch (IllegalArgumentException IAE){
//            System.out.println(IAE.getMessage());
//        }
//        
//       Ba
           

        
        System.out.println("Mostrar una baraja entera: ");
     
        parteB.Baraja nuevaBaraja = new parteB.Baraja();
        
         System.out.println(nuevaBaraja);
    }
}
