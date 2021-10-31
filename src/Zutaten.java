public class Zutaten {

    private String Zutaten [] = {"Eier", "Pfeffer", "Salz", "Öl"};
    private int Menge;
   // private String nameDesRezepts;
    private int personen;


    public Zutaten(int personen, int Menge) {  //Konstruktor
       // final String[] zutaten = Zutaten;
      //  nameDesRezepts = "";
        personen = 0;
        Menge = 0;
    }

 //   public String getZutat() {
   //     return Zutaten[4];
    //}

    public double getMenge() {
        return Menge;
    }
    public void printZutaten () {
       // System.out.println(Zutaten);
        System.out.println(Menge + personen);
    }
}
