
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class FirstProgram {


    public static void main(String[] args) {
        System.out.println("har har mahadev");
        System.out.println("Shubhi");
      //variable
        int a=10;
        String name="Shubhi";
        String too="khushi";
        System.out.println(a);
        System.out.println(name);
        int b=20;
        //operator airthmatical 
        int add=(a+=b);
        int multi=(a*b);
        greet("vaibhav");
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(b++);
        System.out.println(--a);
        System.out.println(a==b);
        System.out.println(b+=5);
        

        System.out.println(add%multi);
        String addition=(name + too);
        System.out.println(addition);
        if(a+b==0 && a*b==10){

        System.out.println(true);
}
else{
  System.out.println(false);
}
        int age = 20;
        String language = "Java";
// string catenation
        System.out.println("my name is "+name+ ". I am in my "+age +" and my favourite language is " + language );
          //datatype
        float $num=3.1400007861f;
        double num=12.567892400000123;
        char _a='A';
        byte b3=127;
        // short s=150000000000000000000;
        short s1=15000;
        boolean b2=true;
        String []marks={"shubhi","janhavi","vaibhav","prashant"};
        Stream<String> marksheet=Arrays.stream(marks);
        marksheet.forEach(System.out::println);
        System.out.println($num + num + "_a "+ b3 + s1 + b2+marks[2]);
        System.out.println($num);
        System.out.println(_a);
        // foreach
        for (String  m : marks) {
            System.out.println(m);
        }
        // same but different
        for (int n=0;n<marks.length;n++){
            System.out.println(marks[n]);
        }

        // control flow
        
Scanner sc=new Scanner(System.in);
 System.out.println("Enter your Age");
 int age1=sc.nextInt();

 //loop
 int sum=0;
 int total=0;
 int su=0;
 

 for (int i=0;i<11;i++){
  if(i%2==0){
   System.out.println(i);
    sum+=i;
  }
  System.out.println(i);
  total+=i;}
  for(int i=20;i<41;i++){
    if(i%2==0){
      System.out.println(i);
      su+=i;

    }
   
  }
  
  System.out.println("Totsl Even Sum between 20-40 = "+su);


  

  
  
  
 
 System.out.println("total sum="+sum);
 System.out.println(total);

  for(int i=0;i<age1;i++){
     if(i==5){
        System.out.println("stop");
        break;
    }
    
    System.out.println(i);
   
  }
  
  int i=0;
  while(i<age1){
    i++;
    System.out.println("age is " +age1);
  }
  int d=0;
  
  do{
  
   
    System.out.println("grow up fast");
    d++;
  }
   while(d<age1);
   greet("janhavi");
  
   
  //ternary operator
   String ter=(age1>=18)?("yess! you can join"):("sorry! you are not eligible");
   System.out.println(ter);
  
 if(age1<=5){
    System.out.println("Aww! you are so cute");
 }
 else if(age1>5 && age1<=12){
   System.out.println("keep it grow, amazing!betaa ji"); 
}
else if(age1>12 && age1<18){
    System.out.println("wow! you are so young, please! Aware");
}
else if (age1%2==0||age1%3==0){
    System.out.println("perfect!");
}
else if(age1>=18&& age1<=50){
    System.out.println("congats! you are join Now");
}
else{
    System.out.println("Sorry! You are not eligible to open your account2");
}
    greet("shubhi");
    
 //switch
 System.out.println(simpleinterest(1200, 5, 10));
 Scanner c=new Scanner(System.in);
 System.out.println("Enter your Choice");
 int choice= c.nextInt();
 switch (choice) {
    case 1: System.out.println("Deposit"); break;
    case 2: System.out.println("Withdraw"); break;
    case 3: System.out.println("Check Balance"); break;
    default: System.out.println("Invalid choice");
}

System.out.println(compoundinterest(1200, 5, 10));

String letter[]={"shubhi","copilot"};
for (String let : letter) {
  System.out.println(let.toUpperCase()+" -> "+let.length());
  
}
System.out.println(D(24.0));
System.out.println(N(0));
System.out.println(N(5));
System.out.println(biggest(new int[]{5,3,7,2}));



//class with proties and behaviour p=variable b=function


 class car {
  String brand;
  String colour;
  int speed;
  private int price;

public void drive(){
   System.out.println(brand+" in "+colour+ " is driving at "+speed+ "km/hr");
}
 }


car car1=new car();
car1.brand="scorpio";
car1.colour="olive green";
car1.speed=170;
 car1.price=2900000;
car1. drive();
System.out.println(car1.price);

car car2=new car();
car2.brand="Nano" ; 
car2.colour="Gray";
car2.speed=100;
car2.drive();

car car3=new car();
car3.brand="Kiya" ; 
car3.colour="Blue";
car3.speed=140;
car3.drive();
 


 class student {
  String name;
   private String collegename;
 int rollno;
  int standard;
  String favsubject;

public void scooling(){
   System.out.println(name+" in "+collegename+ "  at "+rollno+ " in "+standard+" with "+favsubject );
 
  
 }
 public String getcollegename(){
  return collegename;
 }
  public  void setcollegename( String collegename){
 this.collegename=collegename;
 }
 

  student (String name,String collegename, int rollno, int standard, String favsubject){
        this.name=name;
         this.collegename=collegename;
        this.rollno=rollno;
        this.standard=standard;
        this.favsubject=favsubject;
        
  
    }
 }


  student baccho1=new student("Shubhi", "dsmnru", 112, 4, "DSA");
    baccho1.scooling();
   student baccho2=new student("janhavi", "dsmnru", 117, 4, "DDA");
    baccho2.scooling();
     student baccho3 =new student("Vaibhav", "dsmnru", 110, 4, "DAA");
    baccho3.scooling();
     student baccho4=new student("Prashant", "dsmnru", 152, 4, "DMA");
    baccho4.scooling();
   System.out.println(baccho1.getcollegename());
  
   baccho3.setcollegename("IET");
   System.out.println(baccho3.getcollegename());
   //inheritance
   


    abstract class principal{
        private String Subject;
         int duration;
         String Quality;
          

   
   
    
      
     principal(String Subject, int duration,String Quality){
       this.Subject=Subject;
       this.duration=duration;
       this.Quality=Quality;

     }

      public void done(){
      System.out.println("Principal style is done");
     }
   
    }
    // principal p=new principal("English", 50, "angry");
    // System.out.println(p.Quality );
    // System.out.println(p.Subject);
      
    class teacher1 extends principal {
      int Standard;
      teacher1(String Subject,int duration,String Quality ,int Standard){
        super(Subject,duration,Quality);
      
        this.Standard=Standard;
        


      }
      @Override

      public void done(){
      System.out.println("teacher1 style is done");
     }


    }
  teacher1 faculty=new teacher1("DSA", 20, "soft",3 );
  System.out.println(faculty.Standard);
  faculty.done();

   class teacher2 extends principal {
      int Standard;
      teacher2(String Subject,int duration,String Quality ,int Standard){
        super(Subject,duration,Quality);
      
        this.Standard=Standard;


      }
      @Override

 public void done(){
      System.out.println("teacher2 style is done");
     }
      public void done( String greet){
      System.out.println("teacher2 style is done"+ greet);
     }



    }
  teacher2 faculty2=new teacher2("DDA", 40, "concentrate",2 );
  System.out.println(faculty2.Standard);
  faculty2.done();

  class child extends teacher1 {
    String name;
    int Friend;
    child(  String name,String Subject, int duration, String Quality, int standard ,int Friend){
      super(Subject,duration,Quality,standard);
      this.name=name;
      this.Friend=Friend;

    }
  
      public void behaviour(){
       System.out.println(name+" with "+Friend+" friends");
      }
  }

    child c1=new child("Shubhi", "Java", 12," Dedication", 4, 3);
    System.out.println(c1.name);
   c1.behaviour();
   //method overiding runtime polymorphism


   principal p1=new teacher1("ds", 50, "bad", 5);
   p1.done();
   principal p2=new teacher2("ds", 50, "bad", 5);
   p2.done();

   // method overloading
   faculty2.done("good morning");
   faculty.done();
    //exception handling 
    int Arr[]={1,2,3,4};
    try{
    System.out.println(Arr[5]);
    }catch(Exception e){
      System.out.println("the total lenght of Arr is : "+Arr.length);

    }
    finally{
      System.out.println("done and thanxx");
    }
    







    }






   

   

  
 
  




   
   
    



 //method
 private static void greet(String name){
  System.out.println("hello "+name+ " Welcome to my company.");
}  
private static float simpleinterest (int p ,int r, int t
)   {
  return (p*r*t)/100;
  }
  private static double compoundinterest (int p ,int r, int t
)   {
  return p * Math.pow((1 + (r / 100.0)), t) - p;
  }
  private static double D(double number){
   
     
    return (number*2);
 
  }

    private static int  N(int n){
      int s=0;
    for(int i=1;i<n+1;i++){
      s+=i;
      
      }
     
    return(s);
    
 
  }
  public static int biggest (int array[]) {
    int largest=0;
    for(int i=1;i<array.length;i++)
 largest=Math.max(largest,array[i]);
    return(largest);
    
}

 
/**
 * bike
 */
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
   System.out.println(name);
       }
          public void name(int age){
   System.out.println(age);
       }
    }

  
    
  }
   
  




    
 

  
     
   

    

   
    
   

  
    




