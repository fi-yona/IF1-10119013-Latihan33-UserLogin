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

import java.util.Scanner;

public class User {
    
    static Scanner scan = new Scanner(System.in);
    
    static String parUserName, parPassword;
    
    private final String username = "FionaAvila";
    private final String password = "satusatunya";
    private boolean statusAkun = true;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if((parUserName.equals(username)) && (parPassword.equals(password))){
            return true;
        }else{
            return false;
        }
    }
    
    private void hasilLogin(boolean statusAkun, String parUserName){
        if(statusAkun==true){
            System.out.println("*****HALO " + parUserName.toUpperCase() + "*****");
            System.out.println();
            System.out.println("Selamat Datang di Aplikasi Ini!");
        }else{
            System.out.println("Oopps.. username atau password yang anda masukkan salah!");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        User pengguna = new User();
        statusAkun = cekAkun(parUserName,parPassword);
        pengguna.hasilLogin(statusAkun,parUserName);
    }
}
