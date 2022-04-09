import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReduceStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 1; i <= 10; i++) {
			list.add(rnd.nextInt(100) + 1);
		}
		
		System.out.println(list);
		
		list.stream()
			//faz a soma de todos os items da lista
			.reduce((sum, nextValue) -> sum + nextValue)// args(acumulador)
			.ifPresent((value) -> System.out.println("soma de toda lista: " + value));
		
		double result = list.stream()
							.mapToDouble(val -> (double) val)
							.reduce(Double.POSITIVE_INFINITY, (min, next) -> Math.min(min, next));
		System.out.println("menor valor da lista: " + result);
	}

}
