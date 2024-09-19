# Euler's problemb 16 project digit sum
import math

def sum(num):
    summation = 0
    for elements in num:
        summation+=int(elements)
    return summation

def splitNum(powNum):
    toStringNum = str(powNum)
    temp = []
    for i in range(0, len(toStringNum)):
        temp.append(toStringNum[i])
    return temp

def main():
    num = 2
    power = 1000
    toPowerNum = int(math.pow(num, power))
    splitPowerNum = splitNum(toPowerNum)
    print(sum(splitPowerNum))



if __name__ == "__main__":
    main()