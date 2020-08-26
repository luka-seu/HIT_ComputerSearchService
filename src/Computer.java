/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/26
 */
//
public class Computer {
    private String serialNum;
    private double price;
    private ComputerSpec computerSpec;

    public Computer(String serialNum, double price, ComputerSpec computerSpec) {
        this.serialNum = serialNum;
        this.price = price;
        this.computerSpec = computerSpec;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public double getPrice() {
        return price;
    }

    public ComputerSpec getComputerSpec() {
        return computerSpec;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComputerSpec(ComputerSpec computerSpec) {
        this.computerSpec = computerSpec;
    }
}
