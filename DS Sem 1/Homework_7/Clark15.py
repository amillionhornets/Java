
def checkPaths(gridSize, movement, steps, paths):
    # Checks to see a path was found    
    if(steps == gridSize*2):
        return paths + 1
    if(movement < gridSize):
        return checkPaths(gridSize, movement + 1, steps + 1, paths)
    if(movement > gridSize*-1):
        return checkPaths(gridSize, movement - 1, steps + 1, paths)

    #return checkPaths(gridSize, direction, movement, steps + 1)
    

def main():
    gridSize = 2
    down = -1
    right = 1
    #totalPaths = checkPaths(gridSize, -1, down, 0) + checkPaths(gridSize, 1, right, 0)
    totalPaths = checkPaths(gridSize, 0, 0, 0)
    print(totalPaths)
    


if __name__ == "__main__":
    main()