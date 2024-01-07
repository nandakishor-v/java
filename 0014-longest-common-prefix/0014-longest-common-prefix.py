class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""  # Return an empty string for empty input

        min_len = len(strs[0])

        for i in range(1, len(strs)):
            min_len = min(min_len, len(strs[i]))

        result = ""

        for i in range(min_len):
            current_char = strs[0][i]
            if all(string[i] == current_char for string in strs):
                result += current_char
            else:
                break

        return result
