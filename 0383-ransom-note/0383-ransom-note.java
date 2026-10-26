class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
        char c=magazine.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }
        int co=0;

        for(int i=0;i<ransomNote.length();i++){
            char r=ransomNote.charAt(i);
            if(map.containsKey(r)&& map.get(r) > 0){
                map.put(r,map.get(r)-1);
                co++;
            }
        }
        if(co==ransomNote.length())
        return true;
        else
        return false;

    }
}