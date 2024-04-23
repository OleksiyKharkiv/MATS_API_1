package com.games.dndBE.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "characters")
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    private String id;
    private String name;
    private int force;
    private int magic;
}