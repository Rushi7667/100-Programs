# WAP to find whether a number is Odd or Even without using a % operator.

n=int(input("Enter the number: "))
if n & 1: # This will check 
    print("odd")
else:
    print("even")