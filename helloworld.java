/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.print("Hello World\n"); // Imprime sem quebra de linha
		System.out.println("Hello World"); // Imprime com quebra de linha
		
		// Inteiro
			int aluno;
			int cont = 0;
		
		// Float
			double nota;
			double minNota = 6.0;
		
		// String
			String periodo;
			String universidade = "Unipar";
		
		// Caracter
			char turma;
			char periodoAula = 'N';
		
		// Lógico
			boolean bool;
			boolean aula = true; // false;
		
		aluno = 50;
		nota = 8.5;
		periodo = "2º periodo";
		turma = 'A';
		bool = true; // false;
		
		/*	System.out.println("Periodo: " + periodo + // Exemplo declaração direto na função
				"\nTurma: " + turma + 
				"\nSituação: " + bool + 
				"\nQtde Aluno: " + alunos +
				"\nMédia: " + nota + "\n");
		*/
		
		String msg = "Periodo: " + periodo + 
			"\nTurma: " + turma + 
			"\nQtde Alunos: " + aluno +
			"\nMédia: " + nota + "\n";
		
		if (bool == true) { 				// Se ( condiçãoVerdadeira )
			msg += "Situação: Ativo\n"; 	// Executa isso 
		} else {							// Senão
			msg += "Situação: Inativo\n";	// Executa isso
		}
		
		System.out.println(msg);
		
		/*
		* Exemplo Laço de Repetição For:
		* * Declaração da variavel contadora e inicialização - int i = 0;
		* * Expressão Lógica - i <= 10;
		* * Incremento - i++
		*/
		
		msg = "\nTABUADA DO 5: \n";
		for ( int i = 0; i <= 10; i++ ) {
			msg += "5 X " + i + " = " + i*5 + "\n";
		}
		System.out.println(msg);
	}
}
