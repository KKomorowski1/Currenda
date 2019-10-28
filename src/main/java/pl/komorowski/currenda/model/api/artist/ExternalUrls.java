
package pl.komorowski.currenda.model.api.artist;


public class ExternalUrls {

    private String spotify;

    public ExternalUrls() {
    }

    public ExternalUrls(String spotify) {
        super();
        this.spotify = spotify;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

}
