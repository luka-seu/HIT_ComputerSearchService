import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public class Inventory {

    private List inventoty;

    public Inventory() {
        this.inventoty = new LinkedList();
    }

    public void addComputer(String serialNum,double price,ComputerSpec spec){
        Computer computer = new Computer(serialNum,price,spec);
        this.add(computer);
    }

    private void add(Computer computer){
        inventoty.add(computer);
    }

    public List search(ComputerSpec spec){
        List searchResult = new LinkedList();
        for (Iterator i = inventoty.iterator();i.hasNext();){
            Computer computer = (Computer) i.next();
            if (computer.getComputerSpec().matches(spec)){
                searchResult.add(computer);
            }
        }
        return searchResult;
    }
}
