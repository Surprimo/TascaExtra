package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;


public class CalculMental {
    private String sequence;

    public CalculMental(String sequence) {
        this.sequence = sequence;
    }

    public List<Integer> calcula() {
        List<Integer> results = new ArrayList<>();

        String[] operations = sequence.split("\\s+"); // Divide la secuencia en operaciones separadas

        int partialResult = Integer.parseInt(operations[0]); // Inicializa el resultado parcial con el primer operando

        for (int i = 1; i < operations.length; i += 2) {
            String operator = operations[i]; // Obtiene el operador siguiente (+ o -)
            int operand = Integer.parseInt(operations[i + 1]); // Obtiene el siguiente operando

            partialResult = operator.equals("+") ? partialResult + operand : partialResult - operand;

            results.add(partialResult); // Agrega el resultado parcial a la lista de resultados
        }

        return results;
    }
}


