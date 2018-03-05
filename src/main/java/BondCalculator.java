import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BondCalculator extends JFrame{
  private North north;
  private Center center;
  private JButton buy;

  BondCalculator(){
    super("Bond Calculator");
    north = new North();
    center = new Center();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setPreferredSize(new Dimension(775,300));
    this.setLayout(new BorderLayout());
    this.add(north, BorderLayout.NORTH);
    this.add(center, BorderLayout.CENTER);
    buy = new JButton("BUY");
    buy.addActionListener(new ActionListener()
    {
      Investor investor = new Investor();
      public void actionPerformed(ActionEvent e)
      {
        DecimalFormat df3 = new DecimalFormat("#.####");
        Calculator cal = new Calculator(north.getBond(),north.getInflation());
        if(!(north.getBond() == null)){
          investor.addBond(north.getBond());
          investor.setPayout(investor.getPayout() + cal.payout());
          investor.setValue(investor.getValue() + cal.value());
          center.setCurrentPayout(investor.getPayout() + "");
          center.setCurrentValue(df3.format(investor.getValue()) + "");
        }
      }
    });
    this.add(buy,BorderLayout.SOUTH);
    center.setBorder(BorderFactory.createCompoundBorder(
       BorderFactory.createEmptyBorder(10, 10, 10, 10),
       BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK)));

    pack();
    setVisible(true);
  }
  public String getName(){
    return north.getName();
  }
  public int getTerm(){
    return north.getTerm();
  }
  public int getCoupon(){
    return north.getCoupon();
  }
  public int getFrequency(){
    return north.getFrequency();
  }
  public Date getDate(){
    return north.getDate();
  }
  public double getPrice(){
    return north.getPrice();
  }
  public double getInflation(){
    return north.getInflation();
  }
  public North getNorth(){
    return north;
  }
  public void setPayout(String text){
    center.setLabel0(text);
  }
  public void setValue(String text){
    center.setLabel1(text);
  }
  public void setDuration(String text){
    center.setLabel2(text);
  }
  public void setIrr(String text){
    center.setLabel3(text);
  }
}
