package utilities;

public class MyArray <T>{

	private T[] datas;

	public MyArray() {
		this.datas = (T[]) new Object[0];
	}
	
	public MyArray(T[] datas) {
		this.datas = datas;
	}
	
	/**
	 * @param index
	 * @return
	 */
	public T getData(int index) {
		return datas[index];
	}
	
	public T[] getDatas() {
		return datas;
	}
	
	public int size() {
		return datas.length;
	}
	
	public void addData(T data) {
		T[] aux = (T[]) new Object[this.datas.length+1];
		System.arraycopy(datas, 0, aux, 0, datas.length);
		aux[datas.length] = data;
		this.datas = aux;
	}
}
