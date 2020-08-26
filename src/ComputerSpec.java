import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
//单一原则：负责查询属性的匹配
public class ComputerSpec {
    private Map properties;

    public ComputerSpec(Map properties) {
        if (properties==null){
            this.properties = new HashMap();
        }else {
            this.properties = new HashMap(properties);
        }
    }
    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map getProperties(){
        return properties;
    }
    public boolean matches(ComputerSpec otherSpec){
        for (Iterator iterator = otherSpec.getProperties().keySet().iterator();iterator.hasNext();){
           String propertyName = (String) iterator.next();
           if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
               return false;
           }
        }
        return true;
    }

}
