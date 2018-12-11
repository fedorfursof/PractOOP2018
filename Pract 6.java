public class Student {

    public int idNumber[];

    public Student() {
        idNumber = new int[10];
        idNumber[0] = 22;
        idNumber[1] = 49;
        idNumber[2] = 19;
        idNumber[3] = 53;
        idNumber[4] = 80;
        idNumber[5] = 12;
        idNumber[6] = 69;
        idNumber[7] = 83;
        idNumber[8] = 14;
        idNumber[9] = 89;
    }

    public void selectionSort() {
        for (int i = 0; i < idNumber.length; i++) {
            int min = idNumber[i];
            int min_i = i;
            for (int j = i + 1; j < idNumber.length - 1; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = tmp;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Отсортированный список баллов по возрастанию:");
        Student idNumber = new Student();
        idNumber.selectionSort();
        idNumber.PrintScr();
    }
}
