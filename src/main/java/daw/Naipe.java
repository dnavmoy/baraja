/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author daniel
 */
public class Naipe {

    //clase naipe - dos atributos: numero carta y palo
//1-7 8 sota 9 caballo 10 rey
//palos oros bastos espadas y copas
//   dos construtores 1 crea cartas aleatoriamente -> por defecto
//   2 parametros- numero de carta y palo si no es correcto lanzar excepcion
//   
    Random r = new Random();
    private final int ultimaCarta = 10;

    private int numero;
    private Palos palo;

    public Naipe(int numero, Palos palo) {
        if (numero < 1 || numero > 9) {
            throw new IllegalArgumentException("numero de carta no valido");
        }
        this.numero = numero;
        this.palo = palo;
    }

    public Naipe() {

        this.numero = r.nextInt(1, ultimaCarta+1);
        int rPalo = r.nextInt(Palos.values().length);
        switch (rPalo) {
            case 0 ->
                this.palo = Palos.bastos;
            case 1 ->
                this.palo = palo.copa;
            case 2 ->
                this.palo = palo.espadas;
            case 3 ->
                this.palo = palo.oro;

        }
    }

    public int getNumero() {
        return numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("naipe{");
        if (numero==8){
            sb.append("numero=").append("sota");
        }else if (numero==9){
            sb.append("numero=").append("caballo");
        }else if (numero==10){
            sb.append("numero=").append("Rey");
        }else{
            sb.append("numero=").append(numero);
        
        }
        
    
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }

}
