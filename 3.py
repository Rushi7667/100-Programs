# WAP to find a Factor of a given number (iterative and recursive)

# iterative

a = int(input("Enter the number : "))
x = []
for i in range(1,a+1):
    if a%i==0:
        x.append(i)
print(x)

# recursive

a = int(input("Enter number : "))
def factor(b,i):
    if (i<=b):
        if b%i==0:
            print(i, end=" ")
        factor(b,i+1)

factor(a,1)