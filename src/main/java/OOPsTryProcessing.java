import processing.core.PApplet;

import java.util.ArrayList;

public class OOPsTryProcessing extends PApplet{
    public static void main(String[] args) {
        PApplet.main("OOPsTryProcessing",args);
    }
    public static ArrayList<Ball> play = new ArrayList<>();
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;


    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int move = 1; move <= 4; move++) {
            play.add(new Ball(move, (move* HEIGHT )/ 5));
        }
    }

    @Override
    public void draw() {
        for (Ball x : play) {
            x.ball(this);
            x.newPosition();
        }
    }

}
