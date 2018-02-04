package pl.lukaszwilk.FirstApplication.models.forms;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CarForm {
    @Min(1900)
    @Max(2018)
    private int produktionYear;
    @NotBlank
    @Size(min = 3,max = 50)
    private String modelCar;
    @NotBlank
    @Size(min = 3,max = 30)
    private String companyCar;

    public CarForm(int produktionYear, String modelCar, String companyCar) {
        this.produktionYear = produktionYear;
        this.modelCar = modelCar;
        this.companyCar = companyCar;
    }

    public CarForm() {

    }

    public int getProduktionYear() {
        return produktionYear;
    }

    public void setProduktionYear(int produktionYear) {
        this.produktionYear = produktionYear;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(String companyCar) {
        this.companyCar = companyCar;
    }
}
