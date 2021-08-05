package com.pluralsight.calcengine.Question3;

import java.util.ArrayList;
import java.util.List;

public class RevisionQ3 {
    class  NamePair
    {
        private   String key, value;

        public NamePair(String key, String value) {
            this.key=key;
            this.value=value;

        }
    }
    public void solve(List<String> names){
        List<NamePair> namePairList=new ArrayList<>();
        for (String  name:names)
        {
            String[] splitName=name.split(" ");
            NamePair namePair=new NamePair(splitName[0],splitName[1]);
            namePairList.add(namePair);
        }


    }

}
