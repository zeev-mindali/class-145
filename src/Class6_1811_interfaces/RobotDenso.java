package Class6_1811_interfaces;

public class RobotDenso implements RobotAble {
    @Override
    public boolean getMemory(int slotNumber) {
        return false;
    }

    @Override
    public boolean putMemory(int slotNumber) {
        return false;
    }

    @Override
    public String readMemorySN() {
        return null;
    }

    @Override
    public boolean isMemoryOK() {
        return false;
    }

    @Override
    public int getMemorySize() {
        return 0;
    }

    @Override
    public String getMemoryType() {
        return null;
    }
}
