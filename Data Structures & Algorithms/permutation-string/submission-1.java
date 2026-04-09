class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s11=s1.toCharArray();
        Arrays.sort(s11);
        String sorteds1=new String(s11);
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
             char[] c=s2.substring(i,j+1).toCharArray();
             Arrays.sort(c);
             String s22=new String(c);
             if(s22.equals(sorteds1))return true;
            }
            
        }
        return false;
    }
}
