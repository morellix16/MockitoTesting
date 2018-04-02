package Model;

public class Tablero {

    private Casilla[][] posiciones;

    public Casilla[][] getPosiciones() {
        return posiciones;
    }

    public Tablero() {
        this.posiciones = new Casilla[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                posiciones[i][j] = new Casilla();
            }
        }
    }
}
