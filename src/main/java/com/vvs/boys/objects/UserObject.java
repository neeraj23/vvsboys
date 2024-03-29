package com.vvs.boys.objects;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NRavi on 6/19/2019.
 */
@Entity
@Table(name = "tablenischal")
public class UserObject {

    @Id
    @Column(name = "user_id")
    private int userid;

    @Column(name = "user_name")
    private String username;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
