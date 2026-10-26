// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer>map=new HashMap<>();
//         for(int i=0;i<magazine.length();i++){
//         char c=magazine.charAt(i);
//         map.put(c,map.getOrDefault(c,0)+1);
//     }
//         int co=0;

//         for(int i=0;i<ransomNote.length();i++){
//             char r=ransomNote.charAt(i);
//             if(map.containsKey(r)&& map.get(r) > 0){
//                 map.put(r,map.get(r)-1);
//                 co++;
//             }
//         }
//         if(co==ransomNote.length())
//         return true;
//         else
//         return false;

//     }
// }


import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Quick check: If ransomNote is longer than magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        // 1. Count character frequencies in the magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // 2. Match and consume characters for the ransomNote
        for (char r : ransomNote.toCharArray()) {
            int count = map.getOrDefault(r, 0);
            
            // Fail Fast: If the letter doesn't exist or is out of stock, stop immediately
            if (count == 0) {
                return false;
            }
            
            // Decrement the count in the map
            map.put(r, count - 1);
        }
        
        // If we successfully matched every character without hitting 0, it's valid
        return true; 
    }
}
