package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberExceptionExemplo {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("1.22");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException("Valor precisa estar em um formato numerico");
        }
    }
}
