class Flipkart
{
 public static void main(String args[])
 {
  String phone="APPLE iphone 14 (Blue,128GB)";
  int oprice= 79900;
  int offer = (oprice/100)*14;
  int price=oprice-offer;
  int packagingfee=price+99;
  
  int cashback=(packagingfee/100)*5;
  int pay_amount=packagingfee-cashback;
  int final_amount =pay_amount-7000; 
  
  
  System.out.println(" total price : " +price);
  System.out.println(" packaging fee : "+packagingfee);
  System.out.println( "amount to be paid : "+pay_amount);
  System.out.println("final amount : "+final_amount);

 }
}
   
  
  
  