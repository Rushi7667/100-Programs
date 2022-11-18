# WAP to find a factorial of a given integer (iterative and recursive)

# iterative method

n = int(input("Enter the number : "))
fact=1

for i in range(1,n+1):
    fact = fact * i
print(fact)

# recursive method

x=int(input("enter the number : "))

def factorial(n):
   if n == 1:
       return n
   else:
       return n*factorial(n-1)

a1 = factorial(x)
print(a1)