# Task 1 - investigation

1. What is point of NoSQL databases?
NoSQL databases are 

2. What is the CAP theorem?
The CAP theorem, is a theorem where you have three properties: Consistency, Avaliability and Partition tolerance. The theorem says you can only pick two of these properties and optimize them for your database model. 

### Consistency
"Every read receives the most recent write or an error"

### Availability
Every request receives a (non-error) response (but may not contain the most recent data!)

### Partition tolerance
The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes  

For NoSQL databases the two properties are Consistency and Partition tolerance

3. What are ideal use cases of HBase?
NoSQL databases are great for applications that require large data volume, because NoSQL do not have as many restrictions as other databases. NoSQL are designed to scale out instead of up, which is great if you have a lot of data. 
