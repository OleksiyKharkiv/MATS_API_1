package com.games.dndBE.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "characters")
@NoArgsConstructor
@AllArgsConstructor
public class GameCharacter {
    @Id
    private String id;

    private String name;

    private int force;

    private int magic;

    // Override toString method
    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", force=" + force +
                ", magic=" + magic +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameCharacter gameCharacter = (GameCharacter) o;

        if (!id.equals(gameCharacter.id)) return false;
        if (!name.equals(gameCharacter.name)) return false;
        if (force != gameCharacter.force) return false;
        return magic == gameCharacter.magic;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + force;
        result = 31 * result + magic;
        return result;
    }
}