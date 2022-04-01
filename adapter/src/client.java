//import jdk.jshell.spi.ExecutionControl;
import model.Adapter;
import model.Socket;

public class client {
    public static void main(String[] args) {
        Socket chineseSocket = new Socket(240);
        Adapter adapter = new Adapter(chineseSocket);
        int v1 = getVolt(adapter, "chinese");
        int v2 = getVolt(adapter, "us");
        System.out.println("Chinese voltage: " + v1);
        System.out.println("US voltage: " + v2);
    }

    public static int getVolt(Adapter adapter, String type) {
        switch (type) {
            case "chinese": return adapter.getChinaVoltage();
            case "us":      return adapter.getUSVoltage();
            default:        System.out.println("doesn't support type: " + type); return 0;
        }
    }
}
