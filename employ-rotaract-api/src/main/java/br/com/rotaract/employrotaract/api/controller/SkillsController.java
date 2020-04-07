package br.com.rotaract.employrotaract.api.controller;

import br.com.rotaract.employrotaract.core.domain.Skills;
import br.com.rotaract.employrotaract.core.service.SkillsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final static Logger LOGGER = LoggerFactory.getLogger(SkillsController.class);

    @Autowired
    private SkillsService skillsService;

    @GetMapping
    public ResponseEntity<List<Skills>> findAll() {
        try {
            return ResponseEntity.ok(skillsService.findAll());
        } catch (Exception e) {
            LOGGER.error("status=error getting a list of skills, msg={}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<Skills> insert(@RequestBody Skills skill) {
        try {
            if(skill.equals(null)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(skillsService.save(skill));
        } catch (Exception e) {
            LOGGER.error("status=error inserting a skill, msg={}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
