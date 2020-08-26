import spec.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public class ComputerSearchTest {
    public static void main(String[] args) {
        Map properties = new HashMap();
        properties.put("brand", Brand.HUAWEI);
        properties.put("type", Type.GAMEPC);
        properties.put("computerType", ComputerType.LAPTOP);
        properties.put("screenSize", ScreenSize.INCH_11);
        properties.put("priceRange", PriceRange.FIVE_6);
        ComputerSpec computerSpec = new ComputerSpec(properties);


        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        List searchList = inventory.search(computerSpec);
        if (!searchList.isEmpty()){
            System.out.println("****search result:");
            for (Iterator it = searchList.iterator();it.hasNext();){
                Computer computer = (Computer) it.next();
                ComputerSpec spec = computer.getComputerSpec();
                System.out.println("we have a "+spec.getProperty("computerType")+" with" +
                        " the following properties:");
                for (Iterator iterator = spec.getProperties().keySet().iterator();iterator.hasNext();){
                    String propertyName = (String) iterator.next();
                    if (propertyName.equals("computerType")){
                        continue;
                    }
                    System.out.println("---"+propertyName+":"+spec.getProperty(propertyName));
                }
                System.out.println("you can have this "+spec.getProperty("computerType")+
                        " computer "+"for RMB " + computer.getPrice()+"\n****");
            }
        }else{
            System.out.println("sorry we have nothing for you");
        }


    }

    private static void initializeInventory(Inventory inventory) {
        Map specMap1 = new HashMap();
        specMap1.put("brand", Brand.HUAWEI);
        specMap1.put("type", Type.GAMEPC);
        specMap1.put("computerType", ComputerType.LAPTOP);
        specMap1.put("screenSize", ScreenSize.INCH_11);
        specMap1.put("priceRange", PriceRange.FIVE_6);
        ComputerSpec computerSpec1 = new ComputerSpec(specMap1);
        inventory.addComputer("123",10000.00,computerSpec1);

        Map specMap2 = new HashMap();
        specMap2.put("brand", Brand.XIAOMI);
        specMap2.put("type", Type.SOFTPC);
        specMap2.put("computerType", ComputerType.LAPTOP);
        specMap2.put("screenSize", ScreenSize.INCH_15);
        specMap2.put("priceRange", PriceRange.FIVE_6);
        ComputerSpec computerSpec2 = new ComputerSpec(specMap2);
        inventory.addComputer("1423",1000001.00,computerSpec2);


        Map specMap3 = new HashMap();
        specMap3.put("brand", Brand.DELL);
        specMap3.put("type", Type.OTHERPC);
        specMap3.put("computerType", ComputerType.SERVERPC);
        specMap3.put("screenSize", ScreenSize.INCH_14);
        specMap3.put("priceRange", PriceRange.FOUR_5);
        ComputerSpec computerSpec3 = new ComputerSpec(specMap3);


        inventory.addComputer("45",12000.00,computerSpec3);
        Map specMap4 = new HashMap();
        specMap4.put("brand", Brand.HONOR);
        specMap4.put("type", Type.GAMEPC);
        specMap4.put("computerType", ComputerType.LAPTOP);
        specMap4.put("screenSize", ScreenSize.INCH_14);
        specMap4.put("priceRange", PriceRange.BELOW4);
        ComputerSpec computerSpec4 = new ComputerSpec(specMap4);


        inventory.addComputer("56",40050.00,computerSpec4);
        Map specMap5 = new HashMap();
        specMap5.put("brand", Brand.THINKPAD);
        specMap5.put("type", Type.SOFTPC);
        specMap5.put("computerType", ComputerType.LAPTOP);
        specMap5.put("screenSize", ScreenSize.INCH_15);
        specMap5.put("priceRange", PriceRange.MORE7);
        ComputerSpec computerSpec5 = new ComputerSpec(specMap5);


        inventory.addComputer("89",6744.00,computerSpec5);
    }
}
