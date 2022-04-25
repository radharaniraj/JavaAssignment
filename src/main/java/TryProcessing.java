import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT=480;
    public static final int DIAMETER =10;
    int x,c,d,e= 0;
    int y=50;
    int z=100;
    int a= 150;
    int b = 200;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }



    @Override
    public void draw() {
        drawFirstCircle();
        drawSecondCircle();
        drawThirdCircle();
        drawFourthCircle();

    }
    private void drawFirstCircle()  {

            ellipse(x, y, DIAMETER, DIAMETER);

            x++;

    }
    private void drawSecondCircle(){
        //delay(20);
        ellipse(c, 100, DIAMETER, DIAMETER);
        c++;
    }
    private void drawThirdCircle(){
        //delay(30);
        ellipse(d, 150, DIAMETER, DIAMETER);
        d++;
    }
    private void drawFourthCircle(){
        //delay(40);
        ellipse(e, 200, DIAMETER, DIAMETER);
        e++;
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);


    }
}
