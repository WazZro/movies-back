package com.psuti.movies.classes;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.psuti.movies.services.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class EntityResolver extends SimpleObjectIdResolver {
    @Autowired
    private EntityManager entityManager;

    public EntityResolver() {
        this.entityManager = BeanUtil.getBean(EntityManager.class);
    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey id) {
        Object resolved = super.resolveId(id);

        if (resolved == null) {
            resolved = this.entityManager.find(id.scope, id.key);
            this.bindItem(id, resolved);
        }
        return resolved;
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object context) {
        return new EntityResolver();
    }

    @Override
    public boolean canUseFor(ObjectIdResolver resolverType) {
        return resolverType.getClass() == EntityResolver.class;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
