# Euler's problem 39 - Integer Right Triangles
import math

def main():
    maxP = 0
    maxTriangles = 0
    trianglesCount = [0] * 1001

    for a in range(1,1000):
        triangles = 0
        for b in range(a, 1000 - a):
            c = math.sqrt((a**2) + (b**2))
            p = a+b+int(c)
            if(c.is_integer() and p <= 1000):
                trianglesCount[p] += 1
    maxP = trianglesCount.index(max(trianglesCount))
    print(maxP)
if __name__ == "__main__":
    main()