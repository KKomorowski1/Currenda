package pl.komorowski.currenda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.komorowski.currenda.model.Track;

public interface TrackRepository extends CrudRepository<Track, Integer> {
}
