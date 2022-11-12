import java.io.*;

class Urlify {
	public static void main (String[] args) {
	    String str = "   ";
	    int n= 1;
	    String s = new String(urlify(str.toCharArray(), n));
	    System.out.println(s);
	    
	}
	
	public static char[] urlify(char[] ch, int n){
	    int r = ch.length-1;
	    int l = n-1;
	    
	    while(r >= 0){
	        if(ch[l] == ' '){
	                ch[r--] = '0';
	                ch[r--] = '2';
	                ch[r--] = '%';
	            l--;
	        }else{
	            ch[r--] = ch[l--];
	        }
	    }
	    return ch;
	}
}