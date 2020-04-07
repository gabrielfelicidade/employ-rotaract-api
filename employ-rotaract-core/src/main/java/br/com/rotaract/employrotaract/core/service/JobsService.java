package br.com.rotaract.employrotaract.core.service;

import br.com.rotaract.employrotaract.core.domain.Jobs;
import br.com.rotaract.employrotaract.core.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsService {

    @Autowired
    private JobsRepository jobsRepository;

    public List<Jobs> findAll() {
        return jobsRepository.findAll();
    }

    public Jobs save(Jobs job) {
        return jobsRepository.save(job);
    }

    public void delete(Jobs job){
        jobsRepository.delete(job);
    }

}
