package com.example.Performers;

import java.util.List;

        import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author DT User
 */
public interface NewsRepository extends
        CrudRepository<News, Long> {

    List<News> findByMessage(String message);
    News findByNotificationId(Long id);
}