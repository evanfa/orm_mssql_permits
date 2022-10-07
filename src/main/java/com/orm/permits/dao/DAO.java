package com.orm.permits.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    /**
     *Query - Select by Id
     */
    Optional<T> get(long id);

    /**
     * Query - Select All
     */
    List<T> getAll();

    /**
     * Query - Insert
     */
    void saveRecord(T t);

    /**
     * Query - Update
     */
    void updateRecord(T t);

    /**
     * Query - Delete
     */
    void deleteRecord(T t);


}
