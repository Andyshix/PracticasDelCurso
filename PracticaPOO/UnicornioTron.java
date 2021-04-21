

/**
 * Write a description of class UnicornioTron here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class UnicornioTron
{
    private int dinero;
    private int cantIntentos;
    private int aleatorio;
    public UnicornioTron(){
        dinero = 1000; //cantidad propuesta, pues nunca especifica cuanto dinero tiene inicialmente
        cantIntentos = 0;
        aleatorio = (int)(Math.random()*100+1);
    }

    public int getDinero(){
        return dinero;
    }

    public void insertarFicha(){
        cantIntentos = cantIntentos+1;
    }

    public String jugar(int num){
        String res;
        if(dinero>0){
            if(cantIntentos>0){
                if(num==aleatorio){
                    res = "Felicidades, ganaste el premio";
                    dinero = 0;
                    cantIntentos--;
                }else{
                    res = "Lo siento, fallaste el intento, prueba otra vez";
                    cantIntentos--;
                }
            }else{
                res = "No tienes intentos para jugar, inserta una ficha";
            }
        }else{
            res = "La maquina no tiene dinero, deben regargar";
        }
        return res;
    }
    public void recargarDinero(){
        dinero = 1000;
    }
}