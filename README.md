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


