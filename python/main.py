numbers = ["first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
           "tenth", "eleventh", "twelfth"]

itemlist = ["three pigs",
            "two bears",
            "one potato",
            "five pizze",
            "four birds",
            "eleven beds",
            "two balls",
            "one kangaroo",
            "elven parrots",
            "five pitchforks",
            "one cabbage",
            "one carrot"]

for i, num in enumerate(numbers):
    print(f'On the {num} day of xmas, python gave to me: {", ".join(itemlist[:i+1])}')
