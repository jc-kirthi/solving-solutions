'''class Solution(object):
    def romanToInt(self, s):
        roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        result = 0
        for i in range(len(s)):
            value = roman[s[i]]
            if i + 1 < len(s) and value < roman[s[i + 1]]:
                result -= value
            else:
                result += value
        return result
 '''
class Solution(object):
  def romanToInt(self, s):
    roman = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }

    result = 0
    prev_value = 0

    # iterate from right to left
    for ch in reversed(s):
        value = roman[ch]
        if value < prev_value:
            result -= value
        else:
            result += value
        prev_value = value

    return result

