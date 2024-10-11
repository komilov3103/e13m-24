package ru.mpei.l6.ClassWork;

import ru.mpei.l6.ClassWork.exceptinos.SystemNotFoundException;

public class ModelCalculator {
    public double calc(String[] nodes, String[] links) throws Exception{
        String system = null;
        for (String node : nodes) {
            if (node.equalsIgnoreCase("ees")){
                system = node;
            }
        }
        if (system == null){
            throw new SystemNotFoundException("System was not found, cannot calc node");
        }
        return 0.0;
    }
}
