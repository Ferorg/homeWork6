public class PatientTask {

    private static int number;
    private static int  i;
    //Patients task a
    public static Patients[]  patientsWithThisDiagnosis(Patients[] patientsList,String diagnosis){
        Patients[] newPatientsList=new Patients[patientsList.length];
        number=1;
        i=0;
        for (Patients patients:patientsList) {
            if(patients.getDiagnosis().equals(diagnosis)) {
                newPatientsList[i] = patients;
                i++;
            }
        }
        informationOutput(newPatientsList);
        return newPatientsList;
    }
    //Patients task b
    public static Patients[] medicalCardNumber(Patients[] patientsList,int medCardNumber1,int medCardNumber2) {
        number = 1;
        i = 0;
        Patients[] newPatientsList = new Patients[patientsList.length];
        if (medCardNumber1 < medCardNumber2) {
            {
                for (Patients patients : patientsList)
                    if ((patients.getMedicalCardNumber() >= medCardNumber1) && (patients.getMedicalCardNumber() <= medCardNumber2)) {
                        newPatientsList[i] = patients;
                        i++;
                    }
            }
        } else {
            for (Patients patients : patientsList) {
                if ((patients.getMedicalCardNumber() >= medCardNumber2) && (patients.getMedicalCardNumber() <= medCardNumber1)) {
                    newPatientsList[i] = patients;
                    i++;
                }
            }

        }
        informationOutput(newPatientsList);
        return newPatientsList;
    }

    //Вывод информации

    public static Patients[] informationOutput(Patients[] newPatientsList){
        for (i = 0; i < newPatientsList.length; i++) {
            if (newPatientsList[i] != null) {
                System.out.println(number + ") " + newPatientsList[i].information());
                number++;
            }
        }
        return newPatientsList;
    }
}
