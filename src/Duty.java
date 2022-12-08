import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends Note{

    private BigDecimal sumDuty;

    public Duty(String text, LocalDate date, TypeOfNote typeOfNote, String title, BigDecimal sumDuty) {
        super(text, date, typeOfNote, title);
        this.sumDuty = sumDuty;
    }

    @Override
    public String toString() {
        return "Duty{" +
        "text='" + getText() + '\'' +
                ", localDate=" + getLocalDate() +
                ", typeOfNote=" + getTypeOfNote() +
                ", title='" + getTitle() + '\'' +
                ", sumDuty=" + sumDuty +
                '}';
    }
}
