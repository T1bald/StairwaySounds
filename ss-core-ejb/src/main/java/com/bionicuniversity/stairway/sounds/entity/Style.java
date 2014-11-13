package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "styles")
public class Style {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_style")
    private Integer styleId;

    @Column(name = "style_name", nullable = false)
    private String styleName;

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer idStyle) {
        this.styleId = idStyle;
    }

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

        Style style = (Style) o;

        if (styleId != null ? !styleId.equals(style.styleId) : style.styleId != null) return false;
        if (styleName != null ? !styleName.equals(style.styleName) : style.styleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = styleId != null ? styleId.hashCode() : 0;
        result = 31 * result + (styleName != null ? styleName.hashCode() : 0);
        return result;
    }
}
