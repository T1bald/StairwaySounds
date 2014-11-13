package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "tracks_additional_info")
public class TrackAdditionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_additional_info")
    private Integer additionalInfoId;

    @Column(name = "country")
    private String country;

    @Column(name = "language")
    private String language;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "label")
    private String label;

    public Integer getAdditionalInfoId() {
        return additionalInfoId;
    }

    public void setAdditionalInfoId(Integer idAdditionalInfo) {
        this.additionalInfoId = idAdditionalInfo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

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

        TrackAdditionalInfo that = (TrackAdditionalInfo) o;

        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (additionalInfoId != null ? !additionalInfoId.equals(that.additionalInfoId) : that.additionalInfoId != null)
            return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(that.yearOfIssue) : that.yearOfIssue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = additionalInfoId != null ? additionalInfoId.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
