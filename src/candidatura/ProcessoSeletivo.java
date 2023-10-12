package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Kaio", "João", "Davi", "Matheus", "Gabriela"};
        for (String candidato : candidatos) {
            case4(candidato);
        }
    }

    static void case4(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while(continuarTentando && tentativasRealizadas<3);
        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas (" + tentativasRealizadas + ") realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Kaio", "João", "Davi", "Matheus", "Gabriela"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°" + (indice + 1) + " é o(a) " + candidatos[indice]);
        }

        System.out.println("Impressão a là for each");
        for (String candidato :
                candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        String[] candidatos = {"Kaio", "João", "Davi", "Matheus", "Gabriela", "Milena", "Cristina", "Samuel", "Jorge", "Júlia"};

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato(a) " + candidato + " tem pretensão salarial de R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o CANDIDATO, com uma contra-proposta");
        } else {
            System.out.println("Aguardando resultados dos demais CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
}
