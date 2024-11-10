# Euler's problem 39 - Integer Right Triangles
import math

def main():
    triangles = 0
    maxP = 0
    p = 120
    for a in range(1, 1000): 
        triangles = 0          
        for b in range(1, 1000):      
            cSqrd = math.pow(a,2) + math.pow(b,2)
            c = math.floor(math.sqrt(cSqrd))
            peri = a + b + c
            if(c**2 == cSqrd): # check to see if the triangle is an integral right triangle
                triangles = triangles + 1
    print(triangles)
4
if __name__ == "__main__":
    main()