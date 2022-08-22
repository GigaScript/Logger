package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int sourceElementValue;
        int notFilteredCounter = 0;
        for (Integer integer : source) {
            sourceElementValue = integer;
            if (sourceElementValue >= treshold) {
                logger.log("Элемент \"" + sourceElementValue + "\" проходит");
                result.add(sourceElementValue);
                notFilteredCounter++;
            } else {
                logger.log("Элемент \"" + sourceElementValue + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + notFilteredCounter + " элемента из " + source.size());
        return result;
    }
}