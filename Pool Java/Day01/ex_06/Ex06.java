public class Ex06 {
    // public static void main(String[] args) {
    //     Ex06.sequence(0);
    //     Ex06.sequence(20);
    // }

    public static void sequence(int nbr) {
        if(nbr<0)return;
        
        String line = "1";
        System.out.println(line);
        
        if(nbr==0)return;
        
        for(int i=1; i <= nbr; i++) {
            line = nextLine(line);
            System.out.println(line);
        }
    }

    // public static long nextNumber(long number) {		
	// 	long newNumber=0;
    //     long multiplier = 1;
        
	// 	while(number> 0) 
	// 	{	
    //         long digit=number%10;
    //         int count=0;
            
	// 		while(digit==number%10){
	// 			digit = number%10;
	// 			number = number/10;
	// 			count++;
    //         }
            
	// 		newNumber=newNumber+(count*10+digit)*multiplier;
	// 		multiplier*=100;
	// 	}
	// 	return newNumber;
    // }

    public static String nextLine(String str){
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            String count = "1";
            if ((i+1) < str.length()){
                if(ch[i] == ch[i+1]){
                    count = "2";
                    i++;
                    if ((i+1) < str.length()){
                        if (ch[i] == ch[i+1]){
                            count = "3";
                            i++;
                        }
                    }
                }
            }
            str2 += count+String.valueOf(ch[i]);
        }
        
        return str2;
    }
}
