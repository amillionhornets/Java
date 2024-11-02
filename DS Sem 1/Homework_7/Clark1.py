# Euler's problem 1- multiples of 3 and 5

def main():
    sum = 0
    for i in range(1000):
        if i%3 == 0:
            sum = sum + i
        elif i%5 == 0:
            sum = sum + i
    print(sum)


if __name__ == "__main__":
    main()