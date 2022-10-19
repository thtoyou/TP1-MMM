package mmm.tp1;

public class Client {
    String name;
    String surname;
    String bDay;
    String birthPlace;
    String birthDept;
    String PhoneNumber;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getBDay() {
        return bDay;
    }

    public void setBDay(String bDay) {
        this.bDay = bDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDept() {
        return birthDept;
    }

    public void setBirthDept(String birthDept) {
        this.birthDept = birthDept;
    }

}
