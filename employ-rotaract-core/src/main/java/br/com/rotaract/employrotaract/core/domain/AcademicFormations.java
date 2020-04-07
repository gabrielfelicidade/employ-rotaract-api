package br.com.rotaract.employrotaract.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Document
@Getter
@NoArgsConstructor
@Setter
public class AcademicFormations {

    private String institution;

    private String course;

    private LocalDate startDate;

    private LocalDate endDate;

}
