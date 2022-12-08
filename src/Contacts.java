import java.time.LocalDate;

public class Contacts extends AbstarctNote implements WritingToFile{
    private String numberPhone;
    private String nameContact;
    private TypeOfNumber typeOfNumber;

    public Contacts(String text, LocalDate localDate, TypeOfNote typeOfNote, String numberPhone, String nameContact, TypeOfNumber typeOfNumber) {
        super(text, localDate, typeOfNote);
        this.numberPhone = numberPhone;
        this.nameContact = nameContact;
        this.typeOfNumber = typeOfNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public TypeOfNumber getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(TypeOfNumber typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }


    @Override
    public String toString() {
        return "Contacts{" +
                "text='" + getText() + '\'' +
                ", localDate=" + getLocalDate() +
                ", typeOfNote=" + getTypeOfNote() +
                ", numberPhone='" + numberPhone + '\'' +
                ", nameContact='" + nameContact + '\'' +
                ", typeOfNumber=" + typeOfNumber +
                '}' + "\n";
    }

    @Override
    public void makeRecord() {

    }
}
