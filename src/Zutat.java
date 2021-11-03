public class Zutat {


    public String zutat;
    public int menge;
   /* private String Zutaten [];
    private String nameDesRezepts;
    private int personen;
*/

    public Zutat(int menge, String zutat) { //Konstruktor
       this.menge = menge;
        this.zutat = zutat;
  }

   public String getZutat() {
     return zutat;
   }

 public double getMenge() {
 return menge;
   }


//    public void printZutaten () {
//       // System.out.println(Zutaten);
//        System.out.println(Menge + personen);
//    }
}
