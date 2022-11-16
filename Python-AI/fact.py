dp = {}

def fact(n):
    if n in dp:
        return dp[n]
    elif n == 0:
        return 1
    else:
        x = fact(n - 1) * n
        dp[n] = x
        return x

print(fact(5))
