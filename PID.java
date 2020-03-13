import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;


public class Main {
    public static void main(String[] args) throws Exception {
        long pid = ProcessHandle.current().pid();
        
        System.out.println("El ID del proceso actual es: " + pid);
        
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        System.out.println("El ID del proceso actual seguido del nombre es: " + bean.getName());

    }
}