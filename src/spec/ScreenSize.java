package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum ScreenSize {
    INCH_11,INCH_116,INCH_14,INCH_15,INCH_16,INCH_OTHER;

    public String toString(){
        switch (this){
            case INCH_11:
                return "11 inch";
            case INCH_116:
                return "11.6 inch";
            case INCH_14:
                return "14 inch";
            case INCH_15:
                return "15 inch";
            case INCH_16:
                return "16 inch";
            case INCH_OTHER:
                return "below 11 inch";
            default:
                return "14 inch";
        }
    }
}
