import java.util.List;
import java.util.Map;
import java.util.Set;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



public class oops {
  @FunctionalInterface
  public interface operate{
    public void add(int a , int b);
  
    
  }
    @FunctionalInterface
  public interface thread{
    public void start();
  
    

  }

 
  
 
 
  
 

  
public interface bike {


 public void average(int average);
  


}

public interface truck {
  
 public void average(double load);
  
}
   public class vehical implements bike,truck {
    int distance;
    String brand;
  @Override 
  public void average(int average){
    System.out.println("The average of bike is "+average+" km/l ");
    
  }
    public void average(double load){
    System.out.println("The load of Truck is "+load+ " kg ");
    
  }
  
}
public interface dada{
  
  public void name(String name );

}

public interface papa extends dada{
 

  public void name(int age);
}
 public  class beta implements papa {
  
       @Override
       public void name(String name){
   System.out.println( "my name is "+name);
       }
          public void name(int age){
   System.out.println("I am "+age+" year old");
       }
      }

        abstract class  ghar {
       
        public abstract  void  done(String strength ,int amount ,int rating , String location);
          
        
      
        
          
         } 
       
        
       
       public class makan extends ghar {
         String location; 
        
         public void  done(String strength ,int amount ,int rating , String location){
          System.out.println("a house is "+amount+" with "+strength+ " for "+ rating+ " at "+location);
         }
            
       
        
       }
      
      public class insufficient extends Exception {
      String Message;
      insufficient(String Message){
        super(Message);
      }
     
    
      
    }

    public class Invalid extends Exception {
      String Message;
      Invalid(String Message){
        super(Message);
      }
     
    
      
    }
  public class bankaccount {
  int Balance;
// int deposite;
  bankaccount(int Balance) {
    this.Balance=Balance;
  }
 
    public void Withdraw(int amount)throws insufficient{
      System.out.println("withdrawal amount is : "+ amount);
      
       if (Balance<amount) {
    throw new insufficient ("error: Insufficient Funds"
    );
  }
  Balance=Balance-amount;
  System.out.println("Update Balance : "+Balance);

    }

    public void deposite(int deposite)throws Invalid{
      System.out.println("Deeposite amount is : "+deposite);
    
      
      if(deposite<=0){

        throw new Invalid("Error : Invalid Amount");
      }
        Balance=Balance+deposite;
        System.out.println("Update Balance : "+Balance);
    }
   
  }


 




  public static void main(String[]arg){
    oops o=new oops();
    oops.vehical v1=o.new vehical();
    oops.beta b=o.new beta();
      oops.makan m=o.new makan();
      oops.Subject hindi=o.new Subject("Hindi", 80);
       oops.Subject Maths=o.new Subject("Maths", 80);
        oops.Subject english=o.new Subject("English", 90);
         oops.Subject science=o.new Subject("Science", 90);
        operate op=(int a, int b1)->{
    System.out.println( "Add :"+( a+ b1)); };
   
      op.add(60,20);
    
    
   
    
    
    v1.average(55);
    v1.average(2000.0);
    b.name("Ram Naresh");
    b.name(53);
    m.done("strong", 5000000, 8,"vanaras");
    hindi.s();
      Maths.s();
      
       english.s();
        
          science.s();
          try{
      oops.bankaccount bank=o.new bankaccount(900);
    
      bank.deposite(-80);
    }catch(Invalid e){
      e.printStackTrace();
      System.out.println(e.getMessage());

    } finally{
      System.out.println(" deposite process is done");
      
    }try{
       oops.bankaccount bank=o.new bankaccount(1200);
        bank.Withdraw(1500);
    }catch (insufficient e){
      e.printStackTrace();
      System.out.println(e.getMessage());

        
    } finally{
      System.out.println("withdraw process is done");
    }

   List User=new ArrayList<>();


   User.add("shubhi");
   User.add("vaibhav");
  User.add("janhavi");
  User.add(User.size());
 System.out.println( User.size());
 User.add(  User.indexOf("vaibhav"));
  User.remove(0);
try{
User.add( User.get(5));
System.out.println((User.toArray()));
}catch(Exception e){
for (Object u : User) {
  System.out.println(u);
  
}
}
finally{


List<Object> sub=new ArrayList<>();
sub.add( hindi);
sub.add(english);
sub.add(Maths);
sub.add(science);
for (Object tostring : sub) {
  System.out.println(tostring);
}

Set role= new HashSet<>();
role.add("admin");
role.add("Manager");
role.add("manager");
role.add("cashier");
role.add("manager");
role.add(6);
for (Object r : role) {
  System.out.println(r);
}

  Map <Object,String> Entry=new HashMap<>();
  Entry.put(1, "english");
  Entry.put(2, "hindi");
  Entry.put(3, "Maths");
  Entry.put(4, "science");
  System.out.println(Entry.get(3));
  for (Map.Entry<Object,String>e : Entry.entrySet()) {
    System.out.println(e.getKey()+" "+e.getValue());
    
  }
}

  }


  

  class Subject {
 String name;
  int rating;
  public void s(){
    System.out.println("Subject: "+name+" with "+rating);
  }
   @Override
    public String toString() {
        return "Subject: " + name + " with rating " + rating;
    }
    Subject(String name , int rating){
       this.name=name;
       this.rating=rating;
  }
 
 } 

  

  
}



  
  

