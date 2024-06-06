import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrioritySorter list = new PrioritySorter();
        Scanner s = new Scanner(System.in);
        String rt;
        String name;
        int score;

        while (true) {
            System.out.println("Masukkan pilihan menu\n1. Input data peserta lomba\n2. Cari data\n3. Pemenang lomba\n4. Keluar");
            System.out.println();

            int choice = s.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Masukkan rt, nama, dan nilai");
                    rt = s.next();
                    name = s.next();
                    score = s.nextInt();

                    list.insertData(rt, name, score);
                    break;
                case 2:
                    System.out.println("Masukkan rt, nama, dan nilai yang dicari");
                    rt = s.next();
                    name = s.next();
                    score = s.nextInt();
                    
                    boolean result = list.searchData(rt, name, score);

                    if (result) {
                        System.out.println("Data telah dimasukkan");
                    } else {
                        System.out.println("Data tidak ditemukan, belum dimasukkan");
                    }

                    break;
                case 3:
                    System.out.println("Urutan peserta");
                    list.printParticipants();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
