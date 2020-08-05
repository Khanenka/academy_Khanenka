package lesson12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1<T> {
	public void set(List<T> list) {
		HashSet<T> hs = new HashSet<>();
		for (T lst : list) {
			hs.add(lst);
		}
		list.clear();
for(T lf:hs) {
	list.add(lf);
}
	}

}
