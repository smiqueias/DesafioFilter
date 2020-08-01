package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<FilmesMDB> notesMovies = new ArrayList<>();
		boolean running = true;

		System.out.println("==== CONTROLE DE NOTAS DO IMDB====");
		System.out.println("[1] - Adicionar filme");
		System.out.println("[2] - Listar todos os filmes");
		System.out.println("[3] - Filtrar por notas acima de 6,0");
		System.out.println("[4] - Sair do sistema");
		
		while (running) {

			String userOption = input.nextLine();

			switch (userOption) {

			case "1":
				System.out.println("Insira o nome e a nota do IMDb do filme");

				System.out.print("Nome | ");
				String nameMovie = input.nextLine();

				System.out.print("Nota do filme " + nameMovie + " | ");
				double movieNote = input.nextDouble();

				FilmesMDB filmes = new FilmesMDB(nameMovie, movieNote);
				
				notesMovies.add(filmes);
				
				
				break;
				
			case "2":
				notesMovies.stream().map(movies -> movies.getName()).forEach(System.out::println);
					
				break;
				
			
			case "3":
			notesMovies
			.stream()
			.filter(n -> n.getImdb() > 6).map(n ->"Melhores filmes | "+n.getImdb()+ n.getName()).forEach(System.out::println);
				
			
			break;
			case "4":
				running = false;
				break;
			}

		}

	}

}
