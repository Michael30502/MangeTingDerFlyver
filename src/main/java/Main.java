import processing.core.PApplet;

public class Main {
    import processing.core.PApplet;

    public class Main extends PApplet{
        //....Denne variabel kan bruges til at
        static PApplet p;

        //Denne liste SKAL indholde alle de "Ting", der er pÃ¥ skÃ¦rmen!
        Ting[] listeTing;

        public static void main(String[] args) {
            PApplet.main("Main");
        }

        @Override
        public void settings() {
            super.settings();
            size(500,500);

            //...Alle processing kommandoer er nu inde i p....
            p = this;


            //Opgave 1 : Her skal du oprette listen "listeTing" med plads til 20 ting

            //Opgave 5 : Her skal du skrive kode der laver alle "Ting"


        }

        public void draw(){
            //... Eksempel pÃ¥ processing kommando (som den bÃ¸r bruges i andre klasser!!)
            Main.p.fill(200,200,200);
            Main.p.rect(10,10,480,480);

            //OPGAVE 8 (SVÃ†R) : Her skal du skrive kode der Ã¦ndrer farven til rÃ¸d din "Ting"  rÃ¸rer ved musen...


            //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
            //ps: Du SKAL kalde "tegn metoden" pÃ¥ ALLE "Ting"



            //Opgave 7 : Her skal du skrive kode, der fÃ¥r alle "Ting" til at flytte sig
            //ps: DU SKAL kalde "





            //EKSPERT 2:
            //Hvis to ting rÃ¸rer hinanden skal de blive blÃ¥!

        }



    }
}
