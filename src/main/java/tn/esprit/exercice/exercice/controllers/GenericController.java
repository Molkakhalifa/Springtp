package tn.esprit.exercice.exercice.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exercice.exercice.service.IgenericService;

import java.util.List;

@RestController
@RequestMapping("/T")
public class GenericController <T,ID> {



    @Autowired
    IgenericService <T,ID>  igenericService;
    @PostMapping("/add")
    public T add(@RequestBody T entity) {
        return igenericService.add(entity);
    }


    @GetMapping("/getall")
    public List<T> retrieveAll() {
        return igenericService.retrieveAll();
    }

    @GetMapping("{id}")
    public T retrieve(@PathVariable  ID o) {
        return igenericService.retrieve(o);
    }

    @PutMapping("/update")
    public T update (@RequestBody T entity ) {
        return igenericService.update(entity);

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable ID o ) {
        igenericService.delete(o);

    }

}
