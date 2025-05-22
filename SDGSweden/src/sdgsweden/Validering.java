
package sdgsweden;

/*
 * @author Kalkilm
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
    return losenord.matches("^[A-Za-z\\d]{8,}$");

}



}
