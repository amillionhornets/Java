# Euler's problem 6 - sum square diff
# ANS: 25164150
import math
def sumOfSquare(n):
    sum = 0
    for i in range(n+1):
        sum += i*i
    return sum

def squareOfSum(n):
    sum = 0
    for i in range(n+1):
        sum+=i
    sum = math.pow(sum, 2)
    return sum


def main():
    sumSqr = sumOfSquare(100)
    sqrSum = squareOfSum(100)
    print(sqrSum - sumSqr)


if __name__ == "__main__":
    main()