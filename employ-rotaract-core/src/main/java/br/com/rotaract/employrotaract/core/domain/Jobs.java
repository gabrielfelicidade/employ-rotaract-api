package br.com.rotaract.employrotaract.core.domain;

import br.com.rotaract.employrotaract.core.vo.SkillsVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@Builder
@Document
@Getter
@NoArgsConstructor
@Setter
public class Jobs {

    @Id
    private ObjectId _id;

    private String description;

    private List<SkillsVO> skills;

    private String externalLink;

}
