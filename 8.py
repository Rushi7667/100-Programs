# WAP to find a total odd and total even digit of a given number.

n = int(input("Enter the number : "))
odd = []
even = []

while(n>0):
    num = n%10
    if num%2==0:
        even.append(num)
    else:
        odd.append(num)
    n = int(n/10)

print("odd", odd)
print("even", even)