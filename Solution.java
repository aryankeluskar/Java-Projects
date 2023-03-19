class Solution {
    public boolean isValid(String s) {
        
        for(int i=0;i<s.length();i++){
            try{
                String last="";
                if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
                    return false;
                if(s.charAt(i)=='('){
                    last="";
                    if(s.substring(i).indexOf(')') != s.length()-1)
                        last=s.substring(s.substring(i).indexOf(')'));
                    s=s.substring(i,s.substring(i).indexOf(')'))+last;
                    i=0;
                }
                if(s.charAt(i)=='{'){
                    last="";
                    if(s.substring(i).indexOf('}') != s.length()-1)
                        last=s.substring(s.substring(i).indexOf('}'));
                    s=s.substring(i,s.substring(i).indexOf('}'))+last;
                    i=0;
                }
                if(s.charAt(i)=='['){
                    last="";
                    if(s.substring(i).indexOf(']') != s.length()-1)
                        last=s.substring(s.substring(i).indexOf(']'));
                    s=s.substring(i,s.substring(i).indexOf(']'))+last;
                    i=0;
                }
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
}