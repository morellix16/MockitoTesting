package Model;

public class Juego {

    private Tablero tablero;

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public  boolean checkGanador(String marca)
    {
        //busqueda de ganador por filas
        for ( int i = 0 ; i < tablero.getPosiciones().length ; i++ )
        {
            byte count=0;
            for ( int j = 0 ; j < tablero.getPosiciones().length ; j++)
                count+=( tablero.getPosiciones()[i][j].equals(marca) )?1:0;
            if( count == 3)
                return true;
        }
        //busqueda de ganador por columnas
        for ( int j = 0 ; j < tablero.getPosiciones().length ; j++ )
        {
            byte count=0;
            for ( int i = 0 ; i < tablero.getPosiciones().length ; i++)
                count+=( tablero.getPosiciones()[i][j].equals(marca) )?1:0;
            if( count == 3)
                return true;
        }
        //diagonales
        if(  tablero.getPosiciones()[0][0].equals(marca) && tablero.getPosiciones()[1][1].equals(marca) && tablero.getPosiciones()[2][2].equals(marca) )
            return true;

        if(  tablero.getPosiciones()[0][2].equals(marca) && tablero.getPosiciones()[1][1].equals(marca) && tablero.getPosiciones()[2][0].equals(marca) )
            return true;

        return false;
    }

}
