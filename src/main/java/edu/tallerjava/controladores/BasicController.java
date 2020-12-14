package edu.tallerjava.controladores;

import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@RestController
public class BasicController {

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping(path = "/isAlive")
    public String smoke(){
        return "=)";
    }

    @GetMapping(path = "/categories")
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Optional<Category>> getCategory(@PathVariable Long id){

        Optional<Category> category = categoryRepository.findById(id);

        if(!category.isPresent()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(category,HttpStatus.OK) ;
    }


}
