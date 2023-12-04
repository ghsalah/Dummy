list=[2,6,29,4,19]
number=0;
index=0;
m=0
n=0
for i in list:
    if i>number:
        number=i
        index=m        
    m=m+1    
print(f"The largest number is {number} in index {index}")       
for i in range(2,number):
    if number %i==0:
        n=1
if n!=1:
    print(f"the {number} is prime number")    
else:
    print(f"the {number} is not prime number")    
        list=[2,6,29,4,19]
number=max(list);
index=list.index(number);
n=0
print(f"The largest number is {number} in index {index}")       
for i in range(2,number):
    if number %i==0:
        n=1
if n!=1:
    print(f"the {number} is prime number")    
else:
    print(f"the {number} is not prime number")    
        
        
list=[2,6,29,4,19]
number=max(list);
index=list.index(number);
n=0
print(f"The largest number is {number} in index {index}")       
for i in range(2,number):
    if number %i==0:
        n=1
if n!=1:
    print(f"the {number} is prime number")    
else:
    print(f"the {number} is not prime number")    
        
