
/**
 * Write a description of class JuegoDracoCornio here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class JuegoDracoCornio
{
    private int x;
    private int y;
    private int contadorIntentos;
    public JuegoDracoCornio(){
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);
        contadorIntentos = 0;
    }

    public String jugar(int cordX, int cordY){
        String res = "Lo siento ya no tienes intentos perdiste me saludas al Megalodon";
        String xr;
        String yr;
        String auxA = "esta cerca";
        String auxB = "esta lejos";
        String auxC = "esta en su posicion";
        if(contadorIntentos<3){
            if(x==cordX&&y==cordY){
                res = "Felicidades, acabas de encontrar el Tesoro Del DracoCornio";
                contadorIntentos++;
            }else {
                if (x==cordX){
                    xr = auxC;
                }else if(x==(cordX-1)||x==(cordX-2)||x==(cordX+1)||x==(cordX+2)){
                    xr = auxA;
                }else{
                    xr = auxB;
                }

                if (y==cordY){
                    yr = auxC;
                }else if(y==(cordY-1)||y==(cordY-2)||y==(cordY+1)||y==(cordY+2)){
                    yr = auxA;
                }else{
                    yr = auxB;
                }
                contadorIntentos++;
                res = "X "+xr+", Y "+yr;
            }
        }

        return res;
    }

    public void reiniciarJuego(){
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);
        contadorIntentos = 0;
    }
}
