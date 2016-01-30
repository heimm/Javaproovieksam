import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 30.01.2016.
 */
public class Laev {

    String[] andmebaas = new String[100]; //pole vaja, lihtsalt massiivi testimiseks
    ArrayList andmebaas2 = new ArrayList();
    static private String nameslot = new String();

    public Laev(String laevaNimi) {
        nameslot = laevaNimi;
    }

    public void lisaReisija(String s) {
        andmebaas2.add(s);
    }

    public void eemaldaReisija(String s) {
        andmebaas2.remove(s);
    }

    public String votaReisijad() {
        return andmebaas2.toString();
    }

    public String reisijateArv() {

        return String.valueOf(andmebaas2.size());
    }

    public void kalaHammustasKummipaatiAugu() {
    andmebaas2.clear();
        nameslot = "Uppunud";
    }

    public String misNimi() {
        return nameslot;
    }
}
