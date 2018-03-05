import java.util.ArrayList;

public class Investor{
  private ArrayList<Bond> bonds;
  private double payout;
  private double value;
  Investor(){
    bonds = new ArrayList<Bond>();
  }
  public void setPayout(double p){
    payout = p;
  }
  public void setValue(double v){
    value = v;
  }
  public void addBond(Bond bond){
    bonds.add(bond);
  }
  public ArrayList<Bond> getBonds(){
    return bonds;
  }
  public double getPayout(){
    return payout;
  }
  public double getValue(){
    return value;
  }
}
