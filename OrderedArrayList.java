public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

    public OrderedArrayList(){
	super();
    }

    public OrderedArrayList(int startingCapacity){
	super(startingCapacity);
    }

    private int find(T element){//helper for add
	int i = 0;
	while(i<size() && element.compareTo(get(i))>0) i++;
	return i;
    }

}
