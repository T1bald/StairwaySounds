package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Styles {
    private Integer idStyle;
    private String styleName;

    @Id
    @Column(name = "id_style")
    public Integer getIdStyle() {
        return idStyle;
    }

    public void setIdStyle(Integer idStyle) {
        this.idStyle = idStyle;
    }

    @Basic
    @Column(name = "style_name")
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Styles styles = (Styles) o;

        if (idStyle != null ? !idStyle.equals(styles.idStyle) : styles.idStyle != null) return false;
        if (styleName != null ? !styleName.equals(styles.styleName) : styles.styleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStyle != null ? idStyle.hashCode() : 0;
        result = 31 * result + (styleName != null ? styleName.hashCode() : 0);
        return result;
    }
}
