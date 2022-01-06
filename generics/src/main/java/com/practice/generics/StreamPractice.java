package com.practice.generics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.management.InstanceAlreadyExistsException;

import com.practice.generics.Person.Sex;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StreamPractice streamPractice = new StreamPractice();
//
//		List<Employee> companyemplst = streamPractice.createCompany();
//
//		List<String> empskills = getherEmployeeSkills(companyemplst);
//		// System.out.println(empskills);
//
//		System.out.println(empskills.stream().collect(Collectors.joining(";")));

		List<Person> listofperson = new ArrayList<>();
		listofperson = createPerson();

		Instant instant = Instant.now();
		System.out.println(instant);

		Random random = new Random();
		// random.ints(17).forEach(System.out::println);
		System.out.println(random.nextInt());
		// below operation wont execute

		Arrays.stream(new int[] { 20, 34 }).map(i -> {
			System.out.println(i);
			return i;
		});

		Comparator<Integer> comparator = ((x, y) -> x - y);

		Predicate<Integer> pred = i -> {
			boolean status = false;

			if (i > 10)
				status = true;
			else
				status = false;

			return status;

		};

		Integer highest = Stream.of(1, 2, 4, 5, 6, 7, 2, 1).min(comparator).get();

		Integer lowest = Stream.of(3, 4, 9, 0, 1, 3, 48).max(comparator).get();

		Stream.of(3, 10, 12, 34, 9).filter(pred).forEach(System.out::println);

		System.out.println("Higest Number ::" + highest);
		System.out.println("Lowest Number ::" + lowest);

		int sum = Arrays.stream(new int[] { 20, 34 }).map(i -> {
			System.out.println(i);
			return i;
		}).sum();

		System.out.println(sum);

	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printargs(Integer custid, String... stringargs) {

		if (stringargs == null) {
			System.out.println("NUll arg provided");
			return;
		}

		if (stringargs.length == 0) {
			System.out.println("No Args provided");
		}

		String string[] = stringargs;
		for (String s : string) {
			System.out.println("Value in varargs :: " + s);
		}

	}

	public static List<String> getherEmployeeSkills(List<Employee> employees, Position... positions) {

		positions = positions == null || positions.length == 0 ? Position.values() : positions;
		List<Position> searchPositions = Arrays.stream(positions).collect(Collectors.toList());

		return employees == null ? Collections.emptyList()
				: employees.stream().filter(employee -> searchPositions.contains(employee.getPosition()))
						.flatMap(employee -> employee.getSkills().stream()).distinct().collect(Collectors.toList());

	}

	private static List<Person> createPerson() {
		Person person1 = new Person("Shoeb", LocalDate.of(1983, Month.JUNE, 12), Sex.MALE, "shoeb@gmail.com");
		Person person2 = new Person("Noori", LocalDate.of(1984, 01, 11), Sex.FEMALE, "noori_ayesha@gmail.com");

		List<Person> listperson = new ArrayList<>();
		listperson.add(person1);
		listperson.add(person2);
		return listperson;

	}


}
