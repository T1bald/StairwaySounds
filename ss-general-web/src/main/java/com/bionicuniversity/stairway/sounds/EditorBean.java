package com.bionicuniversity.stairway.sounds;

import javax.faces.bean.ManagedBean;

/**
 * Created by happy on 05/12/2014.
 */

@ManagedBean(name = "editor")
public class EditorBean {

    private String value = "PrimerFace bean value.";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
