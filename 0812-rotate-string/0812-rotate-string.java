class Solution {
    public boolean rotateString(String s1, String goal) {
        StringBuilder temp = new StringBuilder(s1);
    
    for(int i=0;i<s1.length();i++){
        temp.deleteCharAt(0);
        temp.append(s1.charAt(i));
        if(temp.toString().equals(goal)){
            return true;
        }
    }
    return false;
    }
}