import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Date;

public class Main{
  private static DecimalFormat df3 = new DecimalFormat("#.####");
  public static void main(String[] args){
    df3.setRoundingMode(RoundingMode.DOWN);
    BondCalculator cal = new BondCalculator();
    int index = 0;
    while(true){
      String name = cal.getName();
      int term = cal.getTerm();
      int coupon = cal.getCoupon();
      int frequency = cal.getFrequency();
      Date date = cal.getDate();
      double price = cal.getPrice();

      Bond bond = new Bond(term,coupon,frequency,name,date,price);
      Calculator calculator = new Calculator(bond,cal.getInflation());
      calculator.payout();
      calculator.value();
      calculator.macaulayDuration();
      calculator.irr();
      cal.setPayout(df3.format(calculator.getBond().getPayout()));
      cal.setValue(df3.format(calculator.getBond().getValue()));
      cal.setDuration(df3.format(calculator.getBond().getDuration()));
      cal.setIrr(df3.format(calculator.getBond().getIrr()));
    }
  }
}
