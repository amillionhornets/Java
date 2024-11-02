# Euler's problem 3 - Largest Prime Factor

def sieve(n):
    primes = [True for i in range(n + 1)]
    i = 2
    while(i*i <= n):
        if(primes[i] == True):
            for j in range(i*i, n+1, i):
                primes[j] = False
        i+=1
    return primes
            
def main():
    primes = sieve(10000000)
    sum = 0
    num = 600851475143
    largeFactor = 0
    for i in range(2, len(primes)):
        if(primes[i]):
            if(num%i == 0):
                largeFactor = i
    print(largeFactor)



if __name__ == "__main__":
    main()