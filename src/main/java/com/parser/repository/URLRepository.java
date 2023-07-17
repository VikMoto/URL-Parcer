package com.parser.repository;


import com.parser.domain.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface URLRepository extends JpaRepository<URL, String> {

    @Query("SELECT u FROM URL u WHERE u.url = ?1")
    URL findByURL(String url);
}
