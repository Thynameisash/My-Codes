s = "GEEKS FOR GEEKS PLATFORM !!"
rev = []
a = s.split(" ")
for i in range(len(s) - 1, -1, -1):
    rev.insert(0, s[i])

print("".join(rev))
