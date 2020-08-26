package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum Type {
    GAMEPC,SOFTPC,OTHERPC;

    public String toString(){
        switch (this){
            case GAMEPC:
                return "gamepc";
            case SOFTPC:
                return "softpc";
            case OTHERPC:
                return "otherpc";
            default:
                return "gamepc";
        }
    }
}
