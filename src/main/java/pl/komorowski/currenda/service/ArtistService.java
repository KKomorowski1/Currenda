package pl.komorowski.currenda.service;

import pl.komorowski.currenda.model.Artist;

import java.util.List;

public interface ArtistService {

    List<Artist> listAll();

    Artist saveOrUpdate(Artist artist);

    void delete(int id);

}
