package model;
import java.util.ArrayList;
import java.awt.*;
public class Baraja
{
    private ArrayList<UnoCard> mazo;
    public Baraja() {
        mazo = new ArrayList<>();
    }

    public ArrayList<UnoCard> getMazo(){
        return mazo;
    }
    
    public ArrayList<UnoCard> generarMazo(){
        for(int i=0; i<4;i++){
            for(int j=0;j<13;j++){
                String valor = j+"";
                Color color = generarColor(i);
                switch(j){
                    case 10: valor="R";break;
                    case 11: valor="+2";break;
                    case 12: valor="C"; color = generarColor(4);break;
                }
                Card Carta = new Card(valor,color);
                mazo.add(Carta);
            }
        }
        for(int i=0; i<4;i++){
            for(int j=1;j<12;j++){
                String valor = j+"";
                Color color = generarColor(i);
                switch(j){
                    case 10: valor="R";break;
                    case 11: valor="+2";break;
                }
                Card Carta = new Card(valor,color);
                mazo.add(Carta);
            }
        }
        barajearMazo();
        return mazo;
    }
    
    private Color generarColor(int num){
        Color res;
        switch(num){
            case 0: res = Color.YELLOW; break;
            case 1: res = Color.RED; break;
            case 2: res = Color.BLUE; break;
            case 3: res = Color.GREEN; break;
            default: res = Color.BLACK;
        }
        return res;
    }
    private void barajearMazo(){
        UnoCard carta = null;
        int aleatorio = 0;
        for(int i=0;i<mazo.size();i++){
            aleatorio =(int)(Math.random()*mazo.size());
            carta = mazo.get(i);
            mazo.set(i,mazo.get(aleatorio));
            mazo.set(aleatorio, carta);
        }
    }
}
