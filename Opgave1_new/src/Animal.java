public class Animal {
    public void dog(String input) {
        System.out.print("L");
        if (input.equals("Nice")) {
            System.out.println(" Stands for Love");
        } else {
            System.out.println(" Stands for Loser");
        }
        cat("small");
    }

    public void cat(String small) {
        System.out.print("o");
        if (small.equals("small")) {
            System.out.print(" Stands for Overcome");
        }
        System.out.println(" Moving on");

        fish("good");
    }


    public void fish(String good) {
        System.out.print("v");
        if (good.equals("good")) {
            System.out.println(" Stands for Vouge");
            lion("fat");
        }
    }

    public void lion (String av){
        System.out.print("e");
        if (av.equals("fat")){
            System.out.println(" Naild it");
        }
    }
}
