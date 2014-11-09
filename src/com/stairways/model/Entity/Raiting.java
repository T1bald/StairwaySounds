package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class Raiting implements Serializable{

    private int idRaiting;
    private String downloads;

    public int getIdRaiting() {
        return idRaiting;
    }

    public void setIdRaiting(int idRaiting) {
        this.idRaiting = idRaiting;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raiting that = (Raiting) o;

        if (idRaiting != that.idRaiting) return false;
        if (downloads != null ? !downloads.equals(that.downloads) : that.downloads != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRaiting;
        result = 31 * result + (downloads != null ? downloads.hashCode() : 0);
        return result;
    }
}
