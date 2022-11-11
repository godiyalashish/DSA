//If a string contains all unique charaters.

public static boolean isUnique(String str){
	    int  checker = 0;
	    for(int i=0; i<str.length(); i++){
	        int flag =1;
	        int x = str.charAt(i) - 'a';
	        flag = flag << x;
	        if((checker & flag )> 0){
	            return false;
	        }else{
	            checker = checker | flag;
	        }
	    }
	    return true;
	}