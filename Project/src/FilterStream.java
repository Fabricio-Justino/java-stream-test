import java.util.ArrayList;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		list.stream()
			// filtra valures que são multiplos de 2
			.filter((value) -> value % 2 == 0) // return deve ser boolean
			// itera sobre eles e imprime no console
			.forEach((value) -> System.out.println(value + ": multiplo de dois"));
			
	}

}
