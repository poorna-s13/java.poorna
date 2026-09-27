package collections_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Llists_java {

	public static void main(String[] args) {
		
//		Linked list
		
		LinkedList<Object> k = new LinkedList<Object>();
		k.add("poorna");
		k.add(20);
		k.add(true);
		k.add("poorna");
		k.add(54.7);
		k.add('S');
		
		
		System.out.println(k);
		System.out.println(k.peekFirst());
		System.out.println(k);
		System.out.println(k.peekLast());
		System.out.println(k);
		
		System.out.println(k.pollFirst());
		System.out.println(k);
		System.out.println(k.pollLast());
		System.out.println(k);
		
		k.pop();
		System.out.println(k);
		
		System.out.println(k.hashCode());
		System.out.println(k.toString());
		
		
//		set 
		System.out.println("===========*SET*=============");
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("poorna");
		hs.add(20);
		hs.add(true);
		hs.add(13.4);
		hs.add("poorna");
		hs.add('S');
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.contains(20));
		
//		Tree set
		System.out.println("==========*TREE SET*================");
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add('S');
		ts.add('H');
		ts.add('!');
		ts.add('~');
		ts.add('4');
		
		System.out.println(ts);
		System.out.println(ts.ceiling('4'));
		System.out.println(ts.floor('4'));
		System.out.println(ts.higher('S'));
		System.out.println(ts.lower('S'));
		System.out.println(ts.subSet('4', '~'));
		
//		Map in collection
		System.out.println("=============*MAP*================");
		HashMap<Object,Object> m = new HashMap<Object,Object>();
		m.put(1, "Apple");
		m.put(2, "Apple");
		m.put(null, "Orange");
		m.put("check", true);
		m.put("Hi", "poorna");
		m.put(null, "java");
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get("Hi"));
		System.out.println(m.remove(null));
		System.out.println(m);
		
		System.out.println(m.replace(2, "Sai"));
		System.out.println(m);
		
//		Tree Map
		System.out.println("==============*TREE MAP*================");
 		TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
		tm.put('P', "Apple");
		tm.put(';', "Apple");
		tm.put('!', "Orange");
		tm.put('k', true);
		tm.put('7', "poorna");
		
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.values());
		
//      Stack
		System.out.println("==========*STACK*==========");
		Stack s = new Stack();
		s.add("Hello");
		
		s.push("poorna");
		s.push("java");
		s.push("nisha");
		s.push("python");
		s.push("pradeep");
		s.push("java");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		
		
		
	}

}
