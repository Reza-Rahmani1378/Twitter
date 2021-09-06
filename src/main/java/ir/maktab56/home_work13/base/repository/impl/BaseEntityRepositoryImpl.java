package ir.maktab56.home_work13.base.repository.impl;

import ir.maktab56.home_work13.base.domain.BaseEntity;
import ir.maktab56.home_work13.base.repository.BaseEntityRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class BaseEntityRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable>
        implements BaseEntityRepository<E, ID> {

    private final EntityManager entityManager;


    protected BaseEntityRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();

    @Override
    public E save(E e) {
        if (e.getId() == null) {
            entityManager.persist(e);
            return e;
        }
        entityManager.merge(e);
        return e;
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<E> findAll() {
        return entityManager.createQuery(
                "from" + getEntityClass().getSimpleName(),
                getEntityClass()
        ).getResultList();
    }

    // implement hard delete
    @Override
    public void delete(E e) {
        entityManager.remove(e);
    }

    @Override
    public Boolean existById(ID id) {
        return entityManager.createQuery(
                "select count(id) from " + getEntityClass().getSimpleName() +
                        " WHERE id:=id",
                Long.class
        ).setParameter("id", id).getSingleResult() == 1L;
    }

    @Override
    public EntityManager getEntityManger() {
        return entityManager;
    }
}
