package Model;

public class Casilla {

    private boolean vacio;
    private char ficha;

    public Casilla () {

    }

    public Casilla(boolean vacio, char ficha) {
        if (ficha != 'x' || ficha != 'X' || ficha != 'o' || ficha != 'O'){
            throw new IllegalArgumentException();
        }
        this.vacio = vacio;
        this.ficha = ficha;
    }
    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public char getFicha() {
        return ficha;
    }

    public void setFicha(char ficha) {
        if (ficha != 'x' || ficha != 'X' || ficha != 'o' || ficha != 'O'){
            throw new IllegalArgumentException();
        }
        this.ficha = ficha;
    }
}
