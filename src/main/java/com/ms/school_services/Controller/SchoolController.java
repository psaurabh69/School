package com.ms.school_services.Controller;

import com.ms.school_services.Entity.School;
import com.ms.school_services.Repository.SchoolRepository;
import com.ms.school_services.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/addSchool")
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }

    @GetMapping("/fetchSchool")
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
}
