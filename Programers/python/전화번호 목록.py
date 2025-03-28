phone_book = ["123","456","789"]

def solution(phone_book):
    number = {}
    for phone in phone_book:
        number[phone] = 1

    for phone in phone_book:
        temp = ""
        for num in phone:
            temp += num
            if temp in number and temp != phone:
                return False
    return True

print(solution(phone_book))