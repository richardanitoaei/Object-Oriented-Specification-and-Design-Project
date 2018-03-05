import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;


public class North extends JPanel{
  private JLabel termLabel;
  private JLabel couponLabel;
  private JLabel frequencyLabel;
  private JSpinner dateSpinner;
  private JLabel priceLabel;
  private JSpinner inflationSpinner;
  private JLabel investmentLabel;
  private JComboBox names;
  private JLabel name;
  private JLabel date;
  private JLabel investment;
  private JLabel term;
  private JLabel coupon;
  private JLabel frequency;
  private JLabel price;
  private JLabel inflation;
  private String[] bondNames;
  private Bond currentBond;

  North(){
    NorthController nc = new NorthController();
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.gridy=0;
    c.gridx=1;
    c.weightx=0.5;
    c.weighty=0.5;
    c.fill = GridBagConstraints.BOTH;

    LocalDate initDate0 = LocalDate.now();
    Date initDate = java.sql.Date.valueOf(initDate0);
    LocalDate earliestDate0 = initDate0.minusYears(10);
    Date earliestDate = java.sql.Date.valueOf(earliestDate0);
    LocalDate latestDate0 = initDate0.plusYears(10);
    Date latestDate = java.sql.Date.valueOf(latestDate0);

    investmentLabel = new JLabel("0");
    termLabel = new JLabel("0");
    couponLabel = new JLabel("0");
    frequencyLabel = new JLabel("0");
    dateSpinner = new JSpinner(new SpinnerDateModel(initDate,earliestDate, latestDate,Calendar.YEAR));
    priceLabel = new JLabel("0");
    inflationSpinner = new JSpinner(new SpinnerNumberModel(0.05,0.0,1.0,0.01));
    setBondNames(nc.getList());
    names = new JComboBox(bondNames);
    names.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        BondDataBase bdb = new BondDataBase();
        int index = names.getSelectedIndex();
        currentBond = bdb.getBond(index);
        termLabel.setText(currentBond.getTerm() + "");
        couponLabel.setText(currentBond.getCoupon()+ "");
        frequencyLabel.setText(currentBond.getFrequency()+ "");
        dateSpinner.setValue(currentBond.getDate());
        priceLabel.setText(currentBond.getPrice()+ "");
        investmentLabel.setText(currentBond.getInvestment() + "");
      }
    });

    investment = new JLabel("investment:");
    investment.setHorizontalAlignment(SwingConstants.RIGHT);
    name = new JLabel("name:");
    name.setHorizontalAlignment(SwingConstants.RIGHT);
    date = new JLabel("date:");
    date.setHorizontalAlignment(SwingConstants.RIGHT);
    term = new JLabel("term:");
    term.setHorizontalAlignment(SwingConstants.RIGHT);
    coupon = new JLabel("coupon:");
    coupon.setHorizontalAlignment(SwingConstants.RIGHT);
    frequency = new JLabel("frequency:");
    frequency.setHorizontalAlignment(SwingConstants.RIGHT);
    price = new JLabel("price: ");
    price.setHorizontalAlignment(SwingConstants.RIGHT);
    inflation = new JLabel("inflation:");
    inflation.setHorizontalAlignment(SwingConstants.RIGHT);

    this.add(name,c);
    c.gridx ++;
    this.add(names,c);
    c.gridx++;
    this.add(date,c);
    c.gridx++;
    c.gridwidth = 2;
    this.add(dateSpinner,c);
    c.gridwidth = 1;
    c.gridx += 2;
    c.insets = new Insets(0,10,0,0);
    this.add(inflation,c);
    c.gridwidth = 2;
    c.gridx++;
    c.insets = new Insets(0,0,0,25);
    this.add(inflationSpinner,c);
    c.gridwidth=1;
    c.insets = new Insets(0,10,0,0);
    c.gridx=0;
    c.gridy++;
    this.add(term,c);
    c.gridx ++;
    this.add(termLabel,c);
    c.gridx ++;
    this.add(investment,c);
    c.gridx ++;
    this.add(investmentLabel,c);
    c.gridx ++;
    this.add(coupon,c);
    c.gridx ++;
    this.add(couponLabel,c);
    c.gridx ++;
    this.add(frequency,c);
    c.gridx ++;
    this.add(frequencyLabel,c);
    c.gridx ++;
    this.add(price,c);
    c.gridx ++;
    c.insets = new Insets(0,0,0,20);
    this.add(priceLabel,c);
  }
  public String getName(){
    return (String)names.getSelectedItem();
  }
  public int getTerm(){
    String term = termLabel.getText();
    return Integer.parseInt(term);
  }
  public int getCoupon(){
    String coupon = couponLabel.getText();
    return Integer.parseInt(coupon);
  }
  public int getFrequency(){
    String freq = frequencyLabel.getText();
    return Integer.parseInt(freq);
  }
  public Date getDate(){
    return (Date)dateSpinner.getValue();
  }
  public double getPrice(){
    String price = priceLabel.getText();
    return Double.parseDouble(price);
  }
  public double getInflation(){
    return (double)inflationSpinner.getValue();
  }
  public void setBondNames(String[] list){
    bondNames = list;
  }
  public Bond getBond(){
    return currentBond;
  }
}
