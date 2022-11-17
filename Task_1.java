import java.util.Random;
import java.util.Scanner;
public class Main{
    public static int generateRandomIntIntRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
public static void main(String[] args){
    System.out.println("Чтобы начать игру, нажмите 1");
    for (int i = 1; i>0;i++){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==1){
            int b = generateRandomIntIntRange(0, 9);
            for (int j =0; j<3; j++){
		    int c = scanner.nextInt();
		    if (c>b){
		        System.out.println("Загаданное число меньше");
		    }
		    if (c<b){
		        System.out.println("Загаданное число больше");
		    }
		    if (c==b){
		        System.out.println("Вы победили");
		        break;
		    }
		}System.out.println ("Игра окончена. Загаданное число " + b);
        }
        if (a==0){
            break;
        }
		System.out.println ("Повторить игру еще раз? 1 – да / 0 – нет");}
    }
}
