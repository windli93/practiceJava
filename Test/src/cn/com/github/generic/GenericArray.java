package cn.com.github.generic;

public class GenericArray<T> {
    
	   private T[] array;
	    
	   @SuppressWarnings("unchecked")
	public GenericArray(int sz){
		   array = (T[])new Object[sz]; 
	   }
	   public void put(int index, T item){
		   array[index] = item;
	   }
	   
	   public T get(int index){
		   return array[index];
	   }
	   
	   public T[] rep(){
		   return array;
	   }
	   
	   public static void main(String[] args) {
		  GenericArray<Integer> rep = new GenericArray<Integer>(10);
		  Object[] ob = rep.rep();
	}
}
