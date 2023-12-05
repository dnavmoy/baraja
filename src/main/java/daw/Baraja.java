/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class Baraja {
    
    private Naipe[] array;
    
    
    public Baraja() {
        for(int i=0;i<40;i++){
            for(int z=1;z<11;z++){
                array[z]=new Naipe(z, Palos.oro);
            }
            for(int z=10;z<21;z++){
                array[z]=new Naipe(z, Palos.copa);
            }
            for(int z=20;z<31;z++){
                array[z]=new Naipe(z, Palos.espadas);
            }
            for(int z=30;z<41;z++){
                array[z]=new Naipe(z, Palos.bastos);
            }
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
        sb.append("Baraja{");
        sb.append("array=").append(array);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
