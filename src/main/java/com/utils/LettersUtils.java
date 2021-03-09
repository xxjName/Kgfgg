package com.utils;

import java.util.ArrayList;
import java.util.List;

public class LettersUtils {


    public static List<String[]> integrationLetters(List<String[]> dataList, int index, List<String[]> resultList){
        //Determine whether the collection is empty
        if(index==dataList.size()){
            return resultList;
        }
        List<String[]> resultStr=new ArrayList<String[]>();
        if(index==0){//The first column array will add as many permutation data as there are letters by default
            String[] dataArr=dataList.get(0);
            for(String s : dataArr){
                resultStr.add(new String[]{s});
            }
        }else{
            String[] dataOb=dataList.get(index);
            for(String[] dataStr: resultList){
                for(String str : dataOb){
                    //Copy array and expand new elements
                    String[] dataArrCopy=new String[dataStr.length+1];
                    System.arraycopy(dataStr, 0, dataArrCopy, 0, dataStr.length);
                    dataArrCopy[dataArrCopy.length-1]=str;
                    //Append to result set
                    resultStr.add(dataArrCopy);
                }
            }
        }
        return integrationLetters(dataList,++index,resultStr);
    }
}
