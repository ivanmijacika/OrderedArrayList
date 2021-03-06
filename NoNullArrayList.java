import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

    public NoNullArrayList(){
	super();
    }
    public NoNullArrayList(int startingCapacity){
	super(startingCapacity);
    }

    public T set(int index, T element){
	if (element == null) throw new IllegalArgumentException("Null is not a valid element.");
	else return super.set(index, element);
    }

    public boolean add(T element){
	if (element == null) throw new IllegalArgumentException("Null is not a valid element.");
	else return super.add(element);
    }

    public void add(int index, T element){
	if (element == null) throw new IllegalArgumentException("Null is not a valid element.");
	else super.add(index, element);
    }

}
