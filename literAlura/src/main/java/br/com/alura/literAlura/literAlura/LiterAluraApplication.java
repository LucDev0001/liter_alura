package br.com.alura.literAlura.literAlura;

import br.com.alura.literAlura.literAlura.model.Livro;
import br.com.alura.literAlura.literAlura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem-vindo ao LiterAlura!");

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Listar todos os livros");
			System.out.println("2. Buscar livros por autor");
			System.out.println("3. Buscar livros por título");
			System.out.println("4. Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();  // Consume newline

			switch (opcao) {
				case 1:
					List<Livro> livros = livroRepository.findAll();
					livros.forEach(System.out::println);
					break;
				case 2:
					System.out.println("Digite o autor:");
					String autor = scanner.nextLine();
					List<Livro> livrosPorAutor = livroRepository.findByAutor(autor);
					livrosPorAutor.forEach(System.out::println);
					break;
				case 3:
					System.out.println("Digite o título:");
					String titulo = scanner.nextLine();
					List<Livro> livrosPorTitulo = livroRepository.findByTituloContaining(titulo);
					livrosPorTitulo.forEach(System.out::println);
					break;
				case 4:
					System.out.println("Saindo...");
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
