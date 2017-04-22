/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * Status de pedidos
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Orderstatus implements Serializable {

    private static final long serialVersionUID = -1903921423;

    private Integer orderid;
    private Integer linenum;
    private Date    timestamp;
    private String  status;

    public Orderstatus() {}

    public Orderstatus(Orderstatus value) {
        this.orderid = value.orderid;
        this.linenum = value.linenum;
        this.timestamp = value.timestamp;
        this.status = value.status;
    }

    public Orderstatus(
        Integer orderid,
        Integer linenum,
        Date    timestamp,
        String  status
    ) {
        this.orderid = orderid;
        this.linenum = linenum;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Integer getOrderid() {
        return this.orderid;
    }

    public Orderstatus setOrderid(Integer orderid) {
        this.orderid = orderid;
        return this;
    }

    public Integer getLinenum() {
        return this.linenum;
    }

    public Orderstatus setLinenum(Integer linenum) {
        this.linenum = linenum;
        return this;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public Orderstatus setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Orderstatus setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orderstatus (");

        sb.append(orderid);
        sb.append(", ").append(linenum);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
