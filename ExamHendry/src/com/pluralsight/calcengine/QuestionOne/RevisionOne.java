package com.pluralsight.calcengine.QuestionOne;

import java.util.*;

public class RevisionOne {


    public String  solve(List<Integer> numbers, Map<String, List<Integer>> queries){
        for (Map.Entry<String,List<Integer>>e:queries.entrySet()){
            String query=e.getKey();//
            List<Integer>params=e.getValue();
            if (query.equals("insert"))
            {
                int index=params.get(0);
                int value=params.get(1);
                numbers.add(index,value);
            }
            else if (query.equals("delete"))
            {
                int index=params.get(0);
                numbers.remove(index);
            }

        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Integer i:numbers)
        {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int elements=scanner.nextInt();
        scanner.nextLine();
        String listItems=scanner.nextLine();
        String[] numbers=listItems.split(",");
        List<Integer> numbersList=new ArrayList<>();
        for (String n:numbers)
            numbersList.add(Integer.parseInt(n));
        int noOfQueries=scanner.nextInt();
        scanner.nextLine();
        Map<String,List<Integer>> queries=new HashMap<>();
        for (int k=0; k<noOfQueries;k++)
        {
            String query=scanner.nextLine();
            String parameters=scanner.nextLine();
            List<Integer>parameterList=new ArrayList<>();
            String[] params=parameters.split(",");
            for (String n: params)
                parameterList.add(Integer.parseInt(n));
            queries.put(query,parameterList);
        }
        RevisionOne revisionOne=new RevisionOne();
        String output=revisionOne.solve(numbersList,queries);
        System.out.println(output);
    }
}
