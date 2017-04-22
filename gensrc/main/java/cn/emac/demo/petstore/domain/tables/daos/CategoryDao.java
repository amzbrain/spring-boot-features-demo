/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.daos;


import cn.emac.demo.petstore.domain.tables.Category;
import cn.emac.demo.petstore.domain.tables.records.CategoryRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Categorias
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class CategoryDao extends DAOImpl<CategoryRecord, cn.emac.demo.petstore.domain.tables.pojos.Category, String> {

    /**
     * Create a new CategoryDao without any configuration
     */
    public CategoryDao() {
        super(Category.CATEGORY, cn.emac.demo.petstore.domain.tables.pojos.Category.class);
    }

    /**
     * Create a new CategoryDao with an attached configuration
     */
    @Autowired
    public CategoryDao(Configuration configuration) {
        super(Category.CATEGORY, cn.emac.demo.petstore.domain.tables.pojos.Category.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.emac.demo.petstore.domain.tables.pojos.Category object) {
        return object.getCatid();
    }

    /**
     * Fetch records that have <code>catid IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Category> fetchByCatid(String... values) {
        return fetch(Category.CATEGORY.CATID, values);
    }

    /**
     * Fetch a unique record that has <code>catid = value</code>
     */
    public cn.emac.demo.petstore.domain.tables.pojos.Category fetchOneByCatid(String value) {
        return fetchOne(Category.CATEGORY.CATID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Category> fetchByName(String... values) {
        return fetch(Category.CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>descn IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Category> fetchByDescn(String... values) {
        return fetch(Category.CATEGORY.DESCN, values);
    }
}
