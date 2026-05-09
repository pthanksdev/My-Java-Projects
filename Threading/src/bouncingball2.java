import java.awt.*;
import java.awt.event.MouseEvent;
//import org.w3c.dom.events.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class bouncingball2 extends Frame implements MouseListener , Runnable {
    int x = 40, y = 40, t1 = 1, t2 = 1;
    int x1 = 200, y1 = 40, t12 = 1, t22 = 1;
    int x2 = 100, y2 = 100, t13 = 1, t23 = 1;
    Color[] colors = {Color.pink, Color.yellow, Color.blue, Color.green, Color.red};
    Color ballColor1 = colors[new Random().nextInt(colors.length)];
    Color ballColor2 = colors[new Random().nextInt(colors.length)];
    Color ballColor3 = colors[new Random().nextInt(colors.length)];
    Thread th;

    bouncingball2() {
        setSize(700, 800);
        setVisible(true);
        th = new Thread(this);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        th.start();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void paint(Graphics g) {
        g.setColor(ballColor1);
        g.fillOval(x, y, 40, 40);
        g.setColor(ballColor2);
        g.fillOval(x1, y1, 40, 40);
        g.setColor(ballColor3);
        g.fillOval(x2, y2, 40, 40);
    }

    @Override
    public void run() {
        while (true) {
            x += t1;
            y += t2;
            x1 += t12;
            y1 += t22;
            x2 -= t13;
            y2 -= t23;

            if (x < 0 || x > 660) {
                t1 *= -1;
                ballColor1 = colors[new Random().nextInt(colors.length)];
            }
            if (y < 20 || y > 760) {
                t2 *= -1;
                ballColor1 = colors[new Random().nextInt(colors.length)];
            }
            if (x1 < 0 || x1 > 660) {
                t12 *= -1;
                ballColor2 = colors[new Random().nextInt(colors.length)];
            }
            if (y1 < 20 || y1 > 760) {
                t22 *= -1;
                ballColor2 = colors[new Random().nextInt(colors.length)];
            }
            if (x2 < 0 || x2 > 660) {
                t13 *= -1;
                ballColor3 = colors[new Random().nextInt(colors.length)];
            }
            if (y2 < 20 || y2 > 760) {
                t23 *= -1;
                ballColor3 = colors[new Random().nextInt(colors.length)];
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            repaint();
        }
    }


    public static void main(String[] args) {
        new bouncingball2();
    }
}



