package strings;

public class ContarPalavras {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("O Lorem Ipsum é um texto modelo da indústria tipográfica e de");
        sb.append("desde o ano de 1500, quando uma misturou os caracteres de um texto para criar um espécime de livro.");
        sb.append("Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia electrónica, mantendo-se essencialmente");
        sb.append("inalterada. Foi popularizada nos anos 60 com a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum, ");
        sb.append("e mais recentemente com os programas de publicação como o Aldus PageMaker que incluem versões do Lorem Ipsum.");
        String[] vect = sb.toString().split(" ");
        int x = 0;
        for (String s : vect){
            x++;
        }
        System.out.println("Quantity phrases cont equal = "+x);
    }
}