package org.mycompany;

import com.google.common.base.Joiner;

import java.util.ArrayList;

/**
 * Created by apachemain on 7/8/16.
 */
public class FirstGuava {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add(new Integer(i).toString());
        }

        System.out.println(list);

        System.out.println(Joiner.on("|").skipNulls().join(list));

    }
}