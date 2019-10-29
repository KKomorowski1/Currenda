
package pl.komorowski.currenda.model.api.track;

import java.util.List;

public class Item {

    private Album album;
    private List<Artist_> artists = null;
    private Integer disc_number;
    private Integer duration_ms;
    private Boolean explicit;
    private ExternalIds external_ids;
    private ExternalUrls___ external_urls;
    private String href;
    private String id;
    private Boolean is_local;
    private Boolean is_playable;
    private String name;
    private Integer popularity;
    private String preview_url;
    private Integer track_number;
    private String type;
    private String uri;

    public Item() {
    }

    public Item(Album album, List<Artist_> artists, Integer disc_number, Integer duration_ms, Boolean explicit, ExternalIds external_ids, ExternalUrls___ externalUrls, String href, String id, Boolean is_local, Boolean is_playable, String name, Integer popularity, String previewUrl, Integer track_number, String type, String uri) {
        super();
        this.album = album;
        this.artists = artists;
        this.disc_number = disc_number;
        this.duration_ms = duration_ms;
        this.explicit = explicit;
        this.external_ids = external_ids;
        this.external_urls = externalUrls;
        this.href = href;
        this.id = id;
        this.is_local = is_local;
        this.is_playable = is_playable;
        this.name = name;
        this.popularity = popularity;
        this.preview_url = previewUrl;
        this.track_number = track_number;
        this.type = type;
        this.uri = uri;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Artist_> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist_> artists) {
        this.artists = artists;
    }

    public Integer getDisc_number() {
        return disc_number;
    }

    public void setDisc_number(Integer disc_number) {
        this.disc_number = disc_number;
    }

    public Integer getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(Integer duration_ms) {
        this.duration_ms = duration_ms;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public ExternalIds getExternal_ids() {
        return external_ids;
    }

    public void setExternal_ids(ExternalIds external_ids) {
        this.external_ids = external_ids;
    }

    public ExternalUrls___ getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrls___ external_urls) {
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

    public Boolean getIs_local() {
        return is_local;
    }

    public void setIs_local(Boolean is_local) {
        this.is_local = is_local;
    }

    public Boolean getIs_playable() {
        return is_playable;
    }

    public void setIs_playable(Boolean is_playable) {
        this.is_playable = is_playable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public Integer getTrack_number() {
        return track_number;
    }

    public void setTrack_number(Integer track_number) {
        this.track_number = track_number;
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
        return "Item{" +
                "album=" + album +
                ", artists=" + artists +
                ", disc_number=" + disc_number +
                ", duration_ms=" + duration_ms +
                ", explicit=" + explicit +
                ", external_ids=" + external_ids +
                ", external_urls=" + external_urls +
                ", href='" + href + '\'' +
                ", id='" + id + '\'' +
                ", is_local=" + is_local +
                ", is_playable=" + is_playable +
                ", name='" + name + '\'' +
                ", popularity=" + popularity +
                ", preview_url='" + preview_url + '\'' +
                ", track_number=" + track_number +
                ", type='" + type + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
