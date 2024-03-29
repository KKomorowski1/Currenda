package pl.komorowski.currenda.controllers.spotify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.komorowski.currenda.model.api.formatted.FormattedArtists;
import pl.komorowski.currenda.model.api.formatted.FormattedTracks;
import pl.komorowski.currenda.service.SpotifyService;

import java.io.IOException;

import java.util.List;

@RestController
@CrossOrigin
public class SpotifyController {

    private SpotifyService spotifyService;

    @Autowired
    public SpotifyController(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @RequestMapping("formattedArtist/{artist}")
    public List<FormattedArtists> getArtistsFromSpotify(@PathVariable String artist) throws IOException {
        return spotifyService.getArtistsFromSpotify(artist);
    }

    @RequestMapping("formattedTrack/{track}")
    public List<FormattedTracks> getTracksFromSpotify(@PathVariable String track) throws IOException {
        return spotifyService.getTracksFromSpotify(track);
    }
}
