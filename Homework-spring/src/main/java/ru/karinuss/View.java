package ru.karinuss;

/**
 * Created by karina on 12.10.14.
 */
public class View {

    Integer number;
    BL businessLogic;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BL getBusinessLogic() {
        return businessLogic;
    }

    public void setBusinessLogic(BL businessLogic) {
        this.businessLogic = businessLogic;
    }

    @Override
    public String toString() {
        return "View{" +
                "number=" + number +
                ", businessLogic=" + businessLogic +
                '}';
    }
}
