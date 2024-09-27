package com.riwi.TechQuest.domain.persistence.imodels;

public interface ICrud<E, D> {
    D create(E entity);
    D read(Long id);
    D update(E entity);
    void delete(Long id);
}
