package ir.maktab56.home_work13.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@MappedSuperclass
public class BaseEntity<ID extends Serializable> implements Serializable{

    @Id
    @GeneratedValue
    private ID id;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "release_date")
    private Date date;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
