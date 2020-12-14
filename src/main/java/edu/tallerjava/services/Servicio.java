package edu.tallerjava.services;

import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class Servicio {
    @Autowired
    private CategoryRepository categoryRepository;

    public String alive () {
        return "=)";
    }

    @Transactional
    public List<Category> obtenerCategorias () {
        return categoryRepository.findAll();
    }

    @Transactional
    public ResponseEntity<Optional<Category>> obtenerPorID (long id) {
        Optional<Category> category = categoryRepository.findById(id);

        if(!category.isPresent()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(category,HttpStatus.OK) ;
    }
}
