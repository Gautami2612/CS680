package edu.umb.cs680.hw011;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

		public static void main(String[] args) {
			ArrayList<Car> cars = new ArrayList<Car>();
			cars.add(new Car("Infiniti(A)",2010, 10000, 5200f));
			cars.add(new Car("jeep(B)", 2011, 9000, 6100f));
			cars.add(new Car("kia(C)", 2012, 15000, 8100f));
			cars.add(new Car("ford(D)",2013,12000,5400f));
			cars.add(new Car("Lamborghini(E)",2014,9000,6500f));
			System.out.println("Name | Year |  Mileage | Price");
			for(Car c: cars){
				System.out.println("Before sort");
				System.out.println(c+" | "+c.getYear()+" | "+c.getPrice()+" | "+c.getMileage());
			}
			System.out.println("Results after sorting");
			
			Collections.sort(cars, new MileageComparator());
			System.out.println("Mileage: "+cars);
			
			Collections.sort(cars, new YearComparator());
			System.out.println("Year: "+cars);
			
			Collections.sort(cars, new PriceComparator());
			System.out.println("Price: "+cars);
			
			Collections.sort(cars, new ParetoComparator(cars));
			System.out.println("Pareto: "+cars);
			
		}

		
}
