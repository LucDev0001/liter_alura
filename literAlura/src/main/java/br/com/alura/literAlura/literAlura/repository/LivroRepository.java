package br.com.alura.literAlura.literAlura.repository;

import br.com.alura.literAlura.literAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    static void saveAll(List<Livro> livros) {
    }

    List<Livro> findByAutor(String autor);
    List<Livro> findByTituloContaining(String titulo);
}