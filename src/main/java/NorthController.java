public class NorthController{
  private String[] list;
  NorthController(){
    BondDataBase bdb = new BondDataBase();
    list = new String[bdb.getBonds().size()+1];
    list[0] = "choose bond";
    for(int i=1; i<list.length; i++){
      list[i] = bdb.getBond(i-1).getName();
    }
  }
  public String[] getList(){
    return list;
  }

}
