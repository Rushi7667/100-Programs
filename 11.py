# WAP to find weather given number is Armstrong number is not.
import numpy as np
n= int(input("Enter the number : "))
a=n
b=[]
sum=0
# temp=a
while a>0:
    temp=int(a%10)
    a=int(a/10)

    b.append(temp)

c=len(b)

for i in range(len(b)):
    sum = sum + b[i]**c

# print(a)
if (sum==n):
    print(f"{n} is an armstrong number")
else:
    print(f"{n} is not an armstrong number")

print("sum : ",sum)