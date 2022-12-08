import java.time.LocalDate;

public abstract class AbstarctNote {
    private String text;
    private LocalDate localDate;
    private TypeOfNote typeOfNote;


    public AbstarctNote(String text, LocalDate localDate, TypeOfNote typeOfNote) {
        this.text = text;
        this.localDate = localDate;
        this.typeOfNote = typeOfNote;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public TypeOfNote getTypeOfNote() {
        return typeOfNote;
    }

    public void setTypeOfNote(TypeOfNote typeOfNote) {
        this.typeOfNote = typeOfNote;
    }


    @Override
    public String toString() {
        return "AbstarctNote{" +
                "text='" + text + '\'' +
                ", localDate=" + localDate +
                ", typeOfNote=" + typeOfNote +
                '}';
    }
}
