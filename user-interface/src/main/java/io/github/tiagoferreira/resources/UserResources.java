package io.github.tiagoferreira.resources;

import io.github.tiagoferreira.domain.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {

    @GetMapping
    public ResponseEntity<Pessoa> getPessoas() {
        Pessoa pessoa = new Pessoa();
        return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
    }
}
