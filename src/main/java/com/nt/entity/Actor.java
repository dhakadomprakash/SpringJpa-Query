package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "DATA_JPA_ACTOR")
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "actor_id")
    private Integer id;
    @Column(name = "actor_name")
    private String aName;
    private String category;
    private Long mobileNumber;
}
