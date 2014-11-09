package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "tracks_have_styles", schema = "", catalog = "stairway_sounds")
@IdClass(TracksHaveStylesPK.class)
public class TracksHaveStyles {
    private Integer tracksIdTrack;
    private Integer stylesIdStyle;
    private Tracks tracksByTracksIdTrack;
    private Styles stylesByStylesIdStyle;

    @Id
    @Column(name = "tracks_id_track")
    public Integer getTracksIdTrack() {
        return tracksIdTrack;
    }

    public void setTracksIdTrack(Integer tracksIdTrack) {
        this.tracksIdTrack = tracksIdTrack;
    }

    @Id
    @Column(name = "styles_id_style")
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

        TracksHaveStyles that = (TracksHaveStyles) o;

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

    @ManyToOne
    @JoinColumn(name = "tracks_id_track", referencedColumnName = "id_track", nullable = false)
    public Tracks getTracksByTracksIdTrack() {
        return tracksByTracksIdTrack;
    }

    public void setTracksByTracksIdTrack(Tracks tracksByTracksIdTrack) {
        this.tracksByTracksIdTrack = tracksByTracksIdTrack;
    }

    @ManyToOne
    @JoinColumn(name = "styles_id_style", referencedColumnName = "id_style", nullable = false)
    public Styles getStylesByStylesIdStyle() {
        return stylesByStylesIdStyle;
    }

    public void setStylesByStylesIdStyle(Styles stylesByStylesIdStyle) {
        this.stylesByStylesIdStyle = stylesByStylesIdStyle;
    }
}
