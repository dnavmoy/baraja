/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public enum Palos {
    
    oro("oro"),copa("copa"),bastos("bastos"),espadas("espadas");
    
    
    private String palo;

    private Palos(String palo) {
        this.palo = palo;
    }
    
    

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Palos{");
        sb.append("palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
