public class rezept {

  public String rezeptName;
  public int personenAnzahl;
  public String Zutat [];



  public rezept(int personAnzahl, String rezeptName) {
      this.rezeptName = rezeptName;
      this.personenAnzahl = personAnzahl;
  }
  

  public String getRezeptName() {
      return rezeptName;
  }

    public int getPersonenAnzahl() {
        return personenAnzahl;
    }
  //  System.out.println("Das Rezept heißt " + rezeptName + " und ist für " + personenAnzahl +" Person(en)");
       public void printRezept(){
           System.out.println("Name" + this.rezeptName);
           System.out.println("Personen" + this.personenAnzahl);
           System.out.println("Zutaten: ");
      
       }

}
