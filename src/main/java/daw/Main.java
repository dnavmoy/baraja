/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {

        Naipe carta;
        Naipe ReyOros = new Naipe(10, Palos.Oro);

        do {
            carta = new Naipe();
            System.out.println(carta);
        } while (!((carta.getNumero() == ReyOros.getNumero()) && carta.getPalo() == ReyOros.getPalo()));
        System.out.println("ha mostrado el rey de oros?\n");

        System.out.println("Mostrar una baraja entera: ");

        parteB.Baraja pruebaBaraja = new parteB.Baraja();

        System.out.println(pruebaBaraja);
        System.out.println("\n barajo 50 cartas");

        pruebaBaraja.barajar(50);
        System.out.println(pruebaBaraja);

        int sacarCartas = 15;

        System.out.println("saco " + sacarCartas + " cartas");
        Naipe[] cartasSacadas = new Naipe[sacarCartas];
        cartasSacadas = pruebaBaraja.sacar(sacarCartas);
        System.out.println("como queda la baraja: ");
        System.out.println(pruebaBaraja);

        System.out.println("\n las cartas sacadas:");
        for (int i = 0; i < cartasSacadas.length; i++) {
            System.out.println(cartasSacadas[i]);
        }

    }
}
