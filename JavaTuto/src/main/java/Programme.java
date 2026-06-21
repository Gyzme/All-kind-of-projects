import java.util.Scanner;

public class Programme {
    public static void main (String[]args){
        Calculatrice calc = new Calculatrice();
        System.out.println("Quelle opération souhaitez vous faire ?\n1.additionner\n2.soustraire\n3.multiplier ?\n4.diviser ?");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        switch(choix){
            case 1 -> {
                System.out.println("Veuillez choisir le premier nombre :");
                int a = sc.nextInt();
                System.out.println("Veuillez choisir le deuxième nombre :");
                int b = sc.nextInt();
                System.out.println("Le résultat est : " + calc.additionner(a,b));
            }
            case 2 -> {
                System.out.println("Veuillez choisir le premier nombre :");
                int a = sc.nextInt();
                System.out.println("Veuillez choisir le deuxième nombre :");
                int b = sc.nextInt();
                System.out.println("Le résultat est : " +calc.soustraire(a,b));
            }
            case 3 -> {
                System.out.println("Veuillez choisir le premier nombre :");
                int a = sc.nextInt();
                System.out.println("Veuillez choisir le deuxième nombre :");
                int b = sc.nextInt();
                System.out.println("Le résultat est : " +calc.multiplier(a,b));
            }
            case 4 -> {
                System.out.println("Veuillez choisir le premier nombre :");
                double a = sc.nextDouble();
                System.out.println("Veuillez choisir le deuxième nombre :");
                double b = sc.nextDouble();
                System.out.println("Le résultat est : " +calc.diviser(a,b));
            }

        }
    }
}
