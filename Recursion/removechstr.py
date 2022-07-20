def removechar(s):
    if 
    for i in s:
        if s == "a":
            return removechar(s[1:])
        else:
            return i + removechar(s[1:])


print(removechar("abbacad"))
