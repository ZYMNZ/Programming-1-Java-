
package training;


class Training {
    String name;
    int age;
    
    public String getName(){
      return name;
    }


    public static void main(String[] args) {
        
        String name = "Yaman is here";
        
        System.out.println(name.toLowerCase()); 
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.print(name.indexOf("an") + "\n" + "\t");
        System.out.println("\"Hello\"");
        
        System.out.println(" \"my name\" " );
        System.out.println("!= not equal\n" +
                               "|| or\n" +
                               "&& and\n" +
                               "== equal\n" +
                               "<= less than or equal");
        
        String pencil = "I pencil";
        int i = pencil.indexOf(" ");
        String meow = pencil.substring(0,i);
        String lmao = pencil.substring(i+1);
        System.out.println(meow + " imagine " + lmao);
                
        //static final int MAX_PLAYERS = 4;
        //objects = 1. properties and 2. methods
      
        
        
    }
}

