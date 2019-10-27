package pl.komorowski.currenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.komorowski.currenda.model.Track;
import pl.komorowski.currenda.service.TrackService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("track")
public class TrackController {

    private TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List getAllTrack(){
        return trackService.listAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addTrack(@RequestBody Track track){
        List allTracks = trackService.listAll();
        if (allTracks.isEmpty()) {
            trackService.saveOrUpdate(track);
        } else {
            int sizeOfList = allTracks.size();
            Track lastTrack = (Track) allTracks.get(sizeOfList - 1);
            track.setId(lastTrack.getId() + 1);
            trackService.saveOrUpdate(track);
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTrack(@PathVariable int id){
        trackService.delete(id);
    }

}
