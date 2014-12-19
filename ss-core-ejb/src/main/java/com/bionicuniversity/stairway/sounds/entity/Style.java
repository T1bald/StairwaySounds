package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "styles")
@AttributeOverride(name = "id", column = @Column(name = "id_style"))
public class Style extends AbstractEntity {

    @Column(name = "style_name", nullable = false)
    private String styleName;

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
        if (!super.equals(o)) return false;

        Style style = (Style) o;

        if (styleName != null ? !styleName.equals(style.styleName) : style.styleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (styleName != null ? styleName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Style{");
        sb.append("styleName='").append(styleName).append('\'');
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
