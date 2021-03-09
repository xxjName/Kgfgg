package com.am;

import com.utils.LettersUtils;

import java.util.*;

/***
 *  @Write algorithm class
 */
public class WritingAm {
    private static Map<String, List> mapList = new HashMap<>();
    /***
     *  init data
     */
    public WritingAm() {
        mapList.put("0", Arrays.asList(""));
        mapList.put("1",Arrays.asList(""));
        mapList.put("2",Arrays.asList("A","B","C"));
        mapList.put("3",Arrays.asList("D","E","F"));
        mapList.put("4",Arrays.asList("G","H","I"));
        mapList.put("5",Arrays.asList("J","K","L"));
        mapList.put("6",Arrays.asList("M","N","O"));
        mapList.put("7",Arrays.asList("P","Q","R","S"));
        mapList.put("8",Arrays.asList("T","U","V"));
        mapList.put("9",Arrays.asList("W","X","Y","Z"));
    }

    public void numberToLetter(String number){
        //Take the number out of the map and print it out
        StringBuilder arrNumber=new StringBuilder("Input:arr[] ={");
        String[] strTirm=number.split("");
        List<String[]> dataList=new ArrayList<String[]>();
        for(int i=0;i<strTirm.length;i++){
            arrNumber.append(strTirm[i]);
            if(i<strTirm.length-1){
                arrNumber.append(",");
            }
            //First, put the data in multiple sets into the same set
            List<String> lettersList=mapList.get(strTirm[i]);
            if(lettersList.size()>0){//exclude 1  0
                String[] letterArr= (String[]) lettersList.toArray();
                //Put the letters in the set
                dataList.add(letterArr);
            }
        }
        arrNumber.append("}");
        //Recursive implementation of multi array arrangement
        List<String[]> resultList= LettersUtils.integrationLetters(dataList,0,null);

        System.out.println(arrNumber.toString());
        System.out.print("Output:");
        //Print results
        for(int i=0;i<resultList.size();i++){
            String[] letterArr=resultList.get(i);
            System.out.print(" ");
            for(String s: letterArr){
                System.out.print(s);
            }
        }
    }

}
