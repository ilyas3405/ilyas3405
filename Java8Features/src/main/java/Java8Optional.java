import java.util.Optional;

public class Java8Optional extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java8Optional java8optional = new Java8Optional();
		
		Integer value1 = 5;
		Integer value2 =  new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(java8optional.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		//Optional 
		System.out.println("First Parameter is available :: " + a.isPresent());
		System.out.println("Second Parameter is available :: " + b.isPresent());
		
		Integer value1 = a.orElse(new Integer(10));
		Integer value2 = b.get();
		return value1 + value2;

	}
}
