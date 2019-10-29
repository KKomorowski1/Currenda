package pl.komorowski.currenda.model.api.formatted;

public class FormattedTracks {

    private String track;

    public FormattedTracks(String track) {
        this.track = track;
    }

    public FormattedTracks() {
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "FormattedTracks{" +
                "track='" + track + '\'' +
                '}';
    }
}
