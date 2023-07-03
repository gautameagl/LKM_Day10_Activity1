package com.lkm_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class App 
{
    public static void main( String[] args )
    {
    	

    	        String[] strings = {"Python", "Java", "ASP.NET", "Salesforce", "Generative AI"};
    	        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
    	        Collections.sort(list, (str1, str2) -> str1.compareToIgnoreCase(str2));
    	        System.out.println(list);
    	   

    }
}
