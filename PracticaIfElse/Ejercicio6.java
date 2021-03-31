
/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio6
{
    public void datosHermanos(String nomA,int edadA,String nomB,int edadB,String nomC,int edadC){
        
        if (edadA < edadB){
            if(edadA < edadC){
                if(edadB < edadC){
                    System.out.println("El hermano mayor es "+ nomC +"\n"+ 
                    "El hermano del medio es "+ nomB+"\n"+
                    "El hermano menor es "+ nomA);
                } else{
                    System.out.println("El hermano mayor es "+ nomB +"\n"+ 
                    "El hermano del medio es "+ nomC+"\n"+
                    "El hermano menor es "+ nomA);
                }
            }else{
                System.out.println("El hermano mayor es "+ nomB +"\n"+ 
                "El hermano del medio es "+ nomA+"\n"+
                "El hermano menor es "+ nomC);
            }
        }else{
             if (edadA > edadC){
                if(edadB < edadC){
                    System.out.println("El hermano mayor es "+ nomA +"\n"+ 
                    "El hermano del medio es "+ nomC+"\n"+
                    "El hermano menor es "+ nomB);
                } else{
                    System.out.println("El hermano mayor es "+ nomA +"\n"+ 
                    "El hermano del medio es "+ nomB+"\n"+
                    "El hermano menor es "+ nomC);
                } 
             }else{
                System.out.println("El hermano mayor es "+ nomC +"\n"+ 
                "El hermano del medio es "+ nomA+"\n"+
                "El hermano menor es "+ nomB);
             }
        }
        
    }
}
