package pl.komorowski.currenda.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.komorowski.currenda.controllers.spotify.TokenController;
import pl.komorowski.currenda.model.api.artist.Artists;
import pl.komorowski.currenda.model.api.artist.Items;
import pl.komorowski.currenda.model.api.formatted.FormattedArtists;
import pl.komorowski.currenda.model.api.formatted.FormattedTracks;
import pl.komorowski.currenda.model.api.track.Item;
import pl.komorowski.currenda.model.api.track.Tracks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SpotifyServiceImpl implements SpotifyService{

    @Override
    public List<FormattedArtists> getArtistsFromSpotify(String artist) throws IOException {
        String uri = "https://api.spotify.com/v1/search?query="+artist+"&offset=0&limit=50&type=artist";

        ObjectMapper mapper = new ObjectMapper();

        Artists artists = mapper.readValue(sendRequestWithToken(uri), Artists.class).getArtists();

        List<FormattedArtists> listOfNames = new ArrayList<>();
        List<Items> list = artists.getItems();

        for (Items items : list) {
            listOfNames.add(new FormattedArtists(items.getName()));
        }

        return listOfNames;
    }

    @Override
    public List<FormattedTracks> getTracksFromSpotify(String track) throws IOException {
        String uri = "https://api.spotify.com/v1/search?query=track:"+track+"&offset=0&limit=50&type=track&market=PL";
        ObjectMapper mapper = new ObjectMapper();

        Tracks tracks = mapper.readValue(sendRequestWithToken(uri), Tracks.class).getTracks();
        List<Item> list = tracks.getItems();
        List<FormattedTracks> listOfTracks = new ArrayList<>();
        for (Item item: list) {
            listOfTracks.add(new FormattedTracks(item.getName()));
        }

        return listOfTracks;
    }

    private String sendRequestWithToken(String uri){

        TokenController tokenController = new TokenController();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.setBearerAuth(tokenController.postForToken().getAccess_token());

        HttpEntity<String> entityReq= new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entityReq, String.class);

        return result.getBody();
    }
}
