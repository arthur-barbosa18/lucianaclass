import java.text.*;
import java.util.*;     

public class Main {
    public static void main(String[] argv) throws Exception{

        ArrayList<User> arr_user = new ArrayList<User>();
        String keep;
        Scanner scanner = new Scanner(System.in);
        float total_discounts = 0;
        float income = 0;
        float current_value;
        int car_year;
        float car_value;
        int user_age;

        public String question(){
            System.out.println("Do you want to know the discount of a vehicle for you? (y/n)");
            keep = scanner.next().toUpperCase();
            return keep;
        }

        keep = question()
        while (keep == "Y" || keep == "YES"){
            User new_user = new User();
            do{
                System.out.println("car year?\n");
                car_year = scanner.next();
                new_user.vec.set_year(car_year);
            } while(new_user.vec.get_year() < 1990 &&  new_user.vec.get_year() > 2014)

            do {
                System.out.println("Enter with the user age\n");
                user_age = scanner.next();
                new_user.set_age(user_age)
            } while(new_user.get_age() < 18)

            do {
                System.out.println("Enter value car\n");
                car_value = scanner.next();
                new_user.vec.set_value(car_value)
            } while(new_user.get_value() <= 0 )
            
            new_user.vec.set_discount()
            new_user.set_discount()
            new_user.update_payment()
            new_user.set_discount_total()            
            arr_user.add(new_user)
            keep = question()
    }

    //float max_discount = Float.POSITIVE_INFINITY;
    float min_discount = 0;
    User user_max_discount;
    final Object[][] table = new String[4][];
    table[0] = new String[] {"Car value", "Age", "Discount Car", "Discount user", "Value final"}
    for(int i=0; i<arr_user.size(); i++){
        user_current = arr_user.get(i)
        table[i+1] = new String[] {user_current.vec.get_value(), user_current.get_age(), user_current.vec.get_discount(),
                                                    user_current.discout, user_current.payment}
        
        if (user_current.discount_total > min_discount){
            min_discount = user_current.discount_total
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
    System.out.println("User get more discount is" + user_max_discount.get_age + "years");
    }

}
