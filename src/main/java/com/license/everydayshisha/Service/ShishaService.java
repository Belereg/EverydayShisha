package com.license.everydayshisha.Service;

import com.license.everydayshisha.Repository.ShishaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShishaService {

    @Autowired
    private ShishaRepository shishaRepository;
}
