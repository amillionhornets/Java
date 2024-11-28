# Euler's problem 4 - Largest Palindrome Product

def checkFactors(num):
    factors = []
    for i in range(1, num):
        if(num%i == 0):
            factors.append(i)
    
    return factors

def main():
    i = 0
    while(True):
        i+=1
        if(str(i) == str(i)[::-1]):
           print(i)
           print(checkFactors(i))
        if(i >= 9009):
            break
    print("test")


if __name__ == "__main__":
    main()