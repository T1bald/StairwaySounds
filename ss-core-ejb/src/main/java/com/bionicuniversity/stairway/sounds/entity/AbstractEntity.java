package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by happy on 14/11/2014.
 */

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "creating_timestamp")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creatingTimeStamp;

    @Column(name = "last_changing_timestamp")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastChangingTimeStamp;

    @Column(name = "deleted")
    private Boolean wasDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatingTimeStamp() {
        return creatingTimeStamp;
    }

    public void setCreatingTimeStamp(Date creatingTimeStamp) {
        this.creatingTimeStamp = creatingTimeStamp;
    }

    public Date getLastChangingTimeStamp() {
        return lastChangingTimeStamp;
    }

    public void setLastChangingTimeStamp(Date lastChangingTimeStamp) {
        this.lastChangingTimeStamp = lastChangingTimeStamp;
    }

    public Boolean getWasDeleted() {
        return wasDeleted;
    }

    public void setWasDeleted(Boolean deleted) {
        this.wasDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity that = (AbstractEntity) o;

        if (creatingTimeStamp != null ? !creatingTimeStamp.equals(that.creatingTimeStamp) : that.creatingTimeStamp != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wasDeleted != null ? !wasDeleted.equals(that.wasDeleted) : that.wasDeleted != null) return false;
        if (lastChangingTimeStamp != null ? !lastChangingTimeStamp.equals(that.lastChangingTimeStamp) : that.lastChangingTimeStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (creatingTimeStamp != null ? creatingTimeStamp.hashCode() : 0);
        result = 31 * result + (lastChangingTimeStamp != null ? lastChangingTimeStamp.hashCode() : 0);
        result = 31 * result + (wasDeleted != null ? wasDeleted.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", creatingTimeStamp=" + creatingTimeStamp +
                ", lastChangingTimeStamp=" + lastChangingTimeStamp +
                ", wasDelete=" + wasDeleted +
                '}';
    }
}
