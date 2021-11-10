class Demo { 
    public static void main(String[] args)
    {
        System.out.println("Making a coin");
        Coin a = new Quarter();
        System.out.println("This the name: " + a.getName());
        System.out.println("This the CountryCode: " + a.getCountryCode());
        System.out.println("This the Denomination: " + a.getDenomination());  
    }    
} 
