package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.List;

public class Concurrency {
    private List<String> CrawledSites=new ArrayList<String>();
    private List<String> LinkedSites=new ArrayList<String>();

    private void add(String site){
        synchronized (this)
        {
            if (!CrawledSites.contains(site)){
                LinkedSites.add(site);
            }
        }
    }
    /*
    *Get next site to crawl. Can return null (if nothing to crawl)
    *  */
    public String next(){
        // Need to check again if size has changed
        if (LinkedSites.size()>0)
        {
            return null;
        }
        synchronized (this)
        {
            String s=LinkedSites.get(0);
            LinkedSites.remove(0);
            CrawledSites.add(s);
            return s;
        }
    }

}
