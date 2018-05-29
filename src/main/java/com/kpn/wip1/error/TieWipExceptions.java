package com.kpn.wip1.error;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;


@SuppressWarnings("serial")
public class TieWipExceptions extends Exception{
	
	public TieWipExceptions(@SuppressWarnings("rawtypes") Class clazz, String searchParamsMap) {
        super(TieWipExceptions.generateMessage(clazz.getSimpleName(), searchParamsMap));
    }

    private static String generateMessage(String entity, String searchParams) {
        return StringUtils.capitalize(entity) + " was not found for parameters " + searchParams;
    }
    
    

}
