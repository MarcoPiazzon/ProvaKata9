package ProvaKata9;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int current_xp = 0;
        System.out.println("Scrivi la tua esperienza: ");
        current_xp= scan.nextInt();

        System.out.println("Scrivi il livello che vuoi raggiungere: ");
        int target_lvl = scan.nextInt();
        CheckInput(current_xp,target_lvl);
        xp_to_target_lvl(current_xp, target_lvl);
    }

    public static void CheckInput(int current_xp, int target_lvl){
        if(current_xp < 0){
            System.out.println("Invalid input");
            System.exit(0);
        }

        if(target_lvl < 0){
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    public static int xp_to_target_lvl(int current_xp, int target_lvl) {
        if(current_xp == 0 && target_lvl == 1){
            System.out.println("You have already reached level "+target_lvl);
            System.exit(0);
        }
        int livello = 314;
        int ricorda = 314;
        double percentuale = 0.25;
        for (int i = 2; i < target_lvl; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                percentuale -= 0.01;
                livello += (livello * percentuale);
                ricorda += livello;
            } else {
                livello += (livello * percentuale);
                ricorda += livello;
            }
        }
        if(ricorda > current_xp){

            //Controllo se il livello è stato stato raggiunto oppure no
            System.out.println("Xp rimanenti: "+ (ricorda -current_xp));
            return ricorda -current_xp;
        }else{
            System.out.println("You have already reached level "+target_lvl);
            return target_lvl;
        }

    }

}
