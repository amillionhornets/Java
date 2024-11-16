# Euler's problem 116 - Red, Green or Blue Tiles
    
def findRedTiles(greyTiles, patterns, curr):
    if curr >= len(greyTiles):
        if checkTiles(greyTiles):
            patterns.append(greyTiles[:])
        return patterns
    if curr + 1 < len(greyTiles) and greyTiles[curr] == 0 and greyTiles[curr + 1] == 0:
        greyTiles[curr] = 1
        greyTiles[curr + 1] = 1
        findRedTiles(greyTiles, patterns, curr + 2)

        greyTiles[curr] = 0
        greyTiles[curr + 1] = 0
    findRedTiles(greyTiles, patterns, curr+1)
    return patterns

    
def checkTiles(greyTiles):
    redCount = 0
    for i in range(len(greyTiles) - 1):
        if(greyTiles[i] == 1 and greyTiles[i + 1] == 1):
            redCount+=1
    return(redCount >= 2)

def main():
    greys = [0,0,0,0,0]
    patterns = []
    print(len(findRedTiles(greys, patterns, 0)))



if __name__ == "__main__":
    main()