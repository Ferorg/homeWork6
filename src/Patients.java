public class Patients {

    private int id;
    private String surName;
    private String name;
    private String secondeName;
    private String address;
    private int phoneNumber;
    private int medicalCardNumber;
    private String diagnosis;

    public Patients(int id, String surName, String name, String secondeName, String address, int phoneNumber, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.secondeName = secondeName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondeName() {
        return secondeName;
    }

    public void setSecondeName(String secondeName) {
        this.secondeName = secondeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String information() {
        return "id: " + id + ", Фамилия: " + surName + ", Имя: " + name + ", Отчество: " + secondeName + ", адресс: " + address +
                ", ном.телефона: " + phoneNumber + ", номер мед. карты: " + medicalCardNumber + ", Диагноз: " + diagnosis;
    }
}