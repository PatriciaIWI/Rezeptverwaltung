public class rezept {

   private String rezeptName;
   public static int personenAnzahl;

   public rezept(int personAnzahl) {
   this.rezeptName = "";
      this.personenAnzahl = 0;

   }

   public String getRezeptName() {
      return rezeptName;
   }

   public double getPersonenAnzahl() {
      return personenAnzahl;
   }

   public void printRezept(){
      System.out.println("Das Rezept heißt " + rezeptName + " und ist für " + personenAnzahl +" Person(en)");
   }

}
