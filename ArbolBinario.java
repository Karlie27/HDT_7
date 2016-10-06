public class ArbolBinario<E> {
	
	protected E val;
	protected ArbolBinario<E> parent;
	protected ArbolBinario<E> left,right;
	
	public ArbolBinario(){
		
	}
	
	public ArbolBinario(E value){
		this.val = value;
	}
	
	
	public ArbolBinario(E value, ArbolBinario<E> left, ArbolBinario<E> righte){
		this.val = value;
		if(left==null) {left = new ArbolBinario<E>();}
	
	}
	
	public ArbolBinario<E> left(){
		return left;
	}
	
	public ArbolBinario<E> right(){
		return right;
	}
	public ArbolBinario<E> parent(){
		return parent;
	}
	public void setLeft(ArbolBinario<E> newLeft)
	{
	        if (left != null && left.parent() == this) left.setParent(null);
	        left = newLeft;
	        left.setParent(this);
	}
	   public void setRight(ArbolBinario<E> newRight)
	    {

	        if (right != null && right.parent() == this) right.setParent(null);
	        right = newRight;
	        right.setParent(this);
	    }
	   protected void setParent(ArbolBinario<E> newParent)
	    {
	        
	            parent = newParent;
	        
	    }
	
	
	

}