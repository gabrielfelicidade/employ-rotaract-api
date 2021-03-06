package br.com.rotaract.employrotaract.core.service;

import br.com.rotaract.employrotaract.core.domain.Skills;
import br.com.rotaract.employrotaract.core.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsRepository skillsRepository;

    public List<Skills> findAll() {
        return skillsRepository.findAll();
    }

    public Skills save(Skills skill) {
        return skillsRepository.save(skill);
    }

}
