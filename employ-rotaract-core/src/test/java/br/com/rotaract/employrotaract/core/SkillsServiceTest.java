package br.com.rotaract.employrotaract.core;

import br.com.rotaract.employrotaract.core.service.SkillsService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkillsServiceTest {

	@Autowired
	private SkillsService skillsService;

	@Test
	void contextLoads() {
		Assertions.assertThat(skillsService.getMessage()).isNotNull();
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
