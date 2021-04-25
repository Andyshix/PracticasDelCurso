
/**
 * Write a description of class FlorImperial here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class FlorImperial
{
    private int altura;
    public FlorImperial(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public String crecer(){
        String res;
        int numDig = calDigitos(getAltura());
        if(numDig<8){
            altura = altura*2;
            res    = "La flor imperial ha crecido";
        }else{
            res    = "La flor ha llegado a su maxima altura";
        }
        return res;
    }
    private int calDigitos(int num){
        int res = 0;
        while(num>=1){
            num = num/10;
            res++;
        }
        return res;
    }
}
