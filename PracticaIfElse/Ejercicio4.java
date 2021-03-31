    
/**
* Write a description of class Ejercicio4 here.
* 
* @author (Andrea) 
* @version (1.0)
*/
public class Ejercicio4
{
    public String estadoSem(String estadoSem, int nCambios ){
        String res = "";
        while (nCambios >= 1){
           if(estadoSem == "verde"){
               estadoSem = "amarillo";
               nCambios = nCambios - 1;
           }else {
               if (estadoSem == "amarillo"){
                   estadoSem = "rojo";
                   nCambios  = nCambios - 1;
               }else {
                   estadoSem = "verde";
                   nCambios  = nCambios - 1;
               }
            }
        }
        res = estadoSem;
        return res;
    }
   
    public String estadoSema(String estadoSem, int nCambios ){
       String res = "";
       if(nCambios > 0){
          if(estadoSem == "verde"){
              estadoSem = "amarillo";
          }else {
              if (estadoSem == "amarillo"){
                 estadoSem = "rojo";
              }else {
                 estadoSem = "verde";
              }
            }
          res = estadoSema (estadoSem,nCambios-1);
       }else{
          res = estadoSem;
       }
       
       return res;
    }
   
}
