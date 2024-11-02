# Euler's problem 2 - Even Fibonacci nums

def main():
    a, b = 0, 1
    currNum = 0
    evenNumSum = 0
    while currNum < 4000000:
        a, b = b, a + b
        if b > 4000000:
            break
        if b%2 == 0:
            evenNumSum = evenNumSum + b
    print(evenNumSum)


if __name__ == "__main__":
    main()