package taco_cloud.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=5, message="Name must be at least 5 character long")
    private String name;

    @NotNull
    @Size(min=1, message="Taco must have at least one ingredient")
    private List<Ingredient> ingredients;
}
