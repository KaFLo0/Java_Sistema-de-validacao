package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro parâmetro: ");
        int inicioContagem = terminal.nextInt();
        System.out.println("Digite o valor do segundo parâmetro: ");
        int fimContagem = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(inicioContagem, fimContagem);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }
    static void contar(int inicioContagem, int fimContagem ) throws ParametrosInvalidosException {
        //validar se inicioContagem é MAIOR que fimContagem e lançar a exceção
        if (inicioContagem > fimContagem) {
            throw new ParametrosInvalidosException();
        }

        int contagem = fimContagem - inicioContagem;
        //realizar o for para imprimir os números com base na variável contagem
        for (int x = 1;x <= contagem; x++) {
            System.out.println("Imprimindo o número -> " + x);
        }
    }
}
