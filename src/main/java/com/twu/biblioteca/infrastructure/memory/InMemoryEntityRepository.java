package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.Entity;
import com.twu.biblioteca.domain.UnregisteredEntityIdException;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class InMemoryEntityRepository<T extends Entity> {

    private Long counter;

    private Map<Long, T> instances = new LinkedHashMap<>();

    public InMemoryEntityRepository() {
        counter = 0L;
    }

    public Set<T> getAll() {
        return new LinkedHashSet<>(instances.values());
    }

    public T getById(Long id) throws UnregisteredEntityIdException {
        if(!instances.containsKey(id))
            throw new UnregisteredEntityIdException();
        return instances.get(id);
    }

    public T create(T instance) {
        instance.setId(++counter);
        instances.put(counter, instance);
        return instance;
    }

    public void delete(Long instanceId) {
        if(instances.get(instanceId) != null)
            instances.remove(instanceId);
    }
}