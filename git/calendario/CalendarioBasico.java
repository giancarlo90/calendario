
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Metodo para fijar una fecha
     */
    public void fijarFecha ( int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano - 2000;
    }

    /**
     * Metodo para avanzar la fecha
     */
    public void avanzarFecha()
    {
        if (day == 30 & month == 12){
            day = 1;
            month = 1;
            year = year + 1;
        }
        else {
        if (day < 30) {
            day = day + 1;
        }
        else {
            if (day == 30){
                day = 1;
                month = month + 1;
            }
        }
    }
}

/**
* Metodo para que devuelva la fecha deseada 
*/
    public String devolverFecha()
    {
        return  day + "-" + month + "-" + year;
    }
}
