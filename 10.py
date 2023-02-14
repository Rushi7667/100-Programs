# WAP to find a prime number between range (range should be entered by user).

start_point = int(input("enter starting number : "))
end_point = int(input("enter ending number : "))

a = []

for i in range(start_point, end_point+1):
    flag = 0
    n=i
    for j in range(2,i):
        if(n%j==0):
            flag=1
            break

    if(flag==0):
        a.append(n)

print(a)