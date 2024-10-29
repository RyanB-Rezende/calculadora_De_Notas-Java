import java.util.Scanner;

public class calculadoranotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos deseja adicionar? ");
        int numeroAlunos = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[numeroAlunos];

        for(int i = 0; i <numeroAlunos; i++) {
            System.out.println("\nAluno " +(i+1));
            System.out.print("Digite o Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite Nota 2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            alunos [i] = new Aluno(nome, nota1, nota2);
        }
        System.out.println("\n---- Resultados ----");
        for (Aluno aluno : alunos) {
            double media = Calculadora.calcularmedia(aluno);
            String status = Calculadora.determinarstatus(media);

            System.out.printf("Aluno %s | Media: %.2f | Status: %s\n", 
            aluno.getNome(), media, status);
        }

        scanner.close();
    }
}
