import javax.swing.*;
import java.awt.*;

public class Center extends JPanel{
  private JLabel payout;
  private JLabel value;
  private JLabel duration;
  private JLabel irr;
  private JLabel currentPayout;
  private JLabel currentValue;
  private JLabel label0;
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  private JLabel label5;
  private JLabel label6;
  private JLabel label7;
  private JLabel label8;
  private JLabel label9;

  Center(){
    setLayout(new GridLayout(4,4));

    payout = new JLabel("Bond's payout: ");
    payout.setHorizontalAlignment(SwingConstants.CENTER);
    value = new JLabel("Bond's value: ");
    value.setHorizontalAlignment(SwingConstants.CENTER);
    duration = new JLabel("Bond's macaulay's duration: ");
    duration.setHorizontalAlignment(SwingConstants.CENTER);
    irr = new JLabel("Bond's internal rate of return: ");
    irr.setHorizontalAlignment(SwingConstants.CENTER);
    currentPayout = new JLabel("Your bonds' current payout: ");
    payout.setHorizontalAlignment(SwingConstants.CENTER);
    currentValue = new JLabel("Your bonds' current value: ");
    value.setHorizontalAlignment(SwingConstants.CENTER);

    label0 = new JLabel("");
    label1 = new JLabel("");
    label2 = new JLabel("");
    label3 = new JLabel("");
    label4 = new JLabel("0");
    label5 = new JLabel("");
    label6 = new JLabel("");
    label7 = new JLabel("0");
    label8 = new JLabel("");
    label9 = new JLabel("");

    this.add(payout);
    this.add(label0);
    this.add(currentPayout);
    this.add(label4);
    this.add(value);
    this.add(label1);
    this.add(label5);
    this.add(label6);
    this.add(duration);
    this.add(label2);
    this.add(currentValue);
    this.add(label7);
    this.add(irr);
    this.add(label3);
    this.add(label8);
    this.add(label9);
  }
  public void setCurrentPayout(String cp){
    label4.setText(cp);
  }
  public void setCurrentValue(String cv){
    label7.setText(cv);
  }
  public void setLabel0(String text){
    label0.setText(text);
  }
  public void setLabel1(String text){
    label1.setText(text);
  }
  public void setLabel2(String text){
    label2.setText(text);
  }
  public void setLabel3(String text){
    label3.setText(text);
  }
}
