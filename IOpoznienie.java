package start;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 

public interface IOpoznienie {
	/*
	 * This interface is responsible for
	 *  creating a list that will be helpful 
	 *  in generating a randomly selected number.
	 * */
	default  int opoznienie() {
	List<Integer> lista = new ArrayList<Integer>();

	lista.removeAll(lista);
	lista.add(1000);
	lista.add(1200);
	int op = lista.get(new Random().nextInt(lista.size()));
	return op;
	}
}
