package com.util;

/**
 *
 * @author Hakim
 */
public class OsInfo {
    public static void main(String[] args) {
        String name=System.getProperty("os.name");
        String arch=System.getProperty("os.arch");
        String version=System.getProperty("os.version");
        int cores=Runtime.getRuntime().availableProcessors();
        long memories=Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        
        
        String result="""
            +-------------------+-----------------------+          
            OS Name      : %s       
            --------------------------------------------          
            OS Version   : %s
            --------------------------------------------
            OS Arach     : %s
            --------------------------------------------
            OS Cores     : %d
            --------------------------------------------
            Total Memory : %d
            Free Memory  : %d
            +-------------------+-----------------------+
                      
                      """.formatted(name,version,arch,cores,totalMemory,memories);
        
        System.out.println(result);
    }
}
