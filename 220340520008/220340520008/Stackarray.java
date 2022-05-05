
 class Stackarray
 {
   int size;
   int top1;
   int top2;
   int arr[];
   
   
   Stackarray(int m)
   {
   
     this.arr=new int[m];
	 this.size=m;
	 this.top1=-1;
	 this.top2=size;
	 
	}
	
	void push1(int y1)
	{
	 if(top1 < top2-1){
	 top1++;
	 arr[top]=y1;
	 
	 }
	 else
	 {System.out.println("stack has overflow");
	 System.exit(1);
	 }
	}
	
	void push2(int y2){
	if(top1 < top2-1){
	top2--;
	arr[top2]=y2;
	}
	else{
	{System.out.println("stack has overflow");
	 System.exit(1);
	}
	}
	
   int pop1(){
  if (top1 >= 0){
    int y1=arr[top1];
	top1--;
	return y1;
  }
  else
  {
	  System.out.println("stack has underflow");
	 System.exit(1);
	}
  return 0;
  }
 
 int pop2(){
 
  if(top2 < size){
  int y2=arr[top2];
  top2++;
  return y2;
  
  }else
  {System.out.println("stack has underflow");
	 System.exit(1);
  
 }
 return 0;
 }
 
 public static void main(String... args){
  
  Stackarray s=new Stackarray(6);
  
  
  s.push1(5);
  s.push2(10);
   s.push2(15);
  s.push1(1);
  
  s.push2(7);
  s.push2(40);
  
  System.out.println("poped element form Stack1 is:"+s.pop1());
  System.out.println("poped element form Stack2 is:"+s.pop2());
 }
 }