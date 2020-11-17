package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Repository.ShishaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shishas")
public class ShishaController {

    @Autowired
    private ShishaRepository shishaRepository;
}
