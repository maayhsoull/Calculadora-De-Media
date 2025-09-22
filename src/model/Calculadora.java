package model;

import java.util.Scanner;

public class Calculadora {
    double nota1, nota2, nota3, nota4, media;
    String nomeAluno, resultado;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("*** CALCULADORA DE MÉDIA ESCOLAR ***");
        System.out.println("------------------------------------");

        //solicitando dados para o usuário
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        calcularMedia();
        exibirResultados();
    }

    public void calcularMedia(){

        double somaNotas = nota1 + nota2 + nota3 + nota4;

        media = somaNotas/4;

        if (media >= 5){
            resultado = "Aprovado(a)";
        }
        else {
            resultado = "Reprovado(a)";
        }
    }

    public void exibirResultados(){
        System.out.printf("Média do aluno: %.1f", media);
        System.out.printf("\nO(a) aluno(a) %s está %s!", nomeAluno, resultado);
    }
}
