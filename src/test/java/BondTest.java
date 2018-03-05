import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Date;

public class BondTest{
  private Date date = new Date(2018,11,11);
  private Bond bond0 = new Bond(5,5,"bond",date,103);
  private Bond bond1 = new Bond(10,4,"bond",date,95);
  private Bond bond2 = new Bond(20,3,"bond",date,92);
  private Bond bond3 = new Bond(15,2,"bond",date,120);
  private Bond bond4 = new Bond(4,3,"Newcastle bond",date,97);
  private Bond bond5 = new Bond(10,4,"USA government bond",date,100);
  private Calculator cal0 = new Calculator(bond0,0.05);
  private Calculator cal01 = new Calculator(bond0,0.02);
  private Calculator cal1 = new Calculator(bond1,0.05);
  private Calculator cal11 = new Calculator(bond1,0.02);
  private Calculator cal2 = new Calculator(bond2,0.05);
  private Calculator cal21 = new Calculator(bond2,0.02);
  private Calculator cal3 = new Calculator(bond3,0.05);
  private Calculator cal31 = new Calculator(bond3,0.02);
  private Calculator cal4 = new Calculator(bond4,0.05);
  private Calculator cal41 = new Calculator(bond4,0.02);
  private Calculator cal5 = new Calculator(bond5,0.05);
  private Calculator cal51 = new Calculator(bond5,0.02);
  @Test
  public void testPayout(){
    assertEquals(125,cal0.payout(),0.0);
    assertEquals(140,cal1.payout(),0.0);
    assertEquals(160,cal2.payout(),0.0);
    assertEquals(130,cal3.payout(),0.0);
    assertEquals(112,cal4.payout(),0.0);
    assertEquals(140,cal5.payout(),0.0);
  }
  @Test
  public void testValue(){
    assertEquals(99.999,cal0.value(),0.01);
    assertEquals(114.14,cal01.value(),0.01);
    assertEquals(92.278,cal1.value(),0.01);
    assertEquals(117.965,cal11.value(),0.01);
    assertEquals(75.075,cal2.value(),0.01);
    assertEquals(116.35,cal21.value(),0.01);
    assertEquals(68.86,cal3.value(),0.01);
    assertEquals(99.99,cal31.value(),0.01);
    assertEquals(92.908,cal4.value(),0.01);
    assertEquals(103.8077,cal41.value(),0.01);
    assertEquals(92.278,cal5.value(),0.01);
    assertEquals(117.965,cal51.value(),0.01);
  }
  @Test
  public void testMacaulayDuration(){
    assertEquals(4.54,cal0.macaulayDuration(),0.01);
    assertEquals(4.578,cal01.macaulayDuration(),0.01);
    assertEquals(8.359,cal1.macaulayDuration(),0.01);
    assertEquals(8.579,cal11.macaulayDuration(),0.01);
    assertEquals(14.47,cal2.macaulayDuration(),0.01);
    assertEquals(15.71,cal21.macaulayDuration(),0.01);
    assertEquals(12.61,cal3.macaulayDuration(),0.01);
    assertEquals(13.1,cal31.macaulayDuration(),0.01);
    assertEquals(3.821,cal4.macaulayDuration(),0.01);
    assertEquals(3.832,cal41.macaulayDuration(),0.01);
    assertEquals(8.359,cal5.macaulayDuration(),0.01);
    assertEquals(8.579,cal51.macaulayDuration(),0.01);
  }
  @Test
  public void testIrr(){
    assertEquals(0.0432,cal0.irr(),0.001);
    assertEquals(0.0463,cal1.irr(),0.001);
    assertEquals(0.0356,cal2.irr(),0.001);
    assertEquals(0.006,cal3.irr(),0.001);
    assertEquals(0.038,cal4.irr(),0.001);
    assertEquals(0.0399,cal5.irr(),0.001);
  }

}
