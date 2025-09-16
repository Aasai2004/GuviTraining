package day7;

public class ArrayStack {
	private int maxSize;
	private int top;
	private int[] stackArr;
	public ArrayStack(int size) {
		maxSize = size;
		top =-1;
		stackArr = new int[maxSize];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println("Stack is ");
			for(int i=top; i>=0; i--) {
				System.out.println(stackArr[i]+" ");
			}
		}
	}
	public boolean isEmpty() {
		return top == -1;
		
		
	}
	
	public boolean isFull() {
		return(top == maxSize -1 );
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full. Cannot push " +value);
			
		}
		else {
			stackArr[++top]=value;
			System.out.println("Pushed : " +value +" to the stack");
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		}
		else {
			int value = stackArr[top--];
			System.out.println("Popped " +value+" from the stack");
			return value;
		}
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		}
		else {
			int value = stackArr[top];
			System.out.println("Peek value is " +value+" from the stack");
			return value;
		}
	}

	public int size() {
		return top+1;
		
		
	}

	
	public static void main(String[]str) {
		ArrayStack stack = new ArrayStack(3);
		stack.display();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.display();
		
		System.out.println("Stack size is "+stack.size());
		stack.pop();
		System.out.println("Stack size is "+stack.size());
		stack.pop();
		System.out.println("Stack size is "+stack.size());
		stack.peek();
		stack.pop();
		System.out.println("Stack size is "+stack.size());
		stack.pop();
		stack.peek();
		
		
		
	
		

		
		
		
	}

}
