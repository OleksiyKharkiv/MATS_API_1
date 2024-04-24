package com.games.dndBE.model;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "characters")
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel(description = "Details about a game character")
public class GameCharacter {
    @Id
//    @ApiModelProperty(notes = "The unique identifier of the game character")
    private String id;

//    @ApiModelProperty(notes = "The name of the game character")
    private String name;

//    @ApiModelProperty(notes = "The force attribute of the game character")
    private int force;

//    @ApiModelProperty(notes = "The magic attribute of the game character")
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