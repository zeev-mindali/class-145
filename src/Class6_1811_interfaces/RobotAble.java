package Class6_1811_interfaces;

public interface RobotAble {
    boolean getMemory(int slotNumber);

    boolean putMemory(int slotNumber);

    String readMemorySN();

    boolean isMemoryOK();

    int getMemorySize();

    String getMemoryType();
}
