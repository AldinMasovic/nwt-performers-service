package com.example.Performers;

import java.util.List;

        import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author DT User
 */
public interface MusicRepository extends
        CrudRepository<Music, Long> {

    Music findByEventId(Long id);
}
