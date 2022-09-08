# Python 3 program to find number of
# closing brackets needed and complete
# a regular bracket sequence

# Function to find number of closing
# brackets and complete a regular
# bracket sequence
def completeSequence(s):

    # Finding the length of sequence
    n = len(s)

    open = 0
    close = 0

    for i in range(n):

        # Counting opening brackets
        if s[i] == "(":
            open += 1
        else:

            # Counting closing brackets
            close += 1

        # Checking if at any position the
        # number of closing bracket
        # is more then answer is impossible
        if close > open:
            print("IMPOSSIBLE")
            return

    # If possible, print 's' and
    # required closing brackets.
    print(s, end="")
    for i in range(open - close):
        print(")", end="")


# Driver code
if __name__ == "__main__":

    s = "))"
    completeSequence(s)

# This code is contributed by ita_c
