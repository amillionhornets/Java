# Euler's problem 4 - sum square diff
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
    # print(sumSqr)
    # print(sqrSum)


if __name__ == "__main__":
    main()