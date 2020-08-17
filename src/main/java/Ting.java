
    import processing.core.PApplet;

    public class Ting {


        //Tings position
        float x, y;
        float colorR = 100;
        PApplet p;
        Ting[] listeTing;

        Ting(float inputX, float inputY,PApplet p,Ting[] listeTing){

            //Opgave 2: Her skal du skrive kode der sÃ¦tter positionen for tingen x og y
this.listeTing = listeTing;
x= inputX;
y= inputY;
this.p = p;
        }

        void tegn(){
            //Opgave 3: Her skal du skrive kode der tegner denne "Ting"
p.ellipse(x,y,20,20);
        }

        boolean mouseOver() {
            boolean result = false;
            if ((p.mouseX < x + 10 && p.mouseX > x - 10) && (p.mouseY > y - 10 && p.mouseY < y + 10))
                result = true;

        return  result;
        }

        boolean collision() {
            boolean result = false;

            for (int i = 0; i < listeTing.length; i++) {
                if (listeTing[i].x - 10 < x-10 && listeTing[i].x +10 > x-10||((listeTing[i].x +10 > x+10)&&(listeTing[i].x -10 < x+10))) {
                    if (listeTing[i].y + 10 > y && listeTing[i].y + -10 < y)
result = true;
                }

            }
            return result;
        }







        void flyv(){
            //Opgave 4: Her skal du skrive kode der flytter "Ting"
            x += p.random(-5,5);
            if(x<20)
                x= 20;
            if(x>p.width-20)
                x=p.width-20;

            y+= p.random(-5,5);
            if(y<20)
                y= 20;
            if(x>p.height-20)
             y=p.height-20;


            //ps: Husk de mÃ¥ ikke flytte sig uden for skÃ¦rmen...


        }


}

