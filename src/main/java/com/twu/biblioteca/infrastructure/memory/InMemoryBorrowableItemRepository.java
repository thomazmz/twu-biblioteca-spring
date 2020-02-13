package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItem;
import com.twu.biblioteca.domain.borrowableItem.BorrowableItemRepository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class InMemoryBorrowableItemRepository<T extends BorrowableItem> extends InMemoryEntityRepository<T> implements BorrowableItemRepository<T> {

    public InMemoryBorrowableItemRepository(List<T> borrowableItems) {
        super();
        borrowableItems.forEach(item -> create(item));
    }

    public InMemoryBorrowableItemRepository() {
        super();
    }

    public Set<T> getAvailables() {
        return getAll()
                .stream()
                .filter(BorrowableItem::isAvailable)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<T> getItemsByBorrowerId(Long borrowerId) {
        return super.getAll()
                .stream()
                .filter(item -> !item.isAvailable() && item.getBorrower().get().getId().equals(borrowerId))
                .collect(Collectors.toSet());
    }
}
