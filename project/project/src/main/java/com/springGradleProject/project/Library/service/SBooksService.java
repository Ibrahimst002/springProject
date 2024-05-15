package com.springGradleProject.project.Library.service;

import com.springGradleProject.project.Library.model.SBook;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SBooksService {
    public List<SBook> sBooks(){
        return List.of (new SBook()
        );
    }
}
