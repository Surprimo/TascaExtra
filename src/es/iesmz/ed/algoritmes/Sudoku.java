package es.iesmz.ed.algoritmes;


public class Sudoku {
    private int[][] cledas;

    public Sudoku(int[][] cledas) {
        this.cledas = cledas;
    }


    /**
     * Método para acomprobar si el array introducido es correcto
     * Se crea un array booleano para comprobar cada número del array introducido
     * @param array se usa el array introducido en un foreach para comprobar cada iteracion si es correcto el número
     * @return devuelve false si los números son menores de 1 o mayores de 9 y si un número se repite en el array, en caso de ser correcto devuelve true
     */
    private boolean esValida(int[] array) {
        boolean[] nums = new boolean[9];
        for (int num : array) {
            if (num < 1 || num > 9 || nums[num - 1]) {
                return false;
            }
            nums[num - 1] = true;
        }
        return true;
    }
}


