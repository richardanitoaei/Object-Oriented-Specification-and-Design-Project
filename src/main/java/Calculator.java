public class Calculator{
  private Bond bond;
  private double rate;

  Calculator(Bond b, double r){
    bond = b;
    rate = r;
  }
  public double payout(){
    double payout = 0;
    for(int i=0; i<bond.getTerm()*bond.getFrequency(); i++){
      payout += bond.getCoupon();
    }
    payout += bond.getInvestment();
    bond.setPayout(payout);
    return payout;
  }
  public double value(){
    double value = 0;
    for(int i=1; i<bond.getTerm()*bond.getFrequency(); i++){
      value += bond.getCoupon()/Math.pow((1+rate),i);
    }
    value += (bond.getInvestment()+bond.getCoupon())/Math.pow((1+rate), bond.getTerm());
    bond.setValue(value);
    return value;
  }
  public double macaulayDuration(){
    double value = 0;
    for(int i=1; i<bond.getTerm()*bond.getFrequency(); i++){
      value += bond.getCoupon()*i/Math.pow((1+rate),i);
    }
    value += (bond.getCoupon()+bond.getInvestment())*bond.getTerm()/Math.pow((1+rate),bond.getTerm());
    double outcome = value/value();
    bond.setDuration(outcome);
    return outcome;
  }
  public double irr(){
    double irr = bond.getCoupon() / bond.getInvestment();
    double outcome= 0;
    while(bond.getPrice()-outcome>0.1 || outcome-bond.getPrice()>0.1){
      outcome = 0;
      for(int i=1; i<=bond.getTerm()*bond.getFrequency(); i++){
        outcome += bond.getCoupon()/Math.pow((1+irr),i);
      }
      outcome += bond.getInvestment()/Math.pow((1+irr),bond.getTerm());
      if(outcome>bond.getPrice() && outcome-bond.getPrice()>0.1) irr += 0.0001;
      else if(bond.getPrice()>outcome && bond.getPrice()-outcome>0.1) irr -= 0.0001;
    }
    bond.setIrr(irr);
    return irr;
  }
  public Bond getBond(){
    return bond;
  }

}
