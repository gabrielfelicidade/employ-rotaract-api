package br.com.rotaract.employrotaract.core.domain;

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

@AllArgsConstructor
@Builder
@Document
@Getter
@NoArgsConstructor
@Setter
public class Contractor {

    @Id
    @JsonIgnore
    private ObjectId _id;

    private String fullName;

    private String email;

    @JsonIgnore
    private String password;

    private LocalDate createDate;

    private LocalDate endDate;

}
