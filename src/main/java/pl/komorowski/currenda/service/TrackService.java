package pl.komorowski.currenda.service;

import pl.komorowski.currenda.model.Track;

import java.util.List;

public interface TrackService {

    List<Track> listAll();

    Track saveOrUpdate(Track track);

    void delete(int id);

}
