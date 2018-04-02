package Model;

public class Posicion {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0 || x > 2){
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0 || y > 2){
            throw new IllegalArgumentException();
        }
        this.y = y;
    }
}
