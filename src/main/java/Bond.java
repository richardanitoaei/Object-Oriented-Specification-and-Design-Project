import java.lang.Math;
import java.util.Date;

public class Bond{

  private int term;
  private int coupon;
  private int frequency;
  private String name;
  private Date date;
  private double price;
  private double payout;
  private double value;
  private double duration;
  private double irr;
  private double investment;

  Bond(int t, int c, int f, String n, Date d,double p){
    investment = 100;
    term = t;
    coupon = c;
    frequency = f;
    name = n;
    date = d;
    price = p;
  }
  Bond(int t, int c, String n, Date d, double p){
    investment = 100;
    term = t;
    coupon = c;
    frequency = 1;
    name = n;
    date = d;
    price = p;
  }
  public int getTerm(){
    return term;
  }
  public int getCoupon(){
    return coupon;
  }
  public int getFrequency(){
    return frequency;
  }
  public double getPrice(){
    return price;
  }
  public String getName(){
    return name;
  }
  public Date getDate(){
    return date;
  }
  public void setPayout(double p){
    payout = p;
  }
  public void setValue(double v){
    value = v;
  }
  public void setDuration(double d){
    duration = d;
  }
  public void setIrr(double irr){
    this.irr = irr;
  }
  public double getPayout(){
    return payout;
  }
  public double getValue(){
    return value;
  }
  public double getDuration(){
    return duration;
  }
  public double getIrr(){
    return irr;
  }
  public double getInvestment(){
    return investment;
  }
}
