package es.ernestorumo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository<E,I> extends JpaRepository<E,I> {

}
