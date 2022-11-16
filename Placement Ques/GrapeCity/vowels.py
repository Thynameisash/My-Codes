def check(str):
    counter = {}
    vowels = [" ", "a", "e", "i", "o", "u"]
    for i in str:
        if i not in vowels:
            if i in counter:
                counter[i] += 1
            else:
                counter[i] = 1
    print(counter)


check("hello world")
