# Task 1 - investigation

1. What is point of NoSQL databases?

The point of NoSQL databases are to provide high throughput for simple read/write operations, a high fault tolerants meaning that it will continue to run with multiple failures, allowing variable data structure with it's schemaless approach and to horizontally distribute data.

2. What is the CAP theorem?  


The CAP theorem, is a theorem where you have three properties: Consistency, Avaliability and Partition tolerance. The theorem says you can only pick two of these properties and optimize them for your database model. 
#### Consistency
"Every read receives the most recent write or an error"
#### Availability
Every request receives a (non-error) response (but may not contain the most recent data!)
#### Partition tolerance
The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes  

For NoSQL databases the two properties are Consistency and Partition tolerance

3. What are ideal use cases of HBase?

NoSQL databases are great for applications that require large data volume, because NoSQL do not have as many restrictions as other databases. NoSQL are designed to scale out instead of up, which is great if you have a lot of data. 

# Task 2 - Bloom filters

1. What is a bloom filter?

A bloom filter is a data structure that that is space efficient and can rapidly tell you if an element is in a set.

2. What is an advantage of bloom filters over hash tables?

First a bloom filter is more space efficient, so it requires less space than a has table. Bloom filters are designed to see if an element is present in a set or not, so for example if you are designing a service where you need to register with an email, a bloom filter can rapidly check if that email is already in use.

3. What is a disadvantage of bloom filters?

A bloom filter has no memory, so we're only able to get yes or no answers. 

4. Using your language of choice, implement a bloom filter with add and
check functions. The backing bit-array can simply be a long (64 bit
integer).

See source code.

5.  If you are to store one million ASCII strings with an average size of 10
characters in a hash set, what would be the approximate space consumption?


6. The following equation gives the required number of bits of space per
inserted key, where E is the false positive rate.
b = 1.44log2(1/E) (1)

7. How many bits per element are required for a 1% false positive rate?

Fewer than 10 bits

8. How many bits per element are required for a 5% false positive rate?

9. If you are to store one million ASCII strings with an average size of 10
characters in a bloom filter, what would be the approximate space consumption, given an allowed false positive rate of 5%?.


# Task 3 - Huffman coding

1. Generate Huffmann Code (and draw the Huffmann Tree) based on the
following string: “beebs beepps!!!!! their eerie ears hear pears”

![Huffman](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/HuffmanTree.png)

2. How many bits is the compressed string? How many bits is the raw ASCII
string?

Compressed string = 139

(Bits for each char in compressed string: 
0011 10 10 0011 0010 000 0011 10 10 0111 0111 0010 110 110 110 110 110 000 11111 11110 10 1110 010 000 10 10 010 1110 10 000 10 0110 010 0010 11110 10 0110 010 0111 10 0110 010 0010)

Raw ASCII string = 360

3. Compress “pete is here” with the Huffmann tree from before.

0111 10 11111 10 000 1110 0010 000 11110 10 010 10

4. Write your own 10 word sentence. Generate the Huffmann Code (a new
Huffmann Tree), and write a new compressed message (ie. in binary).
Swap with one of your fellow students, and decompress each other’s message.

N/A

# Task 4 - Map and Reduce
Solve the following using Javascript, for example in your browser’s developer
console.
1. Map the list of numbers to a list of their square roots: [1, 9, 16, 100]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.1.JPG)

2. Map the list of words so each is wrapped in a <h1> TAG: [“Intro”, “Requirements”, “Analysis”, “Implementation”, “Conclusion”, “Discussion”,
“References”]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.2.JPG)

3. Use map to uppercase the words (all letters): [“i’m”, “yelling”, “today”]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.3.JPG)

4. Use map to transform words into their lengths: [“I”, “have”, “looooooong”,
“words”]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.4.JPG)

5. Get the json file comics.json from the course site. Paste it into your
browser’s Javascript console. Use map to get all the image urls, and wrap
them in img-tags.

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.5.JPG)

6. Use reduce to sum the array of numbers: [1,2,3,4,5]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.6.JPG)

7. Use reduce to sum the x-value of the objects in the array: [{x: 1},{x:2},{x: 3}]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.7.JPG)

8. Use reduce to flatten an array of arrays: [[1,2],[3,4],[5,6]]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4.8.JPG)

9. Use reduce to return an array of the positive numbers: [-3, -1, 2, 4, 5]

![Solution](https://github.com/MadsMeinertAndersenCPHBusiness/DBDAssignment2/blob/main/4%2C9.JPG)
