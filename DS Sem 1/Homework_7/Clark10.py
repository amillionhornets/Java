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
    primes = sieve(2000000)
    sum = 0
    for i in range(2, len(primes)):
        if(primes[i]):
            sum+=i
    print(sum)

if __name__ == "__main__":
    main()