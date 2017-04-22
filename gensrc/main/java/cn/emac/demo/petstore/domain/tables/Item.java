/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables;


import cn.emac.demo.petstore.domain.Jpetstore;
import cn.emac.demo.petstore.domain.Keys;
import cn.emac.demo.petstore.domain.tables.records.ItemRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Itens
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Item extends TableImpl<ItemRecord> {

    private static final long serialVersionUID = -358075;

    /**
     * The reference instance of <code>jpetstore.item</code>
     */
    public static final Item ITEM = new Item();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemRecord> getRecordType() {
        return ItemRecord.class;
    }

    /**
     * The column <code>jpetstore.item.itemid</code>.
     */
    public final TableField<ItemRecord, String> ITEMID = createField("itemid", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>jpetstore.item.productid</code>.
     */
    public final TableField<ItemRecord, String> PRODUCTID = createField("productid", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>jpetstore.item.listprice</code>.
     */
    public final TableField<ItemRecord, BigDecimal> LISTPRICE = createField("listprice", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * The column <code>jpetstore.item.unitcost</code>.
     */
    public final TableField<ItemRecord, BigDecimal> UNITCOST = createField("unitcost", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * The column <code>jpetstore.item.supplier</code>.
     */
    public final TableField<ItemRecord, Integer> SUPPLIER = createField("supplier", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jpetstore.item.status</code>.
     */
    public final TableField<ItemRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * The column <code>jpetstore.item.attr1</code>.
     */
    public final TableField<ItemRecord, String> ATTR1 = createField("attr1", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>jpetstore.item.attr2</code>.
     */
    public final TableField<ItemRecord, String> ATTR2 = createField("attr2", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>jpetstore.item.attr3</code>.
     */
    public final TableField<ItemRecord, String> ATTR3 = createField("attr3", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>jpetstore.item.attr4</code>.
     */
    public final TableField<ItemRecord, String> ATTR4 = createField("attr4", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>jpetstore.item.attr5</code>.
     */
    public final TableField<ItemRecord, String> ATTR5 = createField("attr5", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * Create a <code>jpetstore.item</code> table reference
     */
    public Item() {
        this("item", null);
    }

    /**
     * Create an aliased <code>jpetstore.item</code> table reference
     */
    public Item(String alias) {
        this(alias, ITEM);
    }

    private Item(String alias, Table<ItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Item(String alias, Table<ItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Itens");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jpetstore.JPETSTORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ItemRecord> getPrimaryKey() {
        return Keys.KEY_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemRecord>>asList(Keys.KEY_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ItemRecord, ?>>asList(Keys.ITEM_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item as(String alias) {
        return new Item(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(String name) {
        return new Item(name, null);
    }
}
