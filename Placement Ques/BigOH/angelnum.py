import re

phone = "12344456789"
meaning = {
    "111": "Meaning of 111",
    "222": "Meaning of 222",
    "333": "Meaning of 333",
    "444": "Meaning of 444",
    "555": "Meaning of 555",
    "666": "Meaning of 666",
    "777": "Meaning of 777",
    "888": "Meaning of 888",
    "999": "Meaning of 999",
}

result = re.search(r"(\d)\1{2}", phone)
angelnum = str(result.group())
print(f"Angelnum: {angelnum} \nMeaning: {meaning[angelnum]}")
