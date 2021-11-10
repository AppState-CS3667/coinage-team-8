import java.util.Scanner;


class Demo {
    static Mint factory;
     
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        if (args.length == 0){
            factory = new USDMint();
        }
        //else if (args[0].equals("CAD")) {
        //    factory = new CADMint();
        // }
        else {
            factory = new USDMint();
        }
         
        while(true)
        {
            System.out.println("Denomination please(0 to quit): ");
            String denomination = kb.nextLine();
            Coin c = factory.makeCoin(denomination);
            if (denomination.equals("0"))
            {
                break;    
            }
        }


        //System.out.println("Smelting...");
        //System.out.println("Inspecting...");
        //System.out.println("Smoothing...");
        //System.out.println("Buffing...");
        

    }    
} 
