package com.twu.biblioteca.domain.borrowableItem;

import com.twu.biblioteca.domain.UnavailableResourceException;
import com.twu.biblioteca.domain.UnregisteredEntityIdException;
import com.twu.biblioteca.domain.user.User;

import java.util.Set;

public abstract class BorrowableItemService<T extends BorrowableItem> {

    private BorrowableItemRepository<T> borrowableItemRepository;

    public BorrowableItemService(BorrowableItemRepository borrowableItemRepository) {
        this.borrowableItemRepository = borrowableItemRepository;
    }

    public Set<T> getAll() {
        return this.borrowableItemRepository.getAll();
    }

    public Set<T> getAvailables() {
        return this.borrowableItemRepository.getAvailables();
    }

    public T checkOut(Long id, User borrower) throws UnregisteredEntityIdException, UnavailableResourceException {
        T borrowableItem = this.borrowableItemRepository.getById(id);

        if(!borrowableItem.isAvailable())
            throw new UnavailableResourceException();

        borrowableItem.checkOut(borrower);
        return borrowableItem;
    }

    public T checkIn(Long id) throws UnregisteredEntityIdException, UnavailableResourceException {
        T borrowableItem = this.borrowableItemRepository.getById(id);

        if(borrowableItem.isAvailable())
            throw new UnavailableResourceException();

        borrowableItem.checkIn();
        return borrowableItem;
    }

    public Set<T> getItemsByBorrowerId(Long borrowerId) {
        return borrowableItemRepository.getItemsByBorrowerId(borrowerId);
    }

    public T create(T item) {
        return this.borrowableItemRepository.create(item);
    };
}