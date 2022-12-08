import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022, 12, 11);
        LocalDate localDate1 = LocalDate.of(2022, 10, 24);
        LocalDate localDate2 = LocalDate.of(2022, 07, 1);

        BigDecimal bigDecimal = new BigDecimal("2000.0");


        Note note = new Note("Заметка ", localDate, TypeOfNote.IDEA, "Заметка");
        Note note1 = new Duty("Заметка", LocalDate.now(),
                TypeOfNote.DUTY, "Долг Саши", bigDecimal);
        Note note2 = new Note("Заметка ", localDate2, TypeOfNote.IDEA, "Винкс");


        Contacts contacts1 = new Contacts("Вернуть долг Алине", LocalDate.now(), TypeOfNote.DUTY,
                "0500654016", "Hashem", TypeOfNumber.MOBILE);
        Contacts contacts2 = new Contacts("Купить молоко", LocalDate.now(), TypeOfNote.IDEA,
                "0500991121", "Andrey", TypeOfNumber.MOBILE);
        Contacts contacts3 = new Contacts("Покормить кота", LocalDate.now(), TypeOfNote.DUTY,
                "0500121212", "Masha", TypeOfNumber.MOBILE);

        AbstarctNote[] abstarctNotes = {note, note1, note2, contacts1, contacts2, contacts3};

        for (int i = 0; i < abstarctNotes.length; i++) {
            System.out.println(abstarctNotes[i]);
        }


        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt");
            for (int i = 0; i < abstarctNotes.length; i++) {
            }
            fileWriter.write(Arrays.toString(abstarctNotes));
            fileWriter.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}