# Euler's problem 9 - Special Pythagorean Triplet 
import math

def main():
    triangles = 0
    for a in range(1,1000):
        for b in range(a, 1000 - a):
            c = math.sqrt((a**2) + (b**2))
            p = a+b+int(c)
            if(c.is_integer() and p == 1000):
                print(f"{p} == {a*b*c} == {a},{b},{c},")
    
if __name__ == "__main__":
    main()