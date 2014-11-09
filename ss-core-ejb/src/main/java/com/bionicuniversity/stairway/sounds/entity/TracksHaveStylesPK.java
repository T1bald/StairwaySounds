package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by happy on 09/11/2014.
 */
public class TracksHaveStylesPK implements Serializable {
    private Integer tracksIdTrack;
    private Integer stylesIdStyle;

    @Column(name = "tracks_id_track")
    @Id
    public Integer getTracksIdTrack() {
        return tracksIdTrack;
    }

    public void setTracksIdTrack(Integer tracksIdTrack) {
        this.tracksIdTrack = tracksIdTrack;
    }

    @Column(name = "styles_id_style")
    @Id
    public Integer getStylesIdStyle() {
        return stylesIdStyle;
    }

    public void setStylesIdStyle(Integer stylesIdStyle) {
        this.stylesIdStyle = stylesIdStyle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksHaveStylesPK that = (TracksHaveStylesPK) o;

        if (stylesIdStyle != null ? !stylesIdStyle.equals(that.stylesIdStyle) : that.stylesIdStyle != null)
            return false;
        if (tracksIdTrack != null ? !tracksIdTrack.equals(that.tracksIdTrack) : that.tracksIdTrack != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tracksIdTrack != null ? tracksIdTrack.hashCode() : 0;
        result = 31 * result + (stylesIdStyle != null ? stylesIdStyle.hashCode() : 0);
        return result;
    }
}
