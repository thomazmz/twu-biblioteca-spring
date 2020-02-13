package com.twu.biblioteca.domain;

import java.util.Set;

public interface EntityRepository<T extends Entity> {

    Set<T> getAll();

    T getById(Long id)  throws UnregisteredEntityIdException;

    T create(T instance);

    void delete(Long instanceId);
}