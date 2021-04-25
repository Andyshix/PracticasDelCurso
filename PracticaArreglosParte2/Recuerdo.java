public class Recuerdo
{
    private Fecha date;
    private String descripcion;
    public Recuerdo(int dia, int mes,int year,String descripcion){
        date             = new Fecha(dia,mes,year);
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public Recuerdo obtenerCopia(){
        int valorDia   = getDia();
        int valorMes   = getMes();
        int valorYear  = getYear();
        Recuerdo copia = new Recuerdo(valorDia,valorMes,valorYear,descripcion);
        return copia;
    }
    public int getDia(){
        return date.getDia();
    }
    public int getMes(){
        return date.getMes();
    }
    public int getYear(){
        return date.getYear();
    }
}
