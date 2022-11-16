package tn.esprit.exercice.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;

@NoRepositoryBean
public interface GenericRepo <T, ID> extends JpaRepository<T, ID> {
}
