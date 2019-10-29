
package pl.komorowski.currenda.model.api.track;

import java.util.List;

public class Album {

    private String album_type;
    private List<Artist> artists = null;
    private ExternalUrls_ external_urls;
    private String href;
    private String id;
    private List<Image> images = null;
    private String name;
    private String release_date;
    private String release_date_precision;
    private Integer total_tracks;
    private String type;
    private String uri;

    public Album() {
    }


    public Album(String album_type, List<Artist> artists, ExternalUrls_ external_urls, String href, String id, List<Image> images, String name, String release_date, String release_date_precision, Integer total_tracks, String type, String uri) {
        super();
        this.album_type = album_type;
        this.artists = artists;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.release_date = release_date;
        this.release_date_precision = release_date_precision;
        this.total_tracks = total_tracks;
        this.type = type;
        this.uri = uri;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public ExternalUrls_ getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrls_ external_urls) {
        this.external_urls = external_urls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRelease_date_precision() {
        return release_date_precision;
    }

    public void setRelease_date_precision(String release_date_precision) {
        this.release_date_precision = release_date_precision;
    }

    public Integer getTotal_tracks() {
        return total_tracks;
    }

    public void setTotal_tracks(Integer total_tracks) {
        this.total_tracks = total_tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Album{" +
                "album_type='" + album_type + '\'' +
                ", artists=" + artists +
                ", external_urls=" + external_urls +
                ", href='" + href + '\'' +
                ", id='" + id + '\'' +
                ", images=" + images +
                ", name='" + name + '\'' +
                ", release_date='" + release_date + '\'' +
                ", release_date_precision='" + release_date_precision + '\'' +
                ", total_tracks=" + total_tracks +
                ", type='" + type + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
