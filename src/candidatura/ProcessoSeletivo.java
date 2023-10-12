package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);
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
}
