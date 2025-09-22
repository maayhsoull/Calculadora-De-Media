package model;

import java.util.Scanner;

public class Aluno {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    String nomeAluno;
    String resultado;
    //utilizar variáveis em linhas separadas para poder se enquadrar no cleanCode

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
        System.out.println("------------------------------------");

        //chamando as funções para prosseguir com o código
        calcularMedia();
        exibirResultados();
    }

    public void calcularMedia(){

        // realiza o calculo de média
        double somaNotas = nota1 + nota2 + nota3 + nota4;

        media = somaNotas/4;

        //verifica a situação do aluno
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
