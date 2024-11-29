# Euler's problem 5 - Smallest Multiple

def main():
    i = 2
    process = True
    while process:
        i+=1
        tests = []
        for j in range(1, 21):
            if(i%j != 0):
                tests.append(False)
                break
            tests.append(True)
        if(False not in tests):
            print(i)
            break
            


if __name__ == "__main__":
    main()