# Euler's problem 39 - Integer Right Triangles
import math

def main():
    triangles = 0
    maxP = 0
    for p in range(1, 1000):
        for a in range(1, 1000):           
            for b in range(a, 1000):      
                cSqrd = math.pow(a,2) + math.pow(b,2)
                c = math.floor(math.sqrt(cSqrd))
                if(math.pow(c,2) == cSqrd and (a + b + c) <= 1000): # check to see if the triangle is an integral right triangle
                    triangles+=1
                    if(a+b+c > maxP):
                        maxP = a + b + c
    print(maxP)

if __name__ == "__main__":
    main()