package taco_cloud.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    @NotBlank(message = "Taco must have name")
    private String deliveryName;

    @NotBlank(message = "Taco must have delivery street")
    private String deliveryStreet;

    @NotBlank(message = "Taco must have delivery city")
    private String deliveryCity;

    @NotBlank(message = "Taco must have delivery state")
    private String deliveryState;

    @NotBlank(message = "Taco must have delivery zip")
    private String deliveryZip;

    @CreditCardNumber
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message="Must be formatted MM|YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "CCV must have 3 digits")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();


    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}
