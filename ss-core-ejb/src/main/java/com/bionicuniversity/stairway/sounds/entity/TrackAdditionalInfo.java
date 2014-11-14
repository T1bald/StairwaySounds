package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "tracks_additional_info")
@AttributeOverride(name = "id", column = @Column(name = "id_additional_info"))
public class TrackAdditionalInfo extends AbstractEntity {

    @Column(name = "country")
    private String country;

    @Column(name = "language")
    private String language;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "label")
    private String label;

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
        if (!super.equals(o)) return false;

        TrackAdditionalInfo that = (TrackAdditionalInfo) o;

        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(that.yearOfIssue) : that.yearOfIssue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrackAdditionalInfo{");
        sb.append("country='").append(country).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", yearOfIssue='").append(yearOfIssue).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
