# Euler's problem 12 - Largest Palindrome Product
import math


def checkFactors(x):
    result = []
    i = 1
    while i*i <= x:
        if x % i == 0:
            result.append(i)
            if x//i != i:
                result.append(x//i)
        i += 1
    return result

def main():
    n = 1
    while True:
        curr = (int)((n*(n + 1))/2)
        if(len(checkFactors(curr)) >= 500):
            print(curr)
            break
        n+=1



if __name__ == "__main__":
    main()