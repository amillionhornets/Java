# Euler's problem 116 - Red, Green or Blue Tiles
    
def findGreenTiles(greyTiles, patterns, curr):
    if checkTilesGreen(greyTiles) and greyTiles not in patterns:
        patterns.append(greyTiles[:])
    if curr >= len(greyTiles):
        return patterns
    if curr + 2 < len(greyTiles) and greyTiles[curr] == 0 and greyTiles[curr + 1] == 0 and greyTiles[curr + 2] == 0:
        greyTiles[curr] = 1
        greyTiles[curr + 1] = 1
        greyTiles[curr + 2] = 1
        findGreenTiles(greyTiles, patterns, curr + 3)

        greyTiles[curr] = 0
        greyTiles[curr + 1] = 0
        greyTiles[curr + 2] = 0
    findGreenTiles(greyTiles, patterns, curr+1)
    return patterns
    
def findBlueTiles(greyTiles, patterns, curr):
    if checkTilesBlue(greyTiles) and greyTiles not in patterns:
        patterns.append(greyTiles[:])
    if curr >= len(greyTiles):
        return patterns
    if curr + 3 < len(greyTiles) and greyTiles[curr] == 0 and greyTiles[curr + 1] == 0 and greyTiles[curr + 2] == 0 and greyTiles[curr + 3] == 0:
        greyTiles[curr] = 1
        greyTiles[curr + 1] = 1
        greyTiles[curr + 2] = 1
        greyTiles[curr + 3] = 1
        findBlueTiles(greyTiles, patterns, curr + 4)

        greyTiles[curr] = 0
        greyTiles[curr + 1] = 0
        greyTiles[curr + 2] = 0
        greyTiles[curr + 3] = 0
    findBlueTiles(greyTiles, patterns, curr+1)
    return patterns

def findRedTiles(greyTiles, patterns, curr):
    if checkTilesRed(greyTiles) and greyTiles not in patterns:
        patterns.append(greyTiles[:])
    if curr >= len(greyTiles):
        return patterns
    if curr + 1 < len(greyTiles) and greyTiles[curr] == 0 and greyTiles[curr + 1] == 0:
        greyTiles[curr] = 1
        greyTiles[curr + 1] = 1
        findRedTiles(greyTiles, patterns, curr + 2)

        greyTiles[curr] = 0
        greyTiles[curr + 1] = 0
    findRedTiles(greyTiles, patterns, curr+1)
    return patterns

    
def checkTilesRed(greyTiles):
    redCount = 0
    for i in range(len(greyTiles) - 1):
        if(greyTiles[i] == 1 and greyTiles[i + 1] == 1):
            redCount+=1
    return(redCount >= 1)

def checkTilesGreen(greyTiles):
    greenCount = 0
    for i in range(len(greyTiles) - 2):
        if(greyTiles[i] == 1 and greyTiles[i + 1] == 1 and greyTiles[i + 2] == 1):
            greenCount+=1
    return(greenCount >= 1)

def checkTilesBlue(greyTiles):
    blueCount = 0
    for i in range(len(greyTiles) - 3):
        if(greyTiles[i] == 1 and greyTiles[i + 1] == 1 and greyTiles[i + 2] == 1 and greyTiles[i + 3] == 1):
            blueCount+=1
    return(blueCount >= 1)

def main():
    greys = []
    n = 50
    for i in range(n):
        greys.append(0)
    # for pattern in findGreenTiles(greys, patterns, 0):
    #     print(pattern)
    patterns = []
    reds = len(findRedTiles(greys, patterns, 0))
    patterns = []
    greens = len(findGreenTiles(greys, patterns, 0))
    patterns = []
    blues = len(findBlueTiles(greys, patterns, 0))
    print(reds + greens + blues)



if __name__ == "__main__":
    main()