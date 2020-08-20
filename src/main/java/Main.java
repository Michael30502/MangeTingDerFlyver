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
        size(500, 500);

        //...Alle processing kommandoer er nu inde i p....
        p = this;


        //Opgave 1 : Her skal du oprette listen "listeTing" med plads til 20 ting

        listeTing = new Ting[20];

        //Hvis der bliver printet 20 gange null virker det
        print(listeTing);

        //Opgave 5 : Her skal du skrive kode der laver alle "Ting"
        for(int i =0;i< listeTing.length;i++){

listeTing[i] = new Ting(random(21,width-21),random(21,height-21),this,listeTing);
        }
        //Hvis det virker skal der ikke længere printes null i konsolen
        print(listeTing);
    }


    public void draw(){
        //... Eksempel pÃ¥ processing kommando (som den bÃ¸r bruges i andre klasser!!)
        background(200,100,100);
        Main.p.fill(200,200,200);
        Main.p.rect(10,10,480,480);
        imageMode(CENTER);

        //OPGAVE 8 (SVÃ†R) : Her skal du skrive kode der Ã¦ndrer farven til rÃ¸d din "Ting"  rÃ¸rer ved musen...
        //Man kan se at farven ændre sig når man holder musen over objektet
        for(int i =0;i< listeTing.length;i++){

            if((listeTing[i].mouseOver()))
    fill(255,0,0);
            else if (listeTing[i].collision())
                fill(0,0,255);
                else
                fill(255,255,255);


        //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
        //ps: Du SKAL kalde "tegn metoden" pÃ¥ ALLE "Ting"



            listeTing[i].tegn();
            // Hvis tyve ting er tegnet når vi starter programmet så virker det

        }


        //Opgave 7 : Her skal du skrive kode, der fÃ¥r alle "Ting" til at flytte sig
        //ps: DU SKAL kalde "
        for(int i =0;i< listeTing.length;i++){

        listeTing[i].flyv();
        //Hvis alle 20 ting bevæger sig, så virker det
    }






        //EKSPERT 2:
        //Hvis to ting rÃ¸rer hinanden skal de blive blÃ¥!
//Det ligger i en metode der hedder collison som ligger i Ting
        //Man kan se at den virker ved at den er blå når musen er over den

    }



}