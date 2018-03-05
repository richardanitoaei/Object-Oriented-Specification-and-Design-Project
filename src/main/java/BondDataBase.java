import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class BondDataBase{
  private ArrayList<Bond> bonds;
  BondDataBase(){
    bonds = new ArrayList<Bond>();
    LocalDate initDate0 = LocalDate.now();
    Date initDate = java.sql.Date.valueOf(initDate0);
    bonds.add(new Bond(5,5,"UK government bond",initDate,103));
    bonds.add(new Bond(10,4,"British bond",initDate,95));
    bonds.add(new Bond(20,3,"Scottish bond",initDate,92));
    bonds.add(new Bond(15,2,"Welsh bond",initDate,120));
    bonds.add(new Bond(17,3,"Irish bond",initDate,115));
    bonds.add(new Bond(4,3,"Newcastle bond",initDate,97));
    bonds.add(new Bond(8,7,"Barclays bond",initDate,135));
    bonds.add(new Bond(5,2,"Blackmore bond",initDate,88));
    bonds.add(new Bond(2,5,"London Capital bond",initDate,106));
    bonds.add(new Bond(10,4,"USA government bond",initDate,100));

  }
  public Bond getBond(int index){
    return bonds.get(index);
  }
  public ArrayList<Bond> getBonds(){
    return bonds;
  }

}
