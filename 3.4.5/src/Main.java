import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    MyHouse myhouse;

    class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            myhouse.eatPizza();
        }
    }

    public static void main(String[] args) {

    }
    public void type(String text) throws InterruptedException{
        synchronized(text){
            send(text.charAt(0));
            Thread.sleep(500);
        }
    }
    Canvas c=new Canvas();
    c.draw()
    public void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p = new Paint();
        int col=Color.RED;
        int color = Color.GREEN;
}


