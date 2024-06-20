package com.distribuida.repo;

import com.distribuida.db.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class BookRepository implements PanacheRepositoryBase<Book,Integer> {

}
