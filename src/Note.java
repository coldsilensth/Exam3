import java.time.LocalDate;

public class Note extends AbstarctNote implements WritingToFile{
    private String title;

    public Note(String text, LocalDate date, TypeOfNote typeOfNote, String title) {
        super(text, date, typeOfNote);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + getText() + '\'' +
                ", localDate=" + getLocalDate() +
                ", typeOfNote=" + getTypeOfNote() +
                '}'+"title='" + title + '\'' +
                '}'+"\n";
    }

    @Override
    public void makeRecord() {

    }
}
