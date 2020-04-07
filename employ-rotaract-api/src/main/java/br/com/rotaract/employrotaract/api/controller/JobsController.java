package br.com.rotaract.employrotaract.api.controller;

import br.com.rotaract.employrotaract.core.domain.Jobs;
import br.com.rotaract.employrotaract.core.service.JobsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final static Logger LOGGER = LoggerFactory.getLogger(JobsController.class);

    @Autowired
    private JobsService jobsService;

    @GetMapping
    public ResponseEntity<List<Jobs>> findAll() {
        try {
            return ResponseEntity.ok(jobsService.findAll());
        } catch (Exception e) {
            LOGGER.error("status=error getting a list of jobs, msg={}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<Jobs> insert(@RequestBody Jobs job){
        try {
            if(job.equals(null)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(jobsService.save(job));
        } catch (Exception e) {
            LOGGER.error("status=error inserting a job, msg={}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping
    public ResponseEntity<Jobs> update(@RequestBody Jobs job){
        try {
            if(job.equals(null)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            return ResponseEntity.ok(jobsService.save(job));
        } catch (Exception e) {
            LOGGER.error("status=error updating a job, msg={}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
