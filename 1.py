# WAP to find a sum of even number into 1D array.

a = [1,2,3,4,5,6,7,8,9,10]
sum = 0

for i in range(len(a)):
    if a[i]%2==0:
        sum = sum + a[i]

print(sum)