package tn.esprit.exercice.exercice.service;

import java.util.List;

public interface IgenericService <T,ID>{
    List<T> retrieveAll();
      T add (T entity);
      void delete(ID id);
      T retrieve(ID id) ;
      T update (T entity) ;
}
