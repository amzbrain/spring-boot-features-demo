/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.records;


import cn.emac.demo.petstore.domain.tables.Lineitem;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Line Item
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineitemRecord extends UpdatableRecordImpl<LineitemRecord> implements Record5<Integer, Integer, String, Integer, BigDecimal> {

    private static final long serialVersionUID = 981405605;

    /**
     * Setter for <code>jpetstore.lineitem.orderid</code>.
     */
    public LineitemRecord setOrderid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.lineitem.orderid</code>.
     */
    public Integer getOrderid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jpetstore.lineitem.linenum</code>.
     */
    public LineitemRecord setLinenum(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.lineitem.linenum</code>.
     */
    public Integer getLinenum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jpetstore.lineitem.itemid</code>.
     */
    public LineitemRecord setItemid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.lineitem.itemid</code>.
     */
    public String getItemid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jpetstore.lineitem.quantity</code>.
     */
    public LineitemRecord setQuantity(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.lineitem.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jpetstore.lineitem.unitprice</code>.
     */
    public LineitemRecord setUnitprice(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.lineitem.unitprice</code>.
     */
    public BigDecimal getUnitprice() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Lineitem.LINEITEM.ORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Lineitem.LINEITEM.LINENUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Lineitem.LINEITEM.ITEMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Lineitem.LINEITEM.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Lineitem.LINEITEM.UNITPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLinenum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getItemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getUnitprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord value1(Integer value) {
        setOrderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord value2(Integer value) {
        setLinenum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord value3(String value) {
        setItemid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord value5(BigDecimal value) {
        setUnitprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LineitemRecord values(Integer value1, Integer value2, String value3, Integer value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LineitemRecord
     */
    public LineitemRecord() {
        super(Lineitem.LINEITEM);
    }

    /**
     * Create a detached, initialised LineitemRecord
     */
    public LineitemRecord(Integer orderid, Integer linenum, String itemid, Integer quantity, BigDecimal unitprice) {
        super(Lineitem.LINEITEM);

        set(0, orderid);
        set(1, linenum);
        set(2, itemid);
        set(3, quantity);
        set(4, unitprice);
    }
}
