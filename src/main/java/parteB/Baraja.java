/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

import daw.Naipe;
import daw.Palos;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class Baraja {

    public static Naipe[] array = new Naipe[40];

    public Baraja() {

        for (int z = 0; z < 10; z++) {
            array[z] = new Naipe(z + 1, Palos.Oro);
        }
        for (int z = 0; z < 10; z++) {
            array[z + 10] = new Naipe(z + 1, Palos.Copa);
        }
        for (int z = 0; z < 10; z++) {
            array[z + 20] = new Naipe(z + 1, Palos.Espadas);
        }
        for (int z = 0; z < 10; z++) {
            array[z + 30] = new Naipe(z + 1, Palos.Bastos);
        }

        this.array = array;
    }

    public Naipe[] getArray() {
        return array;
    }

    public void setArray(Naipe[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("naipe{");
            if (array[i].getNumero() == 8) {
                sb.append("numero=").append("sota");
            } else if (array[i].getNumero() == 9) {
                sb.append("numero=").append("caballo");
            } else if (array[i].getNumero() == 10) {
                sb.append("numero=").append("Rey");
            } else {
                sb.append("numero=").append(array[i].getNumero());

            }

            sb.append(", palo=").append(array[i].getPalo());
            sb.append('}');
            System.out.println("");
        }
        return sb.toString();
    }

    public  void barajar(int movimientos) {

        for (int i = 0; i < movimientos; i++) {
            Random r = new Random();
            int cartaAMover = r.nextInt(39);
            int otraCarta = r.nextInt(39);
            Naipe cartaTemporal= new Naipe(array[cartaAMover].getNumero(), array[cartaAMover].getPalo());
            array[cartaAMover].setNumero(array[otraCarta].getNumero());
            array[cartaAMover].setPalo(array[otraCarta].getPalo());
            array[otraCarta].setNumero(cartaTemporal.getNumero());
            array[otraCarta].setPalo(cartaTemporal.getPalo());
        }

    }
}
