# WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)


# iterative method

n = int(input("Enter number : "))
n1=0
n2=1
print("0", end=" ")
print("1", end=" ")
n3=n1+n2
for i in range(n):
    n3 = n1+n2
    n1=n2
    n2=n3
    print(n3, end=" ")

# recursive method

n = int(input("Enter number : "))

def fibonacci(n):
    if n<=1:
        return n
    else:
        return (fibonacci(n-1) + fibonacci(n-2))

print("Fibonacci sequence:")
for i in range(n):
    print(fibonacci(i))