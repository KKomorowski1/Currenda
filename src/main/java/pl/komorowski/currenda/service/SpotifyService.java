package pl.komorowski.currenda.service;

import pl.komorowski.currenda.model.api.formatted.FormattedArtists;
import pl.komorowski.currenda.model.api.formatted.FormattedTracks;

import java.io.IOException;
import java.util.List;

public interface SpotifyService {

    List<FormattedArtists> getArtistsFromSpotify(String artist) throws IOException;
    List<FormattedTracks> getTracksFromSpotify(String track) throws IOException;

}
