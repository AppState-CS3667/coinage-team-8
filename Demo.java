import java.util.Scanner;


class Demo {
    static Mint factory = null;
     
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        if (args.length == 0){
            factory = USDMint.getInstance(); 
            System.out.println("Problem with command line coin factory argument.");
            System.out.println("Possible coin factories include: USD & CAD");
            System.out.println("Using USD: U.S. Coin Factory");
        }
        else if (args[0].equals("CAD")) {
            //factory = new CADMint.getInstance();
            System.out.println("Using CAD: Canadian Coin Factory");
        }
        else {
            factory = USDMint.getInstance(); 
            System.out.print("Using USD: U.S. Coin Factory");
        }
         
        while(true) //infinite loop keeps asking for Denomination input
        {




            System.out.print("Name of coin please(0 to quit): ");
            String denomination = kb.nextLine();
            Coin c = factory.makeCoin(denomination);

            System.out.print("\nSmelting " + c.getName() +  "... ");           
            c.smelt();
            System.out.print("\nInspecting " + c.getName() + "...");
            c.inspect();
            System.out.print("\nSmoothing" + c.getName() + "... ");
            c.smooth();
            System.out.print("\nPolishing" + c.getName() +  "... ");
            c.polish();
            System.out.print("\n(" + c.getName() + ")" + c.getDenomination());

            if (denomination.equals("0"))
            {
                break;    
            }           
        }


        

    }    
} 
