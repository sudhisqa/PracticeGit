import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(1);
		
		
		int key = 4;

		for (int i = 0; i < list.size() - 1; i++) {
			Integer val1 = list.get(i);
			ListIterator<Integer> it = list.listIterator(i + 1);
			while (it.hasNext()) {
				Integer val2 = it.next();
				if (val1 + val2 == key) {
					System.out.println(val1 + "," + val2);
				}
			}
		}
	}
}
