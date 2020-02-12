package com.twu.biblioteca.domain.borrowableItem;

import com.twu.biblioteca.domain.EntityRepository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BorrowableItemRepository<T extends BorrowableItem> extends EntityRepository<T> {

    public BorrowableItemRepository(List<T> borrowableItems) {
        super();
        borrowableItems.forEach(item -> create(item));
    }

    public BorrowableItemRepository() {
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