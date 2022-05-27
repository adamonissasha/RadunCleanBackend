package com.example.demo.Services;

import com.example.demo.Models.Vacancy;
import com.example.demo.Repositories.VacancyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class VacancyService {

    @Autowired
    VacancyRepository vacancyRepository;

    public List<Vacancy> getAllVacancies() {
        return vacancyRepository.findAll();
    }

    public void addVacancy(Vacancy vacancy) {
        vacancyRepository.save(vacancy);
    }

    public void deleteVacancyById(Long id) {
        vacancyRepository.deleteById(id);
    }
}