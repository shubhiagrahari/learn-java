import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class book{


    public static void main(String[] args) {

         class books {

        
          String category;
          int publishyear;
          double price;
          String title;
          books( String category,int publishyear,double price,String title){
            this.category=category;
            this.title=title;
            this.publishyear=publishyear;
            this.price=price;
          }
          public void pin(){
            System.out.println(" ( category: "+category+ " publish year: "+publishyear+ " price: " +price+ " title : "+title+ " )");
          }
          @Override
          public String toString(){
            return "( category: "+category+",publish year: "+publishyear+ " price: " +price+ " title : "+title +" )";
          }
         }

           List<books> books = Arrays.asList   (
            new books("Fiction", 2001, 399.0, "The Silent River"),
            new books("Science", 2010, 499.0, "Quantum World"),
            new books("History", 1998, 299.0, "Ancient Civilizations"),
            new books("Romance", 2015, 350.0, "Love in Winter"),
            new books("Fantasy", 2020, 599.0, "Dragon’s Realm"),
            new books("Biography", 2005, 450.0, "Life of a Legend"),
            new books("Mystery", 2018, 420.0, "The Hidden Truth"),
            new books("Self-Help", 2012, 300.0, "Mindset Matters"),
            new books("Adventure", 2003, 380.0, "Journey Beyond"),
            new books("Philosophy", 1995, 250.0, "Wisdom of Ages"),
            new books("Philosophy", 1995, 250.0, "Wisdom of Ages"),
            new books("Philosophy", 1995, 250.0, "Wisdom of Ages"),
            new books("Children", 2021, 200.0, "Magic Tales"),
            new books("Thriller", 2017, 520.0, "Dark Secrets"),
            new books("Poetry", 2000, 275.0, "Whispers of Soul"),
            new books("Education", 2011, 600.0, "Learning Java"),
            new books("Adventure", 2003, 380.0, "Journey Beyond"),
            new books("Drama", 2014, 340.0, "Broken Strings"),
            new books("Travel", 2009, 310.0, "Across the Globe"),
            new books("Health", 2016, 450.0, "Fitness First"),
            new books("Cooking", 2008, 280.0, "Spice & Flavor"),
            new books("Technology", 2019, 700.0, "AI Revolution"),
            new books("Classic", 1985, 150.0, "Timeless Tales")
        );
        List <books> b=books.stream()
           .filter(item -> item.title.startsWith("T"))
       
          
          .toList();System.out.println(b);

            System.out.println("another list");
           List <String> b1=books.stream()
           .map((item)->item.category.toUpperCase())
           .toList();
           System.out.println(b1);
  System.out.println("another list");
            List <books> b2=books.stream()
           .skip(4)
         
           .toList();
           System.out.println(b2);
  System.out.println(" another list");

              List <books> b3=books.stream()
          .limit(13)
         
           .toList();
           System.out.println(b3);
System.out.println("another list");

     List <books> b4=books.stream()
        .distinct()
         
           .toList();
           System.out.println(b4);

System.out.println("another list");
             List <books> b5=books.stream()
        .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
         
           .toList();
           System.out.println(b5);

           System.out.println("another list");

 List <books> b6=books.stream()
        .filter((item)->item.price>500)
         
           .toList();
           System.out.println(b6);

           
           System.out.println("another list");

 List <String> b7=books.stream()
        .map((item)->item.category +"(Autobiograph)")
         
           .toList();
           System.out.println(b7);

                 System.out.println("another list");

 double b8=books.stream()
          .map(book -> book.price) 
        .reduce(0.0, (acc,cum)->acc+cum);
         
           
           System.out.println("sum of prices: "+b8);

          List <String> b9=books.stream()
          .map(book -> book.title) 
        .collect(Collectors.toList());
         
           
           System.out.println(" List of Titles: "+b9);

          Optional<String>optional1=Optional.ofNullable("null");
          System.out.println(optional1);
          optional1.ifPresent((v)->System.out.println(v));
           boolean m=optional1.isPresent();
           System.out.println(m);
        

          System.out.println(optional1.orElse("default"));
          Optional<List <String>>optional2=Optional.of(Arrays.asList("Shubhi","vaibhav","janhavi","muskan","Sunil"));
          System.out.println(optional2);
          optional2.stream()

         
            .flatMap(list -> list.stream())  
            .map(String::toUpperCase)
            .forEach(System.out::println);
        
         

          System.out.println(optional2);

          optional2.ifPresent(list ->  list.stream()
        .filter(name -> name.startsWith("S"))
         .forEach (System.out::println));
       
        System.out.println(optional2.orElse(Arrays.asList(("default"))));

        Optional<String> muskan= Optional.of("naman").filter(n -> n.startsWith("s"));

muskan.ifPresentOrElse(
    val -> System.out.println("found"),
    () -> System.out.println("default")
);
        }

    }
