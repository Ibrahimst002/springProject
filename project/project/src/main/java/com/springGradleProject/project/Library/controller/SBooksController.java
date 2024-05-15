package com.springGradleProject.project.Library.controller;

import com.springGradleProject.project.Library.model.SBook;
import com.springGradleProject.project.Library.service.SBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sbooks")
public class SBooksController {

    private SBooksService sBooksService;

    @Autowired
    public SBooksController(SBooksService sBooksService) {
        this.sBooksService = sBooksService;
    }

    @GetMapping
    public List<SBook> sBooks(){
        return sBooksService.sBooks();
    }
}

