->when we create an arraylist it has an initial capacity (default is 10 )the capacityrefers to the size of the internalarray theat holds the elements before needing to resize


following steps occur when we add an elements to an arraylist
1. Check capacity before adding the new element arraylist checks if there is enough space in the internalarray (element data). if the array is full it needs to be redized
2. resize if necessary If the intenal array is full arraylist will create a new array with a larger capasity usually 1.5 times the current capacity and copy elements from the old array to the new array
3. add the element:the nre elementis then added to the internal array at the appropriate index, and the size is incremented

...........................................................................................................................................................................................................................................................

a linkedlist is a lenier data str where each element is a seperate obj calle a node.Each node contains tow part:
1. data 
2. pointers

array me sirf 1 datatype ka data store hota hai par linked list  me data ke sath sath next data ki location store hota hai jisko pointers kehte hai 
in linked list every element is known as node and it has 2 things data and pointers 
types of linked list 
1. singly linkedlist isme har 1 node sirf ir sirf next node ko point kar ra hai or kast wala null ko point kar ra hoga 
2. doubly linkedlist isme har 1 node 1 dusre ke taraf point kar ri hoti hai 
3. circular linkedlist isme sigly wale me jo null point kar raha hai wo first wale ko pooint karega or double wale me first node ka do previous hai wo next ko point karega or jo last node ka next  hai wo first node ko point karega 
  
->in java a linkedlist stores its elements as node in a doubly linked list   


Performance Considerations 
->LinkedList has different performance characteristics compared to ArrayList: 
->Insertions and Deletions: LinkedList is better for frequent insertions and deletions in the middle of the list because it does not require shifting elements, as in ArrayList. 
->Random Access: LinkedList has slower random access (get(int index)) compared to ArrayList because it has to traverse the list from the beginning to reach the desired index. 
->Memory Overhead: LinkedList requires more memory than ArrayList because each node in a linked list requires extra memory to store references to the next and previous nodes.

...........................................................................................................................................................................................................................................................................................................................

Key Features of Vector

thread safe


Dynamic Array: Like ArrayList, Vector is a dynamic array that grows automatically
when more elements are added than its current capacity.


Synchronized: All the methods In Vector are synchronized, which makes it thread-safe.
This means multiple threads can work on a Vector without the risk of corrupting the
data. However, this can introduce performance overhead in single-threaded
environments.


Legacy Class: Vector was part of Java's original release and is considered a legacy
class. It's generally recommended to use ArrayList in single-threaded environments
due to performance considerations.


Resizing Mechanism: When the current capacity of the vector is exceeded, It doubles
its size by default (or increases by a specific capacity increment if provided).


Random Access: SImilar to arrays and ArrayList, Vector allows random access to
foyents, making Tt efficlent for accessing elements using an




Constructors of Vector


Vector(): Creates a vector with an initial capacity of 10.


Vector(int initialCapacity): Creates a vector with a specified initial capacity.


Vector(int initialCapacity, int capacitylncrement): Creates a vector with an initial
capacity and capacity increment (how much the vector should grow when its capacity
is exceeded).


Vector(Collections? extends E> c): Creates a vector containing the elements of the
specified collection.


......................................................................................................................................................................................

Stack 

sinc stack ectends Vectors, it is synchronized making it thread safe 

It has a LIFO structure



............................................................................................................................................................................................




In Java, a Map is an object that maps keys to values. It cannot contain duplicatekeys,
 and each key can map to at most one value. Think of it as a dictionary
where you look up a word (key) to find itsdefinition (value)1    .

Key Characteristics of the Map Interface
Key-Value Pairs: Each entry in a Map consists of a key and a value.
Unique Keys: No two entries can have the same key.
One Value per Key: Each key maps to a single value.
Order: Some implementations maintain insertion order
(LinkedHashMap), natural order (TreeMap), or no order (HashMap).


* there is no order of HashMap

Key Characteristics
Unordered: Does not maintain any order of its elements.
Allows null Keys and Values: Can have one null key and multiple null
values.
Not Synchronized: Not thread-safe; requires external
synchronization if used in a multi-threaded context.
Offers constant-time performance (0(1)) for basic
Performance:
operations like get and put, assuming the hash function disperses
elements properly.


A hash function is an algorithm that takes an
input (or "key") and returns a fixed-size string
of bytes, typically a numerical value. The
output is known as a hash code, hash value, or
simply hash. The primary purpose ofa hash
function is to map data of arbitrary size to
data of fixed size

there are 4 commponent of hash map:-
1. key '
2. value 
3. bucekt
4. hashFuntion



hash function:-
Deterministic:The same input will always produce the same output.
Fixed Output Size: Regardless of the input size, the hash code has a
consistent size (e.g., 32-bit, 64-bit).
Efficient Computation: The hash function should compute the hash
quickly.

How Data is Stored in HashMap?
Step 1:
Hashing the Key: First, the key is passed through a hash function to generate
a unique hash code (an integer number). This hash code
helps determine where the key-value pair will be stored in
the array (called a "bucket array").

Step 2:
Calculating the Index: The hash code is then used to calculate an index in the array (bucketlocation) using
int index = hashCode % arraySize;
The index decides which bucket will hold this key-value pair.
For example, if the array size is 16, the key's hash code will be divided by
16, and the remainder will be the index.

Step 3: 
Storing in the Bucket:The key-value pair is stored in the bucket at the calculated index. Each
bucket can hold multiple key-value pairs
(this is called a collision handling mechanism, discussed later).

eg:
map.put("apple", 50)
• "apple" is the key.
• 50 is the value.
• The hash code of "apple" is calculated.
• The index is found using the hash code.
• The pair ("apple", 50) is stored in the
corresponding bucket.


collision matlab do alag alag input ke same  output aa sakta hai
aisa kiu ho ra hai?
kiu ki hash code finite no hai or or har input ke liye  hash code ayega hi jaruri ahi to 
2 inputs ke liye same bhi ho sakte hai hash code 

Finite Hash Space – Hash functions ek limited range ke numbers return karte hain, lekin input theoretically infinite ho sakta hai. Is wajah se kuch inputs ko same hash milna unavoidable hai.

Pigeonhole Principle – Agar hash function ka output range ( N ) values tak limited hai, aur inputs ( M ) (> ( N )) hon, to kuch inputs ka hash code repeat hoga

Non-Unique Mappings – Har input ke liye ek unique hash code generate hona zaroori nahi hai, especially jab hash function highly compressed representation bana raha ho (jaise MD5, SHA-256, etc.).


same hashVaue a jaye to kaise store hota hai data?
jab same ho jaye to buccket array ke andar linked list hota hai usme ja ke save ho jati hai values 

Key ka equals() method bhi check hota hai. Agar keys same hue (equals() true diya), to value update hoti hai.

Java 8 se pehle Linked List hota tha; Java 8 ke baad, agar list lambi ho to Tree ban jata hai.

link list ka treefication hota hai jab threshold cross ho jata hai tab {mtlb linked list red black tree me convert ho jata hai } threeshold 8entries  ppe ata hai mtlb jab 8 bar bahr jaye to tree ho jata hai 

Handling Collisions
Since different keys can generate the same index (called a collision),
HashMap uses a technique to handle this situation. Java's HashMap
uses Linked Lists (or balanced trees after Java 8) for this.
If multiple key-value pairs map to the same bucket, they are stored in a
linked list inside the bucket.
When a key-value pair is retrieved, the HashMap traverses the linked
list, checking each key until it finds a match.



har 1 infex pe ye store hota hai 
class Node<K, {
final int hash;  hash code of the key
final K key;     the key itself
V value;         the value associated with the key
Node<K, n        pointer to the next node in case of a collision ( I inked list)
}

How HashMap Retrieves Data
When we call get(key), the HashMap follows these steps:

1.Hashing the Key: Similar to insertion, the key is hashed using the same hash
function to calculate its hash code.

2.Finding the Index: The hash code is used to find the index of the bucket where
the key-value pair is stored.

3.Searching in the Bucket: Once the correct bucket is found, it checks for the
key in that bucket. If it finds the key, it returns the associated value.

HashMap Resizing (Rehashing)
HashMap has an internal array size, which by default is 16.
When the number of elements (key-value pairs) grows and
exceeds a certain load factor (default is 0.75), HashMap
automatically resizes the array to hold more data. This process is
called rehashing.
The default size of the array is 16, so when more than 12
elements (16 * 0.75) are inserted, the HashMap will resize.

During rehashing
The array size is doubled.
1. All existing entries are rehashed (i.e., their positions are recalculated)
and placed into the new array.
2. This ensures the HashMap continues to perform efficiently even as
more data is added.


Time Complexity
HashMap provides constant time 0(1) performance for basic
operations like put() and get() (assuming no collisions).
However, if there are many collisions, and many entries are
stored in the same bucket, the performance can degrade to O(n),
where n is the number of elements in that bucket.
But after Java 8, if there are too many elements in a bucket,
HashMap switches to a balanced tree instead of a linked list to
ensure better performance O(log n).

eg:
Suppose we want to store information
about the number of fruits in a store.
Here's what we want to store:
Fruit Quantity
Apple 50
Banana 30
Orange 80
Grape20

Internal Process
The key "Apple" is hashed using its hashCode(). Let's assume "Apple"
generates a hashCod.f 10832233 (this is just an example value).
The hashCode is used to calculate the index in the internal array (bucket
array). Let's say the array size is initially 16.
index
index
= hashCode % arraySize;
= 10832233 % 16 = 9
This means "Apple" will be stored in bucket 9


HashMap Structure (Array of Buckets, size:	16)
Index I Bucket (Key-Value Pairs)1
2
3
4 I ("Banana", 30)
5
6
7
8
9 I ("Apple", 50)
10
11
12
13
14 I ("Orange", 80) ("Grape", 20)	// Collision: stored in a linked list
15



obj ke andar hashcode hai wo memory ke sath khelta hai 

*******************************************************************************************************************

linked hashmap extends hashmap linked hashmap is sub class of hash map 

in linked hashmap order is maintined not like hashmap  

 linkedHashmap me 1 double linkedlist hoti hai jo ki sari entries ko rakhti hai apne andar matlab ppata rakh ti hai ki kis order me store ho ra hai

 hashmap ka fn hai getOrDefaultmatlab hai to de do jo hai agar nahi hai to default value jo diya hua hai wo de do 
 same fn hai hahsh map ka putIfNot = ager nai to dal do 
 not thred safe 
 *********************************************************************************************************************************************************

 sorted map 

 SortedMap is an interface that extends Map and
guarantees that the entries are sorted based on
the keys, either in their natural ordering or by a
specified Comparator.

implementation class of sorted map is tree map 

sorting based on keys hota hai 

Tree map --> red black tree --> self balancing binary serch tree 

NavigableMap extends SortedMap, providing
more powerful navigation options such as
finding the closest matching key or retrieving
the map in reverse order.

.....................................................................................................

sets is a colelction tht does not contain dublicate element 


faster operations
Map --> HashMap, LinkedHashMap,
Set --> HashSet LinkedHashSet





















................................................................................................................................................................

a data stru$ure that works on the
FIFO principle

elements at the end removed formthe end 



