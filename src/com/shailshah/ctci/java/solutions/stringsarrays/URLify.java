package com.shailshah.ctci.java.solutions.stringsarrays;

import com.shailshah.ctci.java.utils.StringUtils;

public class URLify {

    public String urlify(char[] url, int n) {
        int spaces = new StringUtils().countFrequency(new String(url), ' ', 0, n-1);
        int newLength = n + 2*spaces;
        int i = n - 1;
        int j = newLength -1;
        while(j >= 0) {
            if (url[i] != ' ') url[j--] = url[i];
            else {
                url[j--] = '0';
                url[j--] = '2';
                url[j--] = '%';
            }
            i--;
        }

        return new String(url).trim();
    }
}
