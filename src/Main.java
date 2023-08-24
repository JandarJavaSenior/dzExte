import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       try {
           Scanner scanner =new Scanner( System.in);

           System.out.println("Привет✋ Голубчик!😍");
           System.out.println("Возможные ошибки если🛑:");
           System.out.println("1. Число отрицательное❌!");
           System.out.println("2. Введены не цивфры!⭕");
           System.out.println("3. Число больше 999📛!:");
        System.out.println("Введите высоту паралелипида💛:");
        int v = scanner.nextInt();
        System.out.println("Введите длинну паралелипида💜:");
        int d = scanner.nextInt();
        System.out.println("Введите ширину паралелипида🤍:");
        int sh = scanner.nextInt();

        Parel parel = new Parel();
        Cylin cylin = new Cylin();

        System.out.println("Введите высоту цилиндра💚:");
        int vv = scanner.nextInt();
        System.out.println("Введите радиус цилиндра🧡:");
        int r= scanner.nextInt();

           if(v<0||d<0||sh<0||vv<0||r<0){
               throw new ArithmeticException();
           } else if (String.valueOf(v).matches("\\D")
                    ||String.valueOf(d).matches("\\D")
                   ||String.valueOf(sh).matches("\\D")
                   ||String.valueOf(vv).matches("\\D")
                   ||String.valueOf(r).matches("\\D")){
               throw new NumberFormatException() ;
           } else if (v>999||d>999||sh>999||vv>999||r>999) {
               throw new RuntimeException();
           }
           System.out.println("Все верно!✅✅✅");
           parel.parel(v,d,sh);
           cylin.celind(vv,r);


       } catch (ArithmeticException e){
           System.out.println("берилген маалымат терс сан❗");
       }catch (InputMismatchException ex){
           System.out.println("берилген маалымат сан эмес тамга❗");
       }catch (RuntimeException exx){
           System.out.println("999 коп болбош керек❗");
       }


    }
}