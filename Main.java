import java.text.*;
import java.util.*;     
import java.lang.Math; 
public class Main {

    public static void main(String[] argv) throws Exception{

        ArrayList<User> arr_user = new ArrayList<User>();
        String keep;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); ;
        double total_discounts = 0;
        double income = 0;
        double current_value;
        int car_year;
        double car_value;
        int user_age;
        int flag = 0;

        System.out.println("Do you want to know the discount of a vehicle for you? (y/n)");
        keep = scanner.next().toUpperCase();

        while (keep.equals("Y") || keep.equals("YES")){

            User new_user = new User();
            do {
                System.out.println("car year?\n");
                car_year = scanner.nextInt();
                new_user.vec.set_year(car_year);
            } while( !(new_user.vec.get_year() >= 1990 && new_user.vec.get_year() <= 2014));

            do {
                if (flag != 0){
                    System.out.println("For buy a car, you should have age greater than 18");
                }
                System.out.println("Enter with the user age\n");
                user_age = scanner.nextInt();
                new_user.age = user_age;
                flag = 1;
            } while(new_user.age < 18);
            do {
                System.out.println("Enter value car\n");
                car_value = scanner.nextDouble();
                new_user.vec.set_value(car_value);
            } while(new_user.vec.get_value() <= 0 );
            
            new_user.vec.set_discount();
            new_user.set_discount();
            new_user.update_payment();
            new_user.set_discount_total();          
            arr_user.add(new_user);
            System.out.println("Do you want to know the discount of a vehicle for you? (y/n)");
            keep = scanner.next().toUpperCase();

    }

    //double max_discount = Float.POSITIVE_INFINITY;
    double min_discount = 0;
    User user_max_discount = new User();
    User user_current;
    double discount_percent;
    if (arr_user.size() > 0) {
        final Object[][] table = new String[arr_user.size()+1][];
        table[0] = new String[] {"Car value", "Age", "Discount Car", "Discount user", "Value final"};
        for(int i=0; i<arr_user.size(); i++){
            user_current = arr_user.get(i);
            table[i+1] = new String[] {String.valueOf(Math.round(user_current.vec.get_value()*100)/100), 
                                                        String.valueOf(Math.round(user_current.get_age()*100)/100), 
                                                        String.valueOf(Math.round(user_current.vec.get_discount()*100)/100),
                                                        String.valueOf(Math.round(user_current.discount*100)/100), 
                                                        String.valueOf(Math.round(user_current.payment*100)/100)};
            discount_percent = 1- (user_current.payment/user_current.vec.get_value());
            if (discount_percent > min_discount){
                min_discount = discount_percent; //user_current.discount_total;
                user_max_discount = user_current;
            }
            income = income + user_current.payment;
            total_discounts = total_discounts + user_current.discount_total;
        }

        for (final Object[] row : table) {
            System.out.format("%15s%15s%15s%15s%15s\n", row);
        }

        System.out.println("Discount total from Company is " + total_discounts);
        System.out.println("Income total from Company is " + income);
        System.out.println("User get more discount is " + user_max_discount.get_age() + " years");
        }
    }

}
