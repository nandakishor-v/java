class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        if divisor == 0:
            return INT_MAX if dividend > 0 else INT_MIN

        absdivisor = abs(divisor)
        absdividend = abs(dividend)

        if absdividend == INT_MIN and absdivisor == 1:
            return INT_MAX if dividend > 0 else INT_MIN

        result = absdividend // absdivisor

        if dividend < 0 and divisor > 0 or divisor < 0 and dividend > 0:
            return -result
        elif result > INT_MAX:
            return INT_MAX
        elif result < INT_MIN:
            return INT_MIN
        else:
            return result
