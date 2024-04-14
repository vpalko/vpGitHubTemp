#4


# The athletic department needs your help to create a program that calculates the number of days 
# required for an athlete to reach the required distance for a jogging event.  
# The athlete increases their distance each day by 10% from the previous day. 
# The program should ask the athlete to enter their starting daily distance 
# (e.g  the first day they run 5 miles) and the number of miles they must be able to run 
# by the day of the event( e.g., 26 miles - a marathon!).

# create a function that takes in the starting daily distance and the end distance goal 
# the function should return the number of days an athlete needs to reach their goal. 
# Verify that the function works as intended by adding statements that include asking the user 
# to enter their starting daily distance, end goal and a call to this function.

# For example, if the user enters 5 as their initial distance, and 26 for their goal the program should display 18

def calculate_days(startingDistance, distanceGoal):
    if startingDistance < 0:
        return 0
    elif distanceGoal < 0:
        return 0
    elif distanceGoal <= startingDistance:
        return 0
    else:
        totalDays = 0
        totalMiles = 0
        dayDistance = startingDistance
        while True:
            totalMiles = totalMiles + dayDistance
            totalDays = totalDays + 1
            if (totalMiles > distanceGoal):
                break
            else:
                dayDistance = dayDistance + startingDistance/10
                # print("total miles done: ", totalMiles, "next day distance: ", dayDistance)
            
    return totalDays
    
s = int(input("Please enter starting distance:"))
g = int(input("Please enter distance goal:"))

print("Total days: ", calculate_days(s, g))
