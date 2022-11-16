package tn.esprit.exercice.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class IgenericServiceimp<T,ID>  implements IgenericService<T,ID>{
@Autowired
JpaRepository<T,ID> genericService;

    @Override
    public List<T> retrieveAll() {
        return genericService.findAll();
    }

    @Override
    public T add (T entity) {
        return genericService.save(entity);
    }

    @Override
    public void delete(ID o) {
        genericService.deleteById(o);
    }

    @Override
    public T retrieve(ID o) {
        return genericService.findById(o).orElse(null);
    }


    @Override
    public T update (T entity) {
        return genericService.save(entity);
    }
}
