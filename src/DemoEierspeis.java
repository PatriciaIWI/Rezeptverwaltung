public class DemoEierspeis {
    public static void main(String[] args) {
rezept Eierspeis = new rezept (3,"steirische Eierspeis");
Zutat Eier = new Zutat(9, "Eier");
Zutat Öl = new Zutat(1, "öl");
Zutat SalzuPfeffer = new Zutat(1, "Salz und Pfefer");

        System.out.println("Für " + Eierspeis + " nimm man" + Eier+ SalzuPfeffer + " und " + Öl);


        System.out.println();
        rezept Eierspeis = new rezept(3, "steirische Eierspeis");


        //        System.out.println(rezept.personenAnzahl);
//rezept Eierspeis = new rezept(4);
//Eierspeis.printRezept();
//Zutaten eierspeisZutaten = new Zutaten(5,2);
//Zutaten Zutaten;
//eierspeisZutaten.printZutaten();
    }
}
