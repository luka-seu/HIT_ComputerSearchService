package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum Processor {
    I9U,I9H,COREM,AMD;
    public String toString(){
        switch (this){
            case I9U:
                return "i9u";
            case I9H:
                return "i9h";
            case COREM:
                return "corem";
            case AMD:
                return "amd";
            default:
                return "i9h";
        }
    }

}
