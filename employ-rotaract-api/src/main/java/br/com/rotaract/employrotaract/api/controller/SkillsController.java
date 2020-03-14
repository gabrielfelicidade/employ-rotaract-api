package br.com.rotaract.employrotaract.api.controller;

import br.com.rotaract.employrotaract.core.domain.Skills;
import br.com.rotaract.employrotaract.core.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping
    public List<Skills> findAll(){
        return skillsService.findAll();
    }

    @PostMapping
    public Skills save(@RequestBody Skills skill){
        return skillsService.save(skill);
    }

}
