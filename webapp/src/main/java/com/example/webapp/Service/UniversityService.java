package com.example.webapp.Service;

import com.example.webapp.Model.University;
import com.example.webapp.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//komunikace s databází pomocí repozitáře
@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }
    //vraci všechny záznamy
    public List<University> getUniversity() {
        return universityRepository.findAll();
    }
    //select záznamu podle id
    public University getUniversityById(int id) {
        return universityRepository.getById(id);
    }
    //přidání záznamu do databáze
    public University addUniversity(University u){
        return universityRepository.save(u);
    }
}
