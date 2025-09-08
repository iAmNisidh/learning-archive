
### when we create an arraylist it has an initial capacity (default is 10 )the capacityrefers to the size of the internalarray theat holds the elements before needing to resize

following steps occur when we add an elements to an arraylist

1. Check capacity before adding the new element arraylist checks if there is enough space in the internalarray (element data). if the array is full it needs to be redized

2. resize if necessary If the intenal array is full arraylist will create a new array with a larger capasity usually 
1.5 times the current capacity and copy elements from the old array to the new array

3. add the element:the nre elementis then added to the internal array at the appropriate index, and the size is incremented


---


a linkedlist is a lenier data str where each element is a seperate obj calle a node.Each node contains tow part:

1. data 

2. pointers

array me sirf 1 datatype ka data store hota hai par linked list  me data ke sath sath next data ki location store hota hai jisko pointers kehte hai 
in linked list every element is known as node and it has 2 things data and pointers 
types of linked list 

1. singly linkedlist isme har 1 node sirf ir sirf next node ko point kar ra hai or kast wala null ko point kar ra hoga 

2. doubly linkedlist isme har 1 node 1 dusre ke taraf point kar ri hoti hai 

3. circular linkedlist isme sigly wale me jo null point kar raha hai wo first wale ko pooint karega or double wale me first node ka do previous hai wo next ko point karega or jo last node ka next  hai wo first node ko point karega 
  
### in java a linkedlist stores its elements as node in a doubly linked list   

### Performance Considerations 
### LinkedList has different performance characteristics compared to ArrayList: 
### Insertions and Deletions: LinkedList is better for frequent insertions and deletions in the middle of the list because it does not require shifting elements, as in ArrayList. 
### Random Access: LinkedList has slower random access (get(int index)) compared to ArrayList because it has to traverse the list from the beginning to reach the desired index. 
### Memory Overhead: LinkedList requires more memory than ArrayList because each node in a linked list requires extra memory to store references to the next and previous nodes.

... [truncated for brevity, we'll format the whole] ...
