package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum ComputerType {
    PC,LAPTOP,SERVERPC;

    public String toString(){
        switch (this){
            case PC:
                return "pc";
            case LAPTOP:
                return "laptop";
            case SERVERPC:
                return "serverpc";
            default:
                return "pc";
        }
    }
}
