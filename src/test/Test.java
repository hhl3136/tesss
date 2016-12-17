package test;

public class Test {
	public static int getChar(String text){  
		int n=0;
		int index=0;
        for(int i=0;i<text.length();i++){
        	char c = text.charAt(i);
        	for(int j=0;j<text.length();j++){
        		char cc = text.charAt(j);
        		if(c==cc){
        			n++;
        		}
        	}
        	if(n==1){
        		index=i;
        		break;
        	}
        	n=0;
        }
        if(n==0){
        	return 0;
        }
		return index+1;
    }  
	
    public static void main(String[] args){  
        System.out.println(getChar("teetegdfgf"));  
        System.out.println(getChar("leetddgrw"));
        System.out.println(getChar("teeteet"));
    } 
}
