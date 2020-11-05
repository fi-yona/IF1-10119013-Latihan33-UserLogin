/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan33.userlogin;

/**
 *
 * @author Fiona Avila
 */
import static if1.pkg10119013.latihan33.userlogin.User.parPassword;
import static if1.pkg10119013.latihan33.userlogin.User.parUserName;
import static if1.pkg10119013.latihan33.userlogin.User.scan;
import java.util.Scanner;

public class Latihan33Login {
    
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args){
        User data = new User();
        System.out.print("Masukkan Username\t= ");
        User.parUserName = scan.next();
        System.out.print("Masukkan Password\t= ");
        User.parPassword = scan.next();
        System.out.println();
        data.pengecekanLogin(parUserName, parPassword);
    }
}
