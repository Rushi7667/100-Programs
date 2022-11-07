# WAP to find whether string is palindrome or not.

s = 'abcba'

def isPalindrome(str):
 
    # Run loop from 0 to len/2
    for i in range(0, int(len(str)/2)):
        if str[i] != str[len(str)-i-1]:
            return False
    return True
 

ans = isPalindrome(s)
 
if (ans):
    print("Yes")
else:
    print("No")