package br.com.rotaract.employrotaract.core.repository;

import br.com.rotaract.employrotaract.core.domain.Skills;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillsRepository extends MongoRepository<Skills, String> {
}
