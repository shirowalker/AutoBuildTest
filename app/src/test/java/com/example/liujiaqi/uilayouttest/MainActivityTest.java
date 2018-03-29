package com.example.liujiaqi.uilayouttest;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.collection.IsMapContaining.hasValue;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

;

/**
 * Created by liujiaqi on 2018/3/22.
 */
public class MainActivityTest {
    MainActivity test=new MainActivity();
    @BeforeClass
    public static void init(){
        System.out.println("init()");
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("setUp()");
    }
    @After
    public void tearDown(){
        System.out.println("tearDown()");
    }
    @AfterClass
    public static void finish(){
        System.out.println("finish()");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("test1()");
        assertThat("android studio",startsWith("and"));
        assertThat("android studio",endsWith("dio"));
        assertThat("android studio",containsString("android"));
        assertThat("android studio",equalToIgnoringCase("android studio"));
        assertThat(10,lessThan(11));
    }
    @Test
    public void test2(){
        System.out.println("test2()");
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertThat(list,hasItem("a"));
        assertThat(list,hasItems("a","b"));
        String[] array=new String[]{"a","b","c","d"};
        assertThat(array,hasItemInArray("a"));

        Map<String,String> map=new HashMap<String,String>();
        map.put("a","hello");
        map.put("b","world");
        map.put("c","haha");
        assertThat(map,hasEntry("a","hello"));
        assertThat(map,hasKey("a"));
        assertThat(map,hasValue("hello"));
    }
}