import java.text.*;
import java.util.*;

public class Vehicle{

  private int year;
  private float value;
  private float discount;

  public Vehicle(int year, float value){
    this.year = year;
    this.value = value;
  }

  public void set_discout(){
    if(this.year <= 2000){
      this.discount = 0.12 * this.value;
    }

    if(this.year >=2000 && this.year <= 2010){
      this.discount = 0.07 * this.value;
    }

    if(this.year >=2010 && this.year <= 2014){
      this.discount = 0.03 * this.value;
    }
  }

  public float get_discount(){
    return this.discount;
  }

  public void set_year(int year){
    if(this.year >=1990 && this.year <= 2014){
      this.year = year;
    }
    else {
      System.out.println("We just have cars of years between 1990 and 2014!");
    }
  }

  public int get_year(){
    return this.year;
  }

  public float get_value(){
    return this.value;
  }


  public void set_value(value){
    if (value > 0){
      this.value = value;
    }
    else {
      System.out.println("Enter with the valid value. Valid value is > 0");
    }
  }

  public 

}