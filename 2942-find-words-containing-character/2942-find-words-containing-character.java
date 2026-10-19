class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>r=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int j=0;
            while(j<words[i].length()){
                if(words[i].charAt(j)== x){
                r.add(i);
                break;
            }
             j++;
            }
           
        }
        return r;
    }
}