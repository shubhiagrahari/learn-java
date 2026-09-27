import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.text.View;

public class Ecommerce {
  

  public static void main(String[] args) {

  
    
   class Product {
    int id;
    String name;
    double price;
     Product( int id,String name,double price){
      this.id=id;
      this.name=name;
      this.price=price;
    }
    public void getdetails(){
      System.out.println(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees.");
    }
    public String  toString(){
    return  (" ID: "+id+" Name: "+name+" Price: "+price+" in rupees.");
    }
  
      
    }
    class Electronic extends Product{
      String brand;
      int warranty;
      Electronic( int id,String name, double price,String brand,int warranty){
         super(id,name,price);
         this.brand=brand;
         this.warranty=warranty;
        
      }
      @Override
       public void getdetails(){
      System.out.println(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. Brand: "+brand+" Warranty: "+warranty+ " year from delivery month ");
    }
    @Override
 public String toString(){
      return(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. Brand: "+brand+" Warranty: "+warranty+ " year from delivery month ");
    }
    }
        
    enum Enum {
    SMALL, MEDIUM, LARGE, XL
}
        class clothes extends Product{
      String color;
       Enum size;
     
       
        String fabric;
     
   clothes( int id,String name, double price,String color,Enum size,String fabric ){
         super(id,name,price);
         this.size=size;
         this.fabric=fabric;
         this.color=color;
        
      }
      @Override
       public void getdetails(){
      System.out.println(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. size: "+size+" fabric : "+fabric+ " color : "+color);
    }
          @Override
    
           public String toString() {
             
             return 
      (" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. size: "+size+" fabric : "+fabric+ " color : "+color);
    }

    }
     class books extends Product{
      String Author;
       int publishyear;
       String Genre;
     
   books( int id,String name, double price,String Genre,int publishyear,String Author ){
         super(id,name,price);
         this.publishyear=publishyear;
         this.Author=Author;
         this.Genre=Genre;
        
      }
      @Override
       public void getdetails(){
      System.out.println(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. Author: "+Author+" publish year : "+publishyear+ " Genre "+Genre);
    }
      @Override
       public String toString(){
      return(" ID: "+id+" Name: "+name+" Price: "+price+" in rupees. Author: "+Author+" publish year : "+publishyear+ " Genre "+Genre);
    }
    }
    
     List <Product> pList= Arrays.asList(
      new Product(101,"powder",202),
        new Product(101, "Laptop", 55000.0),
            new Product(102, "Smartphone", 25000.0),
            new Product(103, "Headphones", 2000.0),
            new Product(104, "T-Shirt", 499.0),
            new Product(105, "Jeans", 1299.0),
            new Product(106, "Sneakers", 2999.0),
            new Product(107, "Novel - Java Basics", 499.0),
            new Product(108, "Cookbook", 799.0),
            new Product(109, "Tablet", 18000.0),
            new Product(110, "Smartwatch", 7000.0),
            new Product(111, "Formal Shirt", 899.0),
            new Product(112, "Jacket", 2499.0),
            new Product(113, "Children Story Book", 299.0),
            new Product(114, "Bluetooth Speaker", 1500.0),
            new Product(115, "Gaming Mouse", 1200.0),
            new Product(116, "Keyboard", 999.0),
            new Product(117, "Sports Shoes", 1999.0),
            new Product(118, "Romantic Novel", 399.0),
            new Product(119, "Monitor", 12000.0),
            new Product(120, "Earbuds", 2200.0),
            new Product(121, "Kurta", 899.0),
            new Product(122, "Saree", 2999.0),
            new Product(123, "Track Pants", 799.0),
            new Product(124, "Hoodie", 1499.0),
            new Product(125, "Cap", 299.0),
            new Product(126, "Shoes - Kids", 999.0),
            new Product(127, "Programming Book", 599.0),
            new Product(128, "History Book", 699.0),
            new Product(129, "Fiction Novel", 499.0),
            new Product(130, "Tablet Cover", 399.0),
            new Product(131, "Power Bank", 1200.0),
            new Product(132, "Charger", 799.0),
            new Product(133, "Earphones", 499.0),
            new Product(134, "Camera", 35000.0),
            new Product(135, "Tripod", 1500.0),
            new Product(136, "Mic", 2000.0),
            new Product(137, "Speaker System", 5000.0),
            new Product(138, "Smart TV", 45000.0),
            new Product(139, "Washing Machine", 30000.0),
            new Product(140, "Refrigerator", 40000.0),
            new Product(141, "Air Conditioner", 35000.0),
            new Product(142, "Mixer Grinder", 2500.0),
            new Product(143, "Water Bottle", 299.0),
            new Product(144, "School Bag", 899.0),
            new Product(145, "Notebook Set", 199.0),
            new Product(146, "Pen Pack", 99.0),
            new Product(147, "Study Lamp", 799.0),
            new Product(148, "Office Chair", 5500.0),
            new Product(149, "Table", 3500.0),
            new Product(150, "Bookshelf", 4500.0)
     
     );
     List<clothes> clothesList = Arrays.asList(
    new clothes(201, "T-Shirt", 499.0, "Blue", Enum.MEDIUM, "Cotton"),
    new clothes(202, "Kurta", 899.0, "White", Enum.LARGE, "Silk"),
    new clothes(203, "Jeans", 1299.0, "Black", Enum.LARGE, "Denim"),
    new clothes(204, "Saree", 2999.0, "Red", Enum.SMALL, "Georgette"),
    new clothes(205, "Hoodie", 1499.0, "Grey", Enum.XL, "Fleece"),
    new clothes(206, "Formal Shirt", 899.0, "Pink", Enum.MEDIUM, "Cotton"),
    new clothes(207, "Track Pants", 799.0, "Navy Blue", Enum.LARGE, "Polyester"),
    new clothes(208, "Cap", 299.0, "Black", Enum.SMALL, "Wool"),
    new clothes(209, "Jacket", 2499.0, "Brown", Enum.XL, "Leather"),
    new clothes(210, "Kids Dress", 599.0, "Yellow", Enum.SMALL, "Cotton")
);

List<books> bookList = Arrays.asList(
    new books(301, "Java Basics", 499.0, "Programming", 2015, "James Gosling"),
    new books(302, "Data Structures", 699.0, "Education", 2018, "Robert Lafore"),
    new books(303, "Ancient History", 399.0, "History", 2005, "Romila Thapar"),
    new books(304, "Romantic Tales", 299.0, "Romance", 2012, "Chetan Bhagat"),
    new books(305, "Mystery Nights", 450.0, "Mystery", 2019, "Agatha Christie"),
    new books(306, "Fantasy World", 599.0, "Fantasy", 2020, "J.K. Rowling"),
    new books(307, "Self Growth", 350.0, "Self-Help", 2016, "Robin Sharma"),
    new books(308, "Cooking Made Easy", 280.0, "Cooking", 2011, "Sanjeev Kapoor"),
    new books(309, "Philosophy of Life", 250.0, "Philosophy", 1995, "Osho"),
    new books(310, "Children Magic Tales", 200.0, "Children", 2021, "Ruskin Bond")
);
List<Electronic> electronicsList = Arrays.asList(
    new Electronic(401, "Laptop", 55000.0, "Dell", 2),
    new Electronic(402, "Smartphone", 25000.0, "Samsung", 1),
    new Electronic(403, "Headphones", 2000.0, "Sony", 1),
    new Electronic(404, "Smartwatch", 7000.0, "Apple", 1),
    new Electronic(405, "Bluetooth Speaker", 1500.0, "JBL", 1),
    new Electronic(406, "Gaming Mouse", 1200.0, "Logitech", 2),
    new Electronic(407, "Monitor", 12000.0, "LG", 3),
    new Electronic(408, "Camera", 35000.0, "Canon", 2),
    new Electronic(409, "Smart TV", 45000.0, "Sony", 3),
    new Electronic(410, "Refrigerator", 40000.0, "Whirlpool", 5)
);



     List<Product>  cart=new ArrayList();


System.out.println("\n Welcome to E-Commerce App");
 String Option[]={"\n 1. Show All Products",
" 2. Search Products",
" 3. Add to Cart",
" 4. View Cart",
" 5. Exit"};
for (String op : Option) {
  System.out.println(op);
}
Scanner sc=new Scanner(System.in);
 int input=sc.nextInt();
if(input==1){
for (Product p : pList) {
  System.out.println(p.toString());
}
for (Electronic p : electronicsList) {
  System.out.println(p.toString());
}
for (clothes p : clothesList) {
  System.out.println(p.toString());
}
for (books p : bookList) {
  System.out.println(p.toString());
}
}else if(input==2){
  System.out.println("Please choose your desire category : like (electronics,clothes,books,products,etc)");

 String Opt[]={"\n 1. products",
" 2. Electronics",
" 3. clothes",
" 4. books",};
for (String o : Opt) {
  System.out.println(o);
}
Scanner s=new Scanner(System.in);
int in=s.nextInt();


if (in==1) {
   for (Product p : pList) {
  System.out.println(p.toString());
}
System.out.println(" Please Search Products by name : ");

Scanner si=new Scanner(System.in);
String inp=si.nextLine();
    
    List<Product>pStream= pList.stream()
   .filter((e)->e.name.equalsIgnoreCase(inp))
  .toList();
 System.out.println(pStream);
}

else if (in==2) {
 for (Electronic p : electronicsList) {
  System.out.println(p.toString());
}
System.out.println("Search Electronics  by name: ");
Scanner si=new Scanner(System.in);
String inp=si.nextLine();
 
  List<Electronic>elecStream= electronicsList.stream()
   .filter((e)->e.name.equalsIgnoreCase(inp))
  .toList();
 System.out.println(elecStream);}

 else if (in==3) {
  for (clothes p : clothesList) {
  System.out.println(p.toString());
}

  
 System.out.println("Search clothes by name: ");
Scanner si=new Scanner(System.in);
String inp=si.nextLine();
  List<clothes>cloStream= clothesList.stream()
   .filter((e)->e.name.equalsIgnoreCase(inp))
  .toList();
 System.out.println(cloStream);}

 else if(in==4){
  for (books p : bookList) {
  System.out.println(p.toString());
}

  System.out.println("Search books by name: ");
Scanner si=new Scanner(System.in);
String inp=si.nextLine();
  List<books>boStream=bookList.stream()
   .filter((e)->e.name.equalsIgnoreCase(inp))
  .toList();
 System.out.println(boStream);}

  

}
  




     
else if(input==3){
   System.out.println("\n are u sure to add to cart ?");
Scanner s=new Scanner(System.in);
    String choice = s.nextLine();
    if (choice.equals("yes")) {
      System.out.println("please enter Id : ");
      Scanner i=new Scanner(System.in);
      int id=i.nextInt();
          if (clothesList.contains(id)) {
        
       List aList=clothesList.stream()
      .filter((c)->c.id==(id))
      .toList();}
      else  if (bookList.contains(id)) { 
        List aLis=bookList.stream()
      .filter((c)->c.id==(id))
      .toList();}
      else  if (electronicsList.contains(id)) {
         List ast=electronicsList.stream()
        .filter((c)->c.id==(id))
        .toList();}
        else  if (pList.contains(id)) {
          List at=pList.stream()
      .filter((c)->c.id==(id))
      .toList();}
            // List<Product>  cart=new ArrayList();
        
  

      List aList=clothesList.stream()
      .filter((c)->c.id==(id))
      .toList();
      // System.out.println(aList);
    
      
    // List aLis=bookList.stream().filter((c)->c.id==(id)).toList();
     List aLis=bookList.stream()
      .filter((c)->c.id==(id))
      .toList();
      // System.out.println(aLis);
      List ast=electronicsList.stream()
        .filter((c)->c.id==(id))
        .toList();
        // System.out.println(ast);
     
      List at=pList.stream()
      .filter((c)->c.id==(id))
      .toList();
      // System.out.println(at);
        //     List  cart=new ArrayList();
       cart.addAll(ast);
        cart.addAll(at);
        cart.addAll(aLis);
        cart.addAll(aList);
        // System.out.println(cart);
        // for (Object e : cart) {
 
// System.out.println(e);
    // }
    System.out.println("congrats your product is added to cart ");
  }

    else if (choice.equals("no")) {
      System.out.println("okk... no problem");
    }
 
    System.out.println("see view cart");
    Scanner y=new Scanner((System.in));
    boolean v=y.nextBoolean();

     if(v=true){
      System.out.println("View cart is here:");
         if(cart.isEmpty()){
          System.out.println("No product found");
         }else{
       cart.forEach(System.out::println);
    }
         
       
           double total= cart.stream()
           .map((p->p.price))
           .reduce(0.0,(acc,cum)->acc+cum);
           System.out.println("total:"+total);
          
         }}
        else if(input==4){
          System.out.println("View cart is here:");
         if(cart.isEmpty()){
          System.out.println("No product found");
         }else{
       cart.forEach(System.out::println);
    }
         
       
           double total= cart.stream()
           .map((p->p.price))
           .reduce(0.0,(acc,cum)->acc+cum);
           System.out.println("total:"+total);
        }

        else if(input==5){
          System.out.println("Thanks for giving time to  E-commerce App");
           System.exit(0);
        }
        }
   



// }

// else if (input == 3) { // Add to Cart
   
//        System.out.println("\n are u sure to add to cart ?");
// Scanner s=new Scanner(System.in);
//     String choice = s.nextLine();
//     if (choice.equals("yes")) {
//       System.out.println("please enter Id : ");
//       Scanner i=new Scanner(System.in);
//       int id=i.nextInt();
//        if (clothesList.contains(id)) {
        
//        List aList=clothesList.stream()
//       .filter((c)->c.id==(id))
//       .toList();}
//       else  if (bookList.contains(id)) { List aLis=bookList.stream()
//       .filter((c)->c.id==(id))
//       .toList();}
//       else  if (electronicsList.contains(id)) { List ast=electronicsList.stream()
//         .filter((c)->c.id==(id))
//         .toList();}
//         else  if (pList.contains(id)) {List at=pList.stream()
//       .filter((c)->c.id==(id))
//       .toList();}
  

//    try {
//     FileWriter fw = new FileWriter("cart.txt", true); // append mode
//     fw.write(id+ "\n");
//     fw.close();
//    System.out.println(" Congrats ! Product added to cart!");
// } catch (IOException e) {
//     System.out.println("Error while adding to cart: " + e.getMessage());
// }

    
    

    
// }

// else if (input == 4) { // View Cart
//     System.out.println("View cart is here:");
    
//    try{BufferedReader br = new BufferedReader(new FileReader("cart.txt"));
//     String line;
//     if ((line = br.readLine()) == null) {
//         System.out.println("No product found");
//     } 
//     else {
//         // do {
//         //     int id = Integer.parseInt(line.trim());

//         //     // Search product in all catalogs
//         //     pList.stream().filter(c -> c.id == id).forEach(System.out::println);
//         //     electronicsList.stream().filter(c -> c.id == id).forEach(System.out::println);
//         //     clothesList.stream().filter(c -> c.id == id).forEach(System.out::println);
//         //     bookList.stream().filter(c -> c.id == id).forEach(System.out::println);

//         // } while ((line = br.readLine()) != null);


// //       
//           cart.forEach(System.out::println);
       
//            double total= cart.stream()
//            .map((p->p.price))
//            .reduce(0.0,(acc,cum)->acc+cum);
//            System.out.println("total:"+total);
//     }
//     br.close();
//    }catch(Exception e){
//        System.out.println("error:"+e.getMessage());
//     }

    // Total sum
    // double total = cart.stream()
    //                    .map(p -> p.price)
    //                    .reduce(0.0,(acc,cum)->acc+cum);
    // System.out.println("Total: " + total);
}

  






 

