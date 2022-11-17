import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matricula;
        String nomeAluno;
        float nota1, nota2, nota3, media;
        float qtdpresencas, presenca;
        double contagem = 0;
        Scanner scanner = new Scanner(System.in);

        while (contagem <= 5){
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.println("INFORME A MATRICULA DO ALUNO(A): ");
            matricula = scanner.nextInt();
            System.out.println("INFORME O NOME DO ALUNO(A): ");
            nomeAluno = scanner.next();
            System.out.println("INFORME A PRIMEIRA NOTA: ");
            nota1 = scanner.nextFloat();
            System.out.println("INFORME A SEGUNDA NOTA: ");
            nota2 = scanner.nextFloat();
            System.out.println("INFORME A TERCEIRA NOTA: ");
            nota3 = scanner.nextFloat();
            System.out.println("INFORME A QUANTIDADE DE PRESENÇA DO ALUNO(A): ");
            qtdpresencas = scanner.nextInt();
            contagem++;
            media = (nota1 + nota2 + nota3) / 3;
            presenca = (qtdpresencas / 60) * 100;
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.printf("O NOME DO ALUNO(A): %s %n", nomeAluno);
            System.out.printf("A MEDIA DO ALUNO(A): %.2f %n", media);
            System.out.printf("A QUANTIDADE DE PRESENÇAS É: %.2f %n", presenca);
            System.out.println("------------------------------------------------");
            if(contagem == 5){
                break;
            }
        }
    }
}