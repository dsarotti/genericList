public class NodeList<T> {
	//El propio elemento
	private T elem;
	//La referencia al siguiente elemento
	private NodeList<T> next = null;
	//La referencia al anterior elemento
	private NodeList<T> prev = null;
	
	public NodeList(T elemento)
	{
		this.elem = elemento;
	}
	
	//Getters
	public T getElem()
	{
		return this.elem;
	}

	public NodeList<T> getNext()
	{
		return this.next;
	}

	public NodeList<T> getPrev()
	{
		return this.prev;
	}
	
	//Setters
	public void setElem(T elemento)
	{
		this.elem = elemento;
	}

	public void setNext(NodeList<T> siguiente)
	{
		this.next = siguiente;
	}

	public void setPrev(NodeList<T> anterior)
	{
		this.prev = anterior;
	}
}