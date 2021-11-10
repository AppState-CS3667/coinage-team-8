import java.util.Scanner;


class Demo { 
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        if (args.length == 0){
            factory = new USDMint();
        }
        else if (args[0].equals("CAD")) {
            factory = new CADMint();
        }
        else {
            factory = new USDMint();
        }



        String denomination = kb.nextLine();
        

        //System.out.println("Smelting...");
        //System.out.println("Inspecting...");
        //System.out.println("Smoothing...");
        //System.out.println("Buffing...");
        

    }    
} 
