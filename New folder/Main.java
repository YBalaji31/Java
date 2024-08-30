class Stack{

int size;
int top=-1;
int[]stack;
Stack(int size){
this.size=size;
stack=new int[size];
}

void top(){
if(top==-1){
System.out.println("Stack is empty ");
}
else{
	System.out.println(stack[top]);
}
} 

void pop(){
	if(top==-1){
System.out.println("Stack is empty ");
}
else{
	top--;
}
}

void size(){
	System.out.println(size);
}

void push(int num){
	if(top+1==size){
		System.out.println("Stack is full");
		return;
	}
	top++;
	stack[top]=num;
}

}

class Main{
	public static void main(String[]args){
		Stack stack=new Stack(10);
		stack.push(10);
		stack.top();
		stack.size();
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(6);
		stack.top();
		stack.pop();
		stack.top();
		stack.pop();
		stack.top();stack.pop();
		stack.top();stack.pop();
		stack.top();stack.pop();
		stack.top();stack.pop();
		stack.top();stack.pop();
		stack.top();stack.pop();
		stack.top();
		
	}
}