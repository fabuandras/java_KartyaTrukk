package kartya;

public class Kartya {

    static String[] pakli; // csak itt hozzuk létre

    public static void main(String[] args) {
        osszeallit();
        kirak();
    }

    private static void osszeallit() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "XIII"};
        
        pakli = new String[szinek.length * ertekek.length]; // itt inicializáljuk

        int index = 0;
        for (int i = 0; i < szinek.length; i++) {
            String szin = szinek[i];
            for (int j = 0; j < ertekek.length; j++) {
                pakli[index++] = szin + " " + ertekek[j];
            }
        }
    }
    
    private static void kirak() {
        int oszlopok = 3;
        int sorok = 7;

        for (int sor = 0; sor < sorok; sor++) {
            for (int oszlop = 0; oszlop < oszlopok; oszlop++) {
                int indexPakli = oszlop * sorok + sor;
                if (indexPakli < pakli.length) {
                    System.out.printf("%10s", pakli[indexPakli]);
                }
            }
            System.out.println();
        }
    }
}
