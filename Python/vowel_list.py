vowels = ["a", "e", "i", "o", "u"]

word_list = ["alchemizedyyyy", "zebra", "apple", "monkey"]
vowel_list = [' '.join(vowel for vowel in word if vowel in vowels) for word in word_list]
print(vowel_list)


vowel_size = [len(i) for i in vowel_list]
print(vowel_size)


over_list = [i for i in word_list if len(i) >= 10]
print(over_list)

