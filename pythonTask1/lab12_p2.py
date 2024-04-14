def squares_less_than_n(n):
    if n < 1:
        print("Parameter value must be greater than 0")
    else:
        i = 1
        answer = ""
        while i**2 < n:
            answer = answer + str(i**2) + " "
            i = i + 1
        return answer


# Verify everything works as intended
value = 50
print(squares_less_than_n(value))  # this should print 1 4 9 16 25 36 49
