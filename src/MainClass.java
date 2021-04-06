import processing.core.PApplet;

public class MainClass extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    //int SPEED = 1;
    int x1=0, x2=0, x3=0, x4=0;

    public static void main(String[] args){
        PApplet.main("MainClass", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("Printed from the setup method");
    }

    @Override
    public void draw() {
        System.out.println("Printed from the draw method");

        drawCircle1(mouseX, 1*HEIGHT/5, DIAMETER, 1);
        drawCircle2(mouseX, 2*HEIGHT/5, DIAMETER, 2);
        drawCircle3(mouseX, 3*HEIGHT/5, DIAMETER, 3);
        drawCircle4(mouseX, 4*HEIGHT/5, DIAMETER, 4);
    }

    private void drawCircle1(int mouseX, int mouseY, int diameter, int speed1) {
        ellipse(x1, mouseY, diameter, diameter);
        //System.out.println(x1+" "+mouseY);
        x1 += speed1;
    }

    private void drawCircle2(int mouseX, int mouseY, int diameter, int speed2) {
        ellipse(x2, mouseY, diameter, diameter);
        //System.out.println(x2+" "+mouseY);
        x2 += speed2;
    }

    private void drawCircle3(int mouseX, int mouseY, int diameter, int speed3) {
        ellipse(x3, mouseY, diameter, diameter);
        //System.out.println(x3+" "+mouseY);
        x3 += speed3;
    }

    private void drawCircle4(int mouseX, int mouseY, int diameter, int speed4) {
        ellipse(x4, mouseY, diameter, diameter);
        //System.out.println(x4+" "+mouseY);
        x4 += speed4;
    }

    private void getBackground() {
        background(
                255
        );
    }
}
