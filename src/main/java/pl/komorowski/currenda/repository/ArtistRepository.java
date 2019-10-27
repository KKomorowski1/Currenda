package pl.komorowski.currenda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.komorowski.currenda.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
