package cl.praxis.model;

public class Calculadora {

    public Calculadora() {
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) {
        try {
            if (numero2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return numero1 / numero2;
    }
}
