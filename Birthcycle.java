class Birthcycle
{
public static void main(String[] args)
{
int current_year=2023;
int birth_year=2001;
int age=(current_year-birth_year);
System.out.println("age : " +age);

int total_months= age*12;
System.out.println("total months : " +total_months);

int total_weeks=age*52;
System.out.println(" total weeks : " +total_weeks);

int total_days = age*365;
System.out.println("total days : " +total_days);

int total_hours = age*(total_months*24);
System.out.println("total hours : " +total_hours);



}
}
