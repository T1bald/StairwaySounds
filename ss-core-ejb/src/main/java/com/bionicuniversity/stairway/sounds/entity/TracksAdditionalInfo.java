package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "tracks_additional_info", schema = "", catalog = "stairway_sounds")
public class TracksAdditionalInfo {
    private Integer idAdditionalInfo;
    private String country;
    private String language;
    private String yearOfIssue;
    private String label;

    @Id
    @Column(name = "id_additional_info")
    public Integer getIdAdditionalInfo() {
        return idAdditionalInfo;
    }

    public void setIdAdditionalInfo(Integer idAdditionalInfo) {
        this.idAdditionalInfo = idAdditionalInfo;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "year_of_issue")
    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksAdditionalInfo that = (TracksAdditionalInfo) o;

        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (idAdditionalInfo != null ? !idAdditionalInfo.equals(that.idAdditionalInfo) : that.idAdditionalInfo != null)
            return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(that.yearOfIssue) : that.yearOfIssue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdditionalInfo != null ? idAdditionalInfo.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
