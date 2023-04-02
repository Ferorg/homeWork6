import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean inProgram = true;
        Patients[] patients = TextAndPeopleList.patientsInitialization();
        String text = TextAndPeopleList.textForTasks2();
        String text2 = TextAndPeopleList.textForTask3();
        Scanner in = new Scanner(System.in);
        while (inProgram) {
            inProgram = false;
            System.out.println("Patients:\n1)пункт а. \n2)пункт b.");
            System.out.println("Работа с текстом:\n3)пункт 2.1. \n4)пункт 2.2.  \n5)пункт 3.1");
            System.out.println("Для выхода нажмите 6");
            System.out.print("Выберите задание для проверки, введите номер задания:");
            int userChoise = in.nextInt();
            switch (userChoise) {
                case (1):
                    System.out.println("Задание 1: список пациентов имеющих данный диагноз:");
                    PatientTask.patientsWithThisDiagnosis(patients, "Изжога");
                    inProgram = true;
                    break;
                case (2):
                    System.out.println("Задание 1.1: список пациентов, номер медицинской карты которых находится в " +
                            "заданном интервале.");
                    PatientTask.medicalCardNumber(patients, 250, 450);
                    inProgram = true;
                    break;
                case (3):
                    System.out.println("Задание 2: В тексте после символа с индексом k вставить заданную подстрок");
                    TextTask.insertASubstringAfterTheIndexK(text, 3, "BARAK");
                    inProgram = true;
                    break;
                case (4):
                    System.out.println("Задание 3: После каждого слова текста, заканчивающегося заданной подстрокой," +
                            " вставить указанное слово.");
                    TextTask.insertTheSpecifiedWord(text, "са", "Hello");
                    inProgram = true;
                    break;
                case (5):
                    System.out.println("Задание 4:Из текста удалить все символы, кроме пробелов, не являющиеся буквами." +
                            "И оставить между последовательностями символов пробел");
                    TextTask.removeAllNonLetterCharacters(text2);
                    inProgram = true;
                    break;
                case (6):
                    inProgram = false;
                    break;
                default:
                    System.out.println("Выберите нужный номер задания");
                    inProgram = true;
                    break;
            }

        }

    }
}