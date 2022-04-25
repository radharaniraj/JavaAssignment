import processing.core.PApplet;

public class Ball extends PApplet {

    private final int HEIGHT;
    private int positionX;
    final int speed;
    private final int DIAMETER;

    public Ball(int speed, int height) {
        this.HEIGHT = height;
        this.speed = speed;
        this.DIAMETER = 10;
        this.positionX = 0;
    }

    public void ball(PApplet pApplet) {
        pApplet.ellipse(positionX, HEIGHT,DIAMETER,DIAMETER);
    }

    public void newPosition() {
        positionX = positionX + speed;
    }
}