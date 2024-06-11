


# def hello():
#     print('Hello')

# def hi():
#     print('Hi')


def withSmile(func):
    def wrapper():
        print(':)')
        func()
        print(':)')
    return wrapper



# withSmile(hello)()

# --------------------------------------------

# decorator

@withSmile
def hello():
    print('Hello')

hello()

# --------------------------------------------