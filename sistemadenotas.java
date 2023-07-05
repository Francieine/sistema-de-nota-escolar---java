package JavaBasico;

import java.util.Scanner;

public class SistemaDeNotas {

	public static void main(String[] args) {
		
		Scanner aluno = new Scanner (System.in);
		
		String firstName, secoName;
		
		int note1, note2, note3, note4;
		
		//dados pessoal do aluno 
		System.out.println("Digite o primeiro nome do aluno: ");
		firstName = aluno.next();
				
		System.out.println("Digite o sobrenome nome do aluno: ");
		secoName = aluno.next();
		
		
		//dados das notas do aluno
		System.out.println("Digite a nota do aluno" + firstName + "para diciplina de portugues: ");
		note1 = aluno.nextInt();
		
		System.out.println("Digite a nota do aluno" + firstName + "para diciplina de matematica: ");
		note2 = aluno.nextInt();
		
		System.out.println("Digite a nota do aluno" + firstName + "para diciplina de ciencias: ");
		note3 = aluno.nextInt();
		
		System.out.println("Digite a nota do aluno" + firstName + "para diciplina de geografia: ");
		note4 = aluno.nextInt();
		
		
		// fazendo a condicional
		int media = (note1 + note2 + note3 + note4)/4;
		
		if(media >= 60) {
			System.out.println("O aluno está Aprovado! =D a media da suas notas foi: " + media);
		}else if(media <= 10){
			System.out.println("O aluno está Reprovado! =( a media da suas notas foi: " + media);
			
		}else {		
		 System.out.println("O aluno está de Recuperação! =/ a media da suas notas foi:" + media);
		}
	}
}
