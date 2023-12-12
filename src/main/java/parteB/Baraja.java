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

    public static int TAMANO_BARAJA = 40;
    private Naipe[] array = new Naipe[TAMANO_BARAJA];

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

    }

    public Baraja(int tamano) {
        Naipe[] barajatamano = new Naipe[tamano];

        this.array = barajatamano;

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
            sb.append("\n naipe{");
            if (array[i] == null) {
                sb.append("numero=").append(" vacio");
            } else if (array[i].getNumero() == 8) {
                sb.append("numero=").append("sota");
            } else if (array[i].getNumero() == 9) {
                sb.append("numero=").append("caballo");
            } else if (array[i].getNumero() == 10) {
                sb.append("numero=").append("Rey");
            } else {
                sb.append("numero=").append(array[i].getNumero());

            }
            if (array[i] == null) {
                sb.append(", palo=").append(" null");
            } else {
                sb.append(", palo=").append(array[i].getPalo());
            }
            sb.append('}');

        }
        System.out.println("");
        return sb.toString();
    }

    public void barajar(int movimientos) {

        for (int i = 0; i < movimientos; i++) {
            Random r = new Random();
            int cartaInicial = r.nextInt(TAMANO_BARAJA);
            int posicionFinal = r.nextInt(TAMANO_BARAJA);
            Naipe cartaTemporal = new Naipe(array[cartaInicial].getNumero(), array[cartaInicial].getPalo());
            array[cartaInicial].setNumero(array[posicionFinal].getNumero());
            array[cartaInicial].setPalo(array[posicionFinal].getPalo());
            array[posicionFinal].setNumero(cartaTemporal.getNumero());
            array[posicionFinal].setPalo(cartaTemporal.getPalo());
        }

    }

    public Naipe[] sacar(int numCartas) {

        Random r = new Random();
        if (numCartas < 1 || numCartas > 40) {
            daw.Naipe[] cartasSacadas = new daw.Naipe[0];
            return cartasSacadas;
        } else {
            daw.Naipe[] cartasSacadas = new daw.Naipe[numCartas];
            for (int i = 0; i < cartasSacadas.length; i++) {
                int cartaASacar = r.nextInt(TAMANO_BARAJA);
                if (array[cartaASacar] == null) {
                    i--;
                } else {
                    cartasSacadas[i] = new Naipe(array[cartaASacar].getNumero(), array[cartaASacar].getPalo());
                    array[cartaASacar] = null;
                }
            }
            return cartasSacadas;
        }

    }

    

}
