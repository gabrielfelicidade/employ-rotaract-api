package br.com.rotaract.employrotaract.core.domain;

import br.com.rotaract.employrotaract.core.vo.SkillsVO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Builder
@Document
@Getter
@NoArgsConstructor
@Setter
public class Candidate {

    @Id
    @JsonIgnore
    private ObjectId _id;

    private String fullName;

    private String email;

    @JsonIgnore
    private String password;

    private String rotaractClub;

    private String city;

    private LocalDate createDate;

    private LocalDate updateDate;

    private List<AcademicFormations> academicFormations;

    private List<ProfessionalExperiences> professionalExperiences;

    private List<SkillsVO> skills;

}
