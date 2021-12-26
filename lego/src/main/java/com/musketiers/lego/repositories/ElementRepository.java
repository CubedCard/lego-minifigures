package com.musketiers.lego.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElementRepository<E> {
    List<E> findAll();
    E add(E element);
    E update(E element);
    boolean delete(E element);
    E findById(int id);
}
