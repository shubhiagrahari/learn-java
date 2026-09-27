import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;


public class report {
    public class Book {
         
          String category;
          int publishyear;
          double price;
          String title;
          Book( String category,int publishyear,double price,String title){
            this.category=category;
            this.title=title;
            this.publishyear=publishyear;
            this.price=price;
          }
          public void pin(){
            System.out.println("category: "+category+ " publish year: "+publishyear+ " price: " +price+ " title : "+title);
          }
          @Override
          public String toString(){
            return "category: "+category+",publish year: "+publishyear+ " price: " +price+ " title : "+title ;
          }
         }
  public static void main(String[] args) {
    report r=new report();
            List<Book> books = Arrays.asList(
            r.new Book("Fiction", 2001, 399.0, "The Silent River"),
            r.new Book("Science", 2010, 499.0, "Quantum World"),
            r.new Book("History", 1998, 299.0, "Ancient Civilizations"),
            r.new Book("Romance", 2015, 350.0, "Love in Winter"),
            r.new Book("Fantasy", 2020, 599.0, "Dragon’s Realm"),
            r.new Book("Biography", 2005, 450.0, "Life of a Legend"),
            r.new Book("Mystery", 2018, 420.0, "The Hidden Truth"),
            r.new Book("Self-Help", 2012, 300.0, "Mindset Matters"),
            r.new Book("Adventure", 2003, 380.0, "Journey Beyond"),
            r.new Book("Philosophy", 1995, 250.0, "Wisdom of Ages"),
            r.new Book("Children", 2021, 200.0, "Magic Tales"),
            r.new Book("Thriller", 2017, 520.0, "Dark Secrets"),
            r.new Book("Poetry", 2000, 275.0, "Whispers of Soul"),
            r.new Book("Education", 2011, 600.0, "Learning Java"),
            r.new Book("Drama", 2014, 340.0, "Broken Strings"),
            r.new Book("Travel", 2009, 310.0, "Across the Globe"),
            r.new Book("Health", 2016, 450.0, "Fitness First"),
            r.new Book("Cooking", 2008, 280.0, "Spice & Flavor"),
            r.new Book("Technology", 2019, 700.0, "AI Revolution"),
            r.new Book("Classic", 1985, 150.0, "Timeless Tales")
        );
        System.out.println(books.size());
        System.out.println(books.toString());
        Stream<Book> book=books.stream();
        for (Book b : books) {
          System.out.println(b);
          
        }
       book.distinct()
       .collect(Collectors.toList());

      //  book.filter((item)->item.startsWith('d'));

    List markList=new ArrayList<>();
    markList.add(84);
     markList.add(80);
    markList.add(85);
      markList.add(95);
       markList.add(88);

    
          List m=new ArrayList<>();
      m.add(94);
       m.add(69);
      m.add(-8);
        m.add(85);
         m.add(58);
  
   
          List ma=new ArrayList<>();
    ma.add(7);
     ma.add(29);
    ma.add(60);
      ma.add(45);
       ma.add(18);

          List mar=new ArrayList<>();
    mar.add(92);
     mar.add(60);
    mar.add(75);
      mar.add(65);
       mar.add(80);

       

       

     class student {
      String name;
      int rollno;
      List<Integer>marks;

      student(String name ,int rollno , List<Integer>marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
      }
      public void marksAverage() throws fail{
        int sum=0;
        for (int m : marks) {
          sum+=m;

          
                }      
                int average=  sum/marks.size();
        if (sum/marks.size()<33) {
          throw r.new fail("Sorry! You are fail score : "+sum/marks.size());
          
        }
         System.out.println( "scored : "+sum/marks.size());
      }
      
      public String toString()  {
        
        
          int sum=0;
        for (int m : marks) {
          sum+=m;

          
        }
        
        if (sum/marks.size()<33) {
          return ("Sorry! You are fail score: "+sum/marks.size());
          
        }
         return ( "scored : "+sum/marks.size());
        
        
      }
      public void about(){
        System.out.println("Report Card : "+name+" have "+rollno+ " rollno scored : " );
      }
       public void List()throws Invalid{
        System.out.println(marks );
        for (int m : marks) {
          
        
        if(m<=0||m>=100){
          throw r. new Invalid("Please Enter valid marks "+m);
        }
      
        }
 

   
      
    } 
     }
    
    try {
      student s1=new student("shubhi", 10, markList);
       s1.about();
       
    s1.marksAverage();
    } catch (fail e) {
      e.getMessage();
      System.out.println("Sorry!");
     
    }
     try {
      student s1=new student("shubhi", 10, markList);
       s1.List();
    } catch (Invalid e) {
      e.getMessage();
      System.out.println("Sorry!");
     
    }
   
   try {
      student s2=new student("janhavi", 100, m);
      s2.about();
    s2.marksAverage();
   } catch (Exception e) {
    e.getMessage();
      System.out.println(e.getMessage());
   }

    try {
      student s2=new student("janhavi", 100, m);
      s2.List();
    } catch (Invalid e) {
      e.getMessage();
      System.out.println(e.getMessage());
     
    }
    try{
     student s3=new student("Vaibhav", 110, ma);
      s3.about();
    s3.marksAverage();} catch (fail e) {
    e.getMessage();
      System.out.println(e.getMessage());
      
    }
   

     try{
     student s3=new student("Vaibhav", 110, ma);
     s3.List();} catch (Invalid e) {
    e.getMessage();
      System.out.println(e.getMessage());

    }
    try{
    
     student s4=new student("copilot", 210, mar);
     s4.about();
    s4.marksAverage();}
    catch (Exception e) {
    e.getMessage();
      System.out.println(e.getMessage());

  }

  try{
    
     student s4=new student("copilot", 210, mar);
   s4.List();}
    catch (Invalid e) {
    e.getMessage();
      System.out.println(e.getMessage());

  }
    List<Object> Total =new ArrayList<>();
     student s1=new student("shubhi", 10, markList);
     Total.add(s1);
        student s2=new student("janhavi", 100, m);
        Total.add(s2);
        student s3=new student("Vaibhav", 110, ma);
        Total.add(s3 );
        
     student s4=new student("copilot", 210, mar);
     Total.add(s4);
     
  
     Stream<Object> stream=Total.stream();
     stream.forEach((object)->System.out.println(object));
    //  List <Object> t=Total.stream()
    //  .sorted((p1, p2) -> Integer.compare(p1.average, p2.average))
    //  toList();
     
     


List <Integer> top= Arrays.asList(90,78,45,90,54,76);
Stream<Integer> topper=top.stream();
topper.filter((i)->i%2==0)


.filter((i)->i==90)
.map((i)->i*2)
.collect(Collectors.toList())

.forEach (System.out::println);
System.out.println(top);


List <String> arrange= Arrays.asList("shubhi","bhabhi","jiju","didi","vaibhav","bhaiya");
Stream<String> topper1=arrange.stream();
List<String> topper2=arrange.stream()
.filter((item)->item.startsWith("b"))
.collect(Collectors.toList());
System.out.println(topper2);
topper1.sorted()

.filter((item)->item.startsWith("b"))
 .map((item)->item.toUpperCase())


.forEach (System.out::println);
System.out.println(arrange);
   List<String> op = arrange.stream()
                                 .sorted() 
                                 .collect(Collectors.toList());

        System.out.println(op);


        try {
          Stream<String> fileStream=Files.lines(Path.of("path"));
          
        } catch (Exception e) {
         e.printStackTrace();
         System.out.println(e.getMessage());
        }

         Stream<String> empty=Stream.empty();



       
      }










    

  public class fail extends Exception {

  String Message;
  fail(String Message){
    super(Message);

  }
    
  }
  
   public class Invalid extends Exception {

  String message;
Invalid(String Message){
    super(Message);

  }

    
  }



}


