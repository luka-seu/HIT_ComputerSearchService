package spec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
public enum PriceRange {
    BELOW4,FOUR_5,FIVE_6,SIX_7,MORE7;
    public String toString(){
        switch (this){
            case BELOW4:
                return "below 4000";
            case FOUR_5:
                return "4000~4999";
            case FIVE_6:
                return "5000~5999";
            case SIX_7:
                return "6000~6999";
            case MORE7:
                return "Above 7000";
            default:
                return "6000~6999";
        }
    }
}
