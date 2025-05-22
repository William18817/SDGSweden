
package sdgsweden;

/*
 * @author Kalkilm: Nedan har vi vår valideringsklass, vars syfte är att bara hålla tillåtna värden ocg gränssnitt att läggas till i databasen.
 */
public class Validering 
{
    public static boolean isEmpty(String text)
    {
        if (text == null)
        {
            return true;
        }
        
        if (text.trim().isEmpty())
        {
            return true;
        }
        
        return false;
    }
    
public static boolean isValidEpost(String epost)
{
    if (epost == null) return false;
    return epost.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
}

public static boolean isValidTelefon(String telefon)
{
   if (telefon == null) return false;
    return telefon.matches("^[\\d-]{7,15}$");
}

public static boolean isValidAnstallningsdatum(String anstallningsdatum)
{
    if (anstallningsdatum == null) return false;
    return anstallningsdatum.matches("^\\d{4}-\\d{2}-\\d{2}$");

}

public static boolean isValidLosenord(String losenord)
{
    if (losenord == null) return false;
    return losenord.matches("^[A-Za-z\\d]{11,}$");

}

public static boolean isValidAdress(String adress)
{
    if (adress == null) return false;
    return adress.matches("^[A-Za-z\\d\\-]{2,12}$");

}

public static boolean isValidKostnad(double kostnad)
{
    return kostnad >= 0 && kostnad <= 5_000_000;
}



}
