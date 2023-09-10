class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>Roman =new HashMap<Character,Integer>();
        Roman.put('I',1);
        Roman.put('V',5);
        Roman.put('X',10);
        Roman.put('L',50);
        Roman.put('C',100);
        Roman.put('D',500);
        Roman.put('M',1000);
        
        int Result = Roman.get(s.charAt(s.length()-1));
        for(int i =s.length()-2;i>=0;i--){
            if(Roman.get(s.charAt(i)) < Roman.get(s.charAt(i+1))){
                Result = Result-Roman.get(s.charAt(i));
            }
            else {
                Result = Result +Roman.get(s.charAt(i));
            }
        }
        return Result;

    }
}