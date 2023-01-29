# WAP to find a summation of a digit of a given number. (Iterative and recursive)

# iterative method

def getSum(n):
    # Initializing sum to 0
    sum = 0
    # Traversing through string
    for i in n:
        # Converting char to int
        sum = sum + int(i)
 
    return sum
 
# Driver code
 
 
if __name__ == "__main__":
    n = "123456789123456789123422"
 
    # Function call
    print(getSum(n))

# recursive method

def sum_of_digit(n, val):
 
    if (n < 10):
        val = val + n
        return val
 
    return sum_of_digit(n // 10, (n % 10) + val)
 
# Driver code
 
if __name__ == "__main__":
    num = 12345
 
    # Function call
    result = sum_of_digit(num, 0)
 
    print("Sum of digits is", result)