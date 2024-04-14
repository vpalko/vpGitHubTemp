def calculate_days(startingDistance, distanceGoal):
    if startingDistance < 0:
        return 0
    elif distanceGoal < 0:
        return 0
    elif distanceGoal <= startingDistance:
        return 0
    else:
        totalDays = 0
        totalMiles = startingDistance
        while True:
            if (totalMiles <= distanceGoal):
                totalDays = totalDays + 1
                totalMiles = totalMiles + totalMiles/10
            else:
                break

    return totalDays
    
s = int(input("Please enter starting distance:"))
g = int(input("Please enter distance goal:"))

print(calculate_days(s, g))