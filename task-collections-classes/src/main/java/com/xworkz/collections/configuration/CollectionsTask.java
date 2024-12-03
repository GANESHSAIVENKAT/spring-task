package com.xworkz.collections.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Configuration
@ComponentScan("com.xworkz")
@Data
public class CollectionsTask {

	public CollectionsTask() {

	}
	@Bean
	public List getlist() {
		System.out.println("Get ArrayList");
		//create instance inser the values
		return new ArrayList();
	}
	@Bean
	public LinkedList getLinkedlist() {
		System.out.println("Get LinkedList");
		return new LinkedList();
	}
	@Bean
	public Set getHashset() {
		System.out.println("Get HashSet");
		return new HashSet();
	}
	
	@Bean
	public LinkedHashSet getLinkedHashset() {
		System.out.println("Get LinkedHashSet");
		return new LinkedHashSet();
	}
	
	@Bean
	public Iterable getIterable() {
		System.out.println("Get Iterable");
		return new ArrayList(); 
		
	}
	
	@Bean
	public Set getTreeSet() {
		System.out.println("Get TreeSet");
		return new TreeSet();
	}
	
	@Bean
	public Collection getCollection() {
		System.out.println("Get TreeSet");
		return new LinkedHashSet();
	}
	

	@Bean
	public Queue getQueue() {
		System.out.println("Get Queue");
		return new PriorityQueue();
	}
	@Bean
	public Map getHashMap() {
		System.out.println("Get HashMap");
		return new HashMap();
	}
	@Bean
	public Map getLinkedHashMap() {
		System.out.println("Get LinkedHashMap");
		return new LinkedHashMap();
	}

}
