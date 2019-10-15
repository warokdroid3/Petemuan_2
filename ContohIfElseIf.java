public class ContohIfElseIf {

    public static void main(String[] args) {

        int nilai = 0;
        char grade;

        if (nilai >= 90 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 70 && nilai < 90) {
            grade = 'B';
        } else if (nilai >= 50 && nilai < 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Nilai Anda adalah " + grade);
    }
}
