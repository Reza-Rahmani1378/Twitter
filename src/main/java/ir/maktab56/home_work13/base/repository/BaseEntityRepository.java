package ir.maktab56.home_work13.base.repository;

import ir.maktab56.home_work13.base.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityRepository<E extends BaseEntity<ID>, ID extends Serializable> {

    E save(E e);

    E findById(ID id);

    List<E> findAll();

    void delete(E e);

    Boolean existById(ID id);

    EntityManager getEntityManger();

}
