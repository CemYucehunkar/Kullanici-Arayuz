import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName=input.nextLine();


        System.out.print("Şifreniz:");
        password=input.nextLine();


        if (userName.equals("Patika") && password.equals("java123")){
            System.out.print("Başarıyla Giriş Yaptınız !");
        }else {
            System.out.print("Giriş başarısız, tekrar deneyiniz!");
        }



    }


    }
