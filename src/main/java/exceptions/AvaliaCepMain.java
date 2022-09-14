package exceptions;

import java.util.Scanner;

public class AvaliaCepMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o cep para ser consultado");
        String cep = in.next();
        try {
            System.out.println(validaCep(cep));
        } catch (CEPInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static String validaCep(String cep) throws CEPInvalidoException{
        if (cep.length() != 8){
            throw new CEPInvalidoException("CEP inválido");
        }
        return cep;
    }
}
