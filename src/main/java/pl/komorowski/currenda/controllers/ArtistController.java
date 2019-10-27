package pl.komorowski.currenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.komorowski.currenda.model.Artist;
import pl.komorowski.currenda.service.ArtistService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("artist")
public class ArtistController {

    private ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List getAllArtist(){
        return artistService.listAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addArtist(@RequestBody Artist artist){
        List allArtists = artistService.listAll();
        if (allArtists.isEmpty()) {
            artistService.saveOrUpdate(artist);
        } else {
            int sizeOfList = allArtists.size();
            Artist lastArtist = (Artist) allArtists.get(sizeOfList - 1);
            artist.setId(lastArtist.getId() + 1);
            artistService.saveOrUpdate(artist);
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteArtist(@PathVariable int id){
        artistService.delete(id);
    }


}
