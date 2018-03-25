package br.com.devlog.springbootmultipledatabases.db.mysql.repository;

import br.com.devlog.springbootmultipledatabases.db.mysql.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to access People table.
 *
 * Repository: <a>https://github.com/heliomf-dev/spring-boot-multiple-databases</a>
 * @author Hélio Márcio Filho <My GitHub: <a>https://github.com/heliomf-dev</a>>
 * @version 1.0
 * @since 1.0
 * */
@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
