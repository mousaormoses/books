package com.app.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

	List<Books> findByPublished(boolean published);
	List<Books> findByTitleContaining(String title);
}
