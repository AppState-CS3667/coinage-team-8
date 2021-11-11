import java.util.Scanner;


class Demo { 
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Making a coin");
        Coin a = new Quarter();
        System.out.println("This the name: " + a.getName());
        System.out.println("This the CountryCode: " + a.getCountryCode());
        System.out.println("This the Denomination: " + a.getDenomination());  
        System.out.println("-------------");

        System.out.println("You make one. (0.25 makes a Quarter btw)");
        System.out.println("Denomination please: ");
        String denomination = kb.nextLine();

        //makeCoin(denomination);
        

        //System.out.println("Smelting...");
        //System.out.println("Inspecting...");
        //System.out.println("Smoothing...");
        //System.out.println("Buffing...");
        

    }    
} 
