# Euler's problem 4 - Largest Palindrome Product
import math
def checkFactors(num):
    factors = []
    for i in range(1, num):
        if(num%i == 0):
            factors.append(i)
    
    return factors

def main():
    i = 2

    max = ""
    while(True):
        i = i + 1
        if(str(i) == str(i)[::-1]):
           factors = checkFactors(i)
           if(len(str(factors[math.floor(len(factors)/2)])) == 3 and len(str(factors[math.ceil(len(factors)/2)])) == 3):
               max = i
           elif(len(str(factors[math.floor(len(factors)/2)])) > 3 and len(str(factors[math.ceil(len(factors)/2)])) > 3):
               break
               
    print(max)
    print("test")


if __name__ == "__main__":
    main()