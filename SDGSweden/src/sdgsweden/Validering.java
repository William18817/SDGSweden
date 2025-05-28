package sdgsweden;

/*
 * @author Kalkilm: Nedan har vi vår valideringsklass, vars syfte är att bara reglera användar data som ska spara i databasen.
 */
public class Validering {

    public static boolean isEmpty(String text) {
        if (text == null) {
            return true;
        }

        if (text.trim().isEmpty()) {
            return true;
        }

        return false;
    }

    public static boolean isValidEpost(String epost) {
        if (epost == null) {
            return false;
        }
        return epost.matches("^[a-zA-ZÅÄÖåäö]+\\.[a-zA-ZÅÄÖåäö]+@example\\.com$");
    }
    
    public static boolean isValidEpostAvdelining(String epost){
        if (epost == null){
            return false;
        }
        return epost.matches("^[a-zA-ZåäöÅÄÖ0-9._%+-]+@[a-zA-ZåäöÅÄÖ0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean isValidTelefon(String telefon) {
        if (telefon == null) {
            return false;
        }
        return telefon.matches("^[\\d-]{7,15}$");
    }

    public static boolean isValidAnstallningsdatum(String anstallningsdatum) {
        if (anstallningsdatum == null) {
            return false;
        }
        return anstallningsdatum.matches("^\\d{4}-\\d{2}-\\d{2}$");

    }

    public static boolean isValidLosenord(String losenord) {
        if (losenord == null) {
            return false;
        }
        return losenord.matches("^[A-Za-z\\d]{11,}$");

    }

    public static boolean isValidAdress(String adress) {
        if (adress == null) {
            return false;
        }
        return adress.matches("^[A-Za-zÅÄÖåäö\\d\\-\\s]{50,50}$");

    }
    public static boolean isValidValuta(String input) {
    if (input == null || input.isBlank()) {
        return false;
    }

    try {
        // Byt ut komma till punkt så vi kan parsa till double
        double kostnad = Double.parseDouble(input.replace(",", "."));
        return kostnad >= 0 && kostnad <= 5_000_000;
    } catch (NumberFormatException e) {
        return false; // ogiltigt tal, t.ex. bokstäver eller fel formatering
    }
}

    public static boolean isValidKostnad(double kostnad) {
        return kostnad >= 0 && kostnad <= 5_000_000;
    }
   

    public static boolean allaFältIfyllda(String... fält) {
        for (String fältet : fält) {
            if (isEmpty(fältet)) {
                return false;
            }
        }
        return true;
    }

}
