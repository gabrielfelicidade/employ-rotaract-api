package br.com.rotaract.employrotaract.core.repository;

import br.com.rotaract.employrotaract.core.domain.Jobs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobsRepository extends MongoRepository<Jobs, String> {
}
