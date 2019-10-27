package pl.komorowski.currenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.komorowski.currenda.model.Artist;
import pl.komorowski.currenda.repository.ArtistRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService{

    private ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listAll() {
        List<Artist> products = new ArrayList<>();
        artistRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Artist saveOrUpdate(Artist artist) {
        artistRepository.save(artist);
        return artist;
    }

    @Override
    public void delete(int id) {
        artistRepository.deleteById(id);
    }
}
