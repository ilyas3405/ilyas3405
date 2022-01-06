package com.practice.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Worker> workers = new ArrayList<Worker>();
		workers.add(new Worker(102, "abhaya", 32));
		workers.add(new Worker(103, "aziz", 25));
		workers.add(new Worker(104, "abdul", 15));
		workers.add(new Worker(105, "saad", 19));
		workers.add(new Worker(106, "khan", 78));
		workers.add(new Worker(107, "samad", 22));
		workers.add(new Worker(108, "sharavanan", 69));
		workers.add(new Worker(109, "joseph", 96));
		workers.add(new Worker(110, "idrees", 15));

		// calling the old method
		double averageage = getAverageOldWay(workers);

		System.out.println("Average age of workders using old way :: " + averageage);

		double average8 = getAverageJava8(workers);
		System.out.println("Average age of workders using Java8 Stream :: " + average8);

		int totalage8 = getSumOfAges(workers);
		System.out.println("Sum of workers using Java8 Stream :: " + totalage8);
		
	}

	private static int getSumOfAges(List<Worker> workers) {
		// TODO Auto-generated method stub
		int sumOfAges = workers.stream().mapToInt(e -> e.getWorkerage()).reduce(0, intBinaryOperator);
		
		return sumOfAges;
	}

	private static double getAverageOldWay(List<Worker> workers) {

		int totalemployee = workers.size();
		double sum = 0;

		for (Worker worker : workers) {
			sum += worker.getWorkerage();
		}
		double average = sum / totalemployee;
		return average;

	}

	static IntBinaryOperator intBinaryOperator = new IntBinaryOperator()

	{
		public int applyAsInt(int left, int right) {
			return left + right;
		}
	};

	private static double getAverageJava8(List<? extends Worker> worker) {

		double average = worker.stream().mapToInt(e -> e.getWorkerage()).average().getAsDouble();
		return average;
	}
	
	
}

class Worker {

	public Worker(Integer workerid, String workername, Integer workerage) {
		super();
		this.workerid = workerid;
		this.workername = workername;
		this.workerage = workerage;
	}

	private Integer workerid;
	private String workername;
	private Integer workerage;

	public Integer getWorkerid() {
		return workerid;
	}

	public void setWorkerid(Integer workerid) {
		this.workerid = workerid;
	}

	public String getWorkername() {
		return workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public Integer getWorkerage() {
		return workerage;
	}

	public void setWorkerage(Integer workerage) {
		this.workerage = workerage;
	}

}
