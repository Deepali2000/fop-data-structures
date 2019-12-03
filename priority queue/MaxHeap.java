<<<<<<< HEAD
import java.util.*;
class Max
{
int arr[]=new int[10];
int size=0;
public int getParentIndex(int i)
{
return (i-1)/2;
}
public int getLeftChildIndex(int i)
{
	return ((2*i)+1);
}
public int getRightChildIndex(int i)
{
	return ((2*i)+2);
}
boolean hasParent(int i)
{
	return getParentIndex(i)>=0;
}
boolean hasLeftChild(int i)
{
	return getLeftChildIndex(i)<size;
}boolean hasRightChild(int i)
{
	return getRightChildIndex(i)<size;
}
int Parent(int i)
{
return arr[getParentIndex(i)];
}
int LeftChild(int i)
{
	return arr[getLeftChildIndex(i)];
}
int RightChild(int i)
{
	return arr[getRightChildIndex(i)];
}
int size()
{
	return size;
}
boolean isEmpty()
{
	return size<=0; //or size==0;
}
int peek()
{
	return arr[0]; //alwayz in case of peek element
}
void insert(int val)
{
	arr[size]=val;
	size++;
	HeapifyUp(); //always strt from last element and will not retrun anything
}
void HeapifyUp()
{
	int i=size-1;
	while(hasParent(i)&&Parent(i)<arr[i])
	{
		swap(i,getParentIndex(i));
i=getParentIndex(i);
	}
}

void swap(int a,int b)
{
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}
void print()
{
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
int poll() //dlelte
{
int val=arr[0];
arr[0]=arr[size-1];
size--;
HeapifyDown();
return val;
}
void HeapifyDown()
{
	int i=0;
	while(hasLeftChild(i))
	{
    int greaterChildIndex=getLeftChildIndex(i);
    if(hasRightChild(i)&&RightChild(i)>LeftChild(i))
    {
    	greaterChildIndex=getRightChildIndex(i);
    }
    if(arr[i]<arr[greaterChildIndex])
    {
    	swap(i,greaterChildIndex);
    }
    else
    {
    	break;
    }
    i=greaterChildIndex;
}
}
}
public  class MaxHeap
{
		public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Max m=new Max();
	m.insert(10);
	m.insert(5);
	m.insert(3);
    m.insert(2);
    m.insert(7);
    m.print();
    m.poll();
    m.print();

}
=======
import java.util.*;
class Max
{
int arr[]=new int[10];
int size=0;
public int getParentIndex(int i)
{
return (i-1)/2;
}
public int getLeftChildIndex(int i)
{
	return ((2*i)+1);
}
public int getRightChildIndex(int i)
{
	return ((2*i)+2);
}
boolean hasParent(int i)
{
	return getParentIndex(i)>=0;
}
boolean hasLeftChild(int i)
{
	return getLeftChildIndex(i)<size;
}boolean hasRightChild(int i)
{
	return getRightChildIndex(i)<size;
}
int Parent(int i)
{
return arr[getParentIndex(i)];
}
int LeftChild(int i)
{
	return arr[getLeftChildIndex(i)];
}
int RightChild(int i)
{
	return arr[getRightChildIndex(i)];
}
int size()
{
	return size;
}
boolean isEmpty()
{
	return size<=0; //or size==0;
}
int peek()
{
	return arr[0]; //alwayz in case of peek element
}
void insert(int val)
{
	arr[size]=val;
	size++;
	HeapifyUp(); //always strt from last element and will not retrun anything
}
void HeapifyUp()
{
	int i=size-1;
	while(hasParent(i)&&Parent(i)<arr[i])
	{
		swap(i,getParentIndex(i));
i=getParentIndex(i);
	}
}

void swap(int a,int b)
{
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}
void print()
{
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
int poll() //dlelte
{
int val=arr[0];
arr[0]=arr[size-1];
size--;
HeapifyDown();
return val;
}
void HeapifyDown()
{
	int i=0;
	while(hasLeftChild(i))
	{
    int greaterChildIndex=getLeftChildIndex(i);
    if(hasRightChild(i)&&RightChild(i)>LeftChild(i))
    {
    	greaterChildIndex=getRightChildIndex(i);
    }
    if(arr[i]<arr[greaterChildIndex])
    {
    	swap(i,greaterChildIndex);
    }
    else
    {
    	break;
    }
    i=greaterChildIndex;
}
}
}
public  class MaxHeap
{
		public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Max m=new Max();
	m.insert(10);
	m.insert(5);
	m.insert(3);
    m.insert(2);
    m.insert(7);
    m.print();
    m.poll();
    m.print();

}
>>>>>>> 952faf54c1aecb69383e21fcc73ad86b755fd28a
}