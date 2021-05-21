package model;
import java.util.ArrayList;
public class Player{
    private String name;
    private ArrayList<UnoCard> mano;
    private boolean variableTurno;
    public Player(String name){
        this.name = name;
        mano = new ArrayList<>();
        variableTurno = false;
    }
    @Override
    public String toString(){
        return name;
    }
    public String getName(){
        return name;
    }
    public ArrayList<UnoCard> getMano(){
        return mano;
    }
    public boolean getVariableTurno(){
        return variableTurno;
    }
    public void setVariableTurno(){
        if(variableTurno==false){
            variableTurno = true;
        }else{
            variableTurno = false;
        }
    }
    
    @Override
    public boolean equals(Object o){
        boolean res = false;
        if(o != null && o instanceof Player){
            Player temp = (Player)o;
            if(temp.getName()==name){
                res = true;
            }
        }
        return res;
    }
    
    public boolean sinCartas(){
        return mano.isEmpty();
    }
    public void recibeCarta(UnoCard carta){
        mano.add(carta);
    }
    public int numCards(){
        return mano.size();
    }
}
