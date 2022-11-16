import datetime


def greet(bot_name, birth_year):
    print("Hello! My name is {0}.".format(bot_name))
    print("I was created in {0}.".format(birth_year))


def remind_name():
    print("Please, remind me your name.")
    name = input()
    print("What a great name you have, {0}!".format(name))


def guess_age():
    print("Let me guess your age.")
    print("Enter remainders of your age when divided by 3, 5 and 7 respectively.")

    rem3 = int(input())
    rem5 = int(input())
    rem7 = int(input())
    age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    print("Your age is {0}; that's a good time to start programming!".format(age))


def count():
    print("I can also count till any number you want. Enter number : ")
    num = int(input())

    counter = 0
    while counter <= num:
        print("{0} !".format(counter))
        counter += 1


def cmd():
    print("Ask me something : ")
    req = input()
    if "how" and "you" in req:
        print("I'm Fine, Thank you.")
    elif "time" in req:
        print(datetime.datetime.now())
    elif "what" in req:
        print("I don't know what it is.")
    else:
        print("Having problems to connect to servers, pls try again later.")

    print("__________________________________")


def end():
    print("Have a nice day!")
    print("__________________________________")


greet("Alexa", "2022")
remind_name()
guess_age()
cmd()
count()
end()
