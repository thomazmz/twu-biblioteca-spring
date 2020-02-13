package com.twu.biblioteca.domain.borrowableItem;

import com.twu.biblioteca.domain.EntityRepository;

import java.util.Set;

public interface BorrowableItemRepository<T extends BorrowableItem> extends EntityRepository<T> {

    Set<T> getAvailables();

    Set<T> getItemsByBorrowerId(Long borrowerId);
}