package pl.komorowski.currenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.komorowski.currenda.model.Track;
import pl.komorowski.currenda.repository.TrackRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{

    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> listAll() {
        List<Track> products = new ArrayList<>();
        trackRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Track saveOrUpdate(Track product) {
        trackRepository.save(product);
        return product;
    }

    @Override
    public void delete(int id) {
        trackRepository.deleteById(id);
    }
}
