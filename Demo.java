import java.util.Scanner;


class Demo {
    static Mint factory;
     
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        if (args.length == 0){
            factory = new USDMint();
            System.out.println("Problem with command line coin factory argument.");
            System.out.println("Possible coin factories include: USD & CAD");
            System.out.println("Using USD: U.S. Coin Factory");
        }
        else if (args[0].equals("CAD")) {
        //  factory = new CADMint();
            System.out.println("Using CAD: Canadian Coin Factory");
        }
        else {
            factory = new USDMint();
            System.out.print("Using USD: U.S. Coin Factory");
        }
         
        while(true) //infinite loop keeps asking for Denomination input
        {




            System.out.print("Denomination please(0 to quit): ");
            String denomination = kb.nextLine();
            Coin c = factory.makeCoin(denomination);

            System.out.print("Smelting " + c.getName() +  "... ");           
            c.smelt();
            System.out.println("Inspecting " + c.getName() + "...");
            c.inspect();
            //System.out.println("Smoothing" + c.getName() + "...");
            //c.smooth();
            System.out.println("Polishing" + c.getName() +  "...");
            c.polish();

            if (denomination.equals("0"))
            {
                break;    
            }           
        }


        

    }    
} 
