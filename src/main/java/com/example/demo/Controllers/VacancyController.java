package com.example.demo.Controllers;

import com.example.demo.Models.Vacancy;
import com.example.demo.Services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class VacancyController {
    @Autowired
    VacancyService vacancyService;

    @GetMapping("/vacancy")
    public List<Vacancy> getAllVacancies () {
        return vacancyService.getAllVacancies();
    }

    @PostMapping("addVacancy")
    public String addVacancy(@RequestBody Vacancy vacancy){
        vacancyService.addVacancy(vacancy);
        return "Vacancy successfully added";
    }

    @DeleteMapping("deleteVacancy/{id}")
    public String deleteVacancy(@PathVariable Long id){
        vacancyService.deleteVacancyById(id);
        return "Vacancy successfully deleted";
    }
}

