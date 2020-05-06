import java.text.*;
import java.util.*;

public class User{
  private int age;
  public Vehicle vec = new Vehicle();
  public double discount;
  public double discount_total;
  public double payment;

/*  public User(int age, Vehicle vec){
    this.age = age;
    this.vec = vec;
  }
*/
  public void set_discount() {
    this.payment = this.vec.get_value() - this.vec.get_discount();
    if(this.age <= 40){
      this.discount = (0.5/100) * this.payment;
    }

    if(this.age >=41 && this.age <= 60){
      this.discount = 0.01 * this.payment;
    }

    else {
      this.discount = 0.02 * this.payment;
    }

  }

  public void update_payment(){
    this.payment = this.payment - this.discount;
  }

  public void set_discount_total(){
    this.discount_total = this.vec.get_discount() + this.discount;
  }

  public void set_age(int age){
    if(age >=18){
      this.age = age;
    }
    else {
      System.out.println("For buy a car, you should have age greater than 18");
    }
  }

  public int get_age(){
    return this.age;
  }

}