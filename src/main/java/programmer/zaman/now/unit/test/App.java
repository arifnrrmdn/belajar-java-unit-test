package programmer.zaman.now.unit.test;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nilai_ujian;
        int nilai_indonesia;
        int nilai_inggris;
        int nilai_matematika;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Rata-rata nilai ujian: ");
        nilai_ujian = scanner.nextInt();

        System.out.print("Rata-rata nilai indonesia: ");
        nilai_indonesia = scanner.nextInt();

        System.out.print("Rata-rata nilai inggris: ");
        nilai_inggris = scanner.nextInt();

        System.out.print("Rata-rata nilai matematika: ");
        nilai_matematika = scanner.nextInt();

        if(nilai_ujian>73){
            System.out.println("lulus dipadepokan gus samsuding");
        }else {
            System.out.println("tidak lulus dipadepokan gus samsudin");
        }

        if(nilai_indonesia > 75 && nilai_inggris > 75){
            System.out.println("lulus jurusan sastra");
        }else {
            System.out.println("tidak lulus jurusan sastra");
        }

        if(nilai_matematika > 80) {
            System.out.println("lulus jurusan tkj");
        }else {
            System.out.println("tidak lulus jurusan tkj");
        }

    }
}
