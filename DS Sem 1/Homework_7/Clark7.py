# Euler's problem 10 - Prime Sums

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
    primes = sieve(1000000)
    sum = 0
    primeCounter = 0
    for i in range(2, len(primes)):
        if (primes[i]):
            primeCounter+=1
        if(primes[i] and primeCounter == 10001):
            print(i)
            break
        

if __name__ == "__main__":
    main()