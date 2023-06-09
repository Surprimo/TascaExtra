package es.iesmz.ed.algoritmes;


public class Sudoku {
    private int[][] celdas;
    /**
     * Constructor de la clase Sudoku.
     * @param celdas Una matriz 9x9 que representa el Sudoku.
     * Comprueba que es 9x9 con los metodos de la clase Sudoku
     */
    public Sudoku(int[][] celdas) {
        this.celdas = celdas;
    }

    /**
     * Verifica si el Sudoku es correcto.
     * Comprueba el largo de cada fila que no sea menor de 9 de largo
     * Comprueba el largo de cada columna que no sea menor de 9 de largo
     * Comprueba la regiones de 3x3 que sean 9 en total
     * @return true si el Sudoku es correcto, false en caso contrario.
     */
    public boolean esCorrecta() {
        // Comprobación de filas
        for (int fila = 0; fila < 9; fila++) {
            if (!esValida(celdas[fila])) {
                return false;
            }
        }

        // Comprobación de columnas
        for (int columna = 0; columna < 9; columna++) {
            int[] columnaArray = new int[9];
            for (int fila = 0; fila < 9; fila++) {
                columnaArray[fila] = celdas[fila][columna];
            }
            if (!esValida(columnaArray)) {
                return false;
            }
        }

        // Comprobación de regiones 3x3
        for (int filaRegion = 0; filaRegion < 9; filaRegion += 3) {
            for (int columnaRegion = 0; columnaRegion < 9; columnaRegion += 3) {
                int[] regionArray = new int[9];
                int index = 0;
                for (int fila = filaRegion; fila < filaRegion + 3; fila++) {
                    for (int columna = columnaRegion; columna < columnaRegion + 3; columna++) {
                        regionArray[index++] = celdas[fila][columna];
                    }
                }
                if (!esValida(regionArray)) {
                    return false;
                }
            }
        }

        return true;
    }
    /**
     * Método para acomprobar si el array introducido es correcto
     * Se crea un array booleano para comprobar cada número del array introducido
     * @param array se usa el array introducido en un foreach para comprobar cada iteracion si es correcto el número
     * @return devuelve false si los números son menores de 1 o mayores de 9 y si un número se repite en el array, en caso de ser correcto devuelve true
     */
    private boolean esValida(int[] array) {
        boolean[] nums = new boolean[10];
        for (int num : array) {
            if (num < 1 || num > 9 || nums[num]) {
                return false;
            }
            nums[num] = true;
        }
        return true;
    }
}


