package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum Brand {
    HUAWEI,DELL,HP,XIAOMI,MSI,HONOR,THINKPAD;

    public String toString(){
        switch (this){
            case HUAWEI:
                return "huawei";
            case DELL:
                return "dell";
            case HP:
                return "hp";
            case XIAOMI:
                return "xiaomi";
            case MSI:
                return "msi";
            case HONOR:
                return "honor";
            case THINKPAD:
                return "thinkpad";
            default:
                return "huawei";
        }
    }
}
