package br.com.rotaract.employrotaract.api.controller;

import br.com.rotaract.employrotaract.core.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping
    public String getMessage(){
        return skillsService.getMessage();
    }

    @GetMapping("/teste")
    public String getMessage2(){
        return skillsService.getMessage();
    }

}
