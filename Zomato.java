class Zomato
{
public static void main(String[] args)

{
System.out.println("               MEHFILL'S FAMILY RESTAURANT");
System.out.println("                  jNTU road,");
System.out.println("            kukatpally,Hyderabad,Telangana.");
System.out.println("               GSTIN:-   27DKAPP6962F1ZV");
System.out.println("              FSSAI Lic No. 29484804009789");
System.out.println("___________________________________________________");
System.out.println("Date: 20-Aug-2023                 Time : 12.45pm"); 
System.out.println("___________________________________________________");
System.out.println("CUSTOMER NAME : MADHU              Bill No.1234");
System.out.println("___________________________________________________");
int pizza = 758;
int biryani = 500;
int coke = 300;
int pastry = 800;
System.out.println("FOOD ITEMS         NET COST   TOTAL COST ");           
System.out.println("PIZZA(2)             379       "+pizza);
System.out.println("BIRYANI(1)           500       "+biryani);
System.out.println("COKE(2)              150       "+coke);                                           
System.out.println("PASTRY(4)            200       "+pastry);                                                                     

byte quantity_pizza = 2;
byte quantity_biryani = 1;
byte quantity_coke  = 2;
byte  quantity_pastry = 4;
System.out.println("___________________________________________________");


int Subtotal=pizza+biryani+coke+pastry;
System.out.println("Total QTY :4      Sub total:   " +Subtotal);

double CGST= 2.5;
CGST=(Subtotal*2.5)/100;
System.out.println("CGST                 "+CGST);   
double F_total=Subtotal+CGST;
int discount = (Subtotal/100)*15;
System.out.println("Discount             " +discount); 
double total=F_total-discount;
System.out.println("___________________________________________________");
System.out.println("Grand Total                   "+total);
System.out.println("___________________________________________________");
System.out.println("                   THANK YOU ");
System.out.println("                  VISIT AGAIN! ");
System.out.println("           *Terms and Conditions apply* ");
}
}




