package com.parallel.asynchronous;

import com.parallel.asynchronous.util.DataSet;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {

    public static List<String> string_toLowerCase(List<String> nameList){
        // Fetching the List of Strings from DataSet  Util & Converting into LowerCase
        return DataSet.namesList()
                .parallelStream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
