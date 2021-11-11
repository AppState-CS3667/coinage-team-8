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
        //   factory = new CADMint();
        //}
        else {
            factory = new USDMint();
        }
         
        while(true) //infinite loop keeps asking for Denomination input
        {
            System.out.println("Denomination please(0 to quit): ");
            String denomination = kb.nextLine();
            Coin c = factory.makeCoin(denomination);
            //System.out.println("Smelting " + c.getName() +  "... " + c.smelt());
            //System.out.println("Inspecting " + c.getName() + "..." + c.inspect());
            //System.out.println("Smoothing" + c.getName() + "..." + c.smooth());
            //System.out.println("Polishing" + c.getName() +  "..." + c.polish());
            
            c.smelt();
            c.inspect();
            //c.smooth();
            c.polish();
            


            if (denomination.equals("0"))
            {
                break;    
            }
        }


        

    }    
} 
