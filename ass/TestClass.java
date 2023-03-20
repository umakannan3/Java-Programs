import java.util.*;

class TestClass {
    public static void main(String args[] ){
                
        Scanner s = new Scanner(System.in);

        int sum = 0;

        boolean flagIsNotVowel = false;
        boolean flagIsEven = false;
        String word = s.nextLine();
        System.out.println(word);
         
        List<String> dic = new ArrayList();
         dic.add("A");
         dic.add("E");
         dic.add("I");
         dic.add("O");
         dic.add("U");
         dic.add("Y");
        System.out.println();

        for(int i =0;i<word.length();i++){
            boolean flag = Character.isDigit(word.charAt(i));
	if(flag) {
                sum+=Integer.parseInt(word.charAt(i)+ "");
                flagIsEven  = sum%2==0 ? true : false;
            }
            if(!flag && !dic.contains(word.charAt(i) )){
                 System.out.println(word.charAt(i) +"letter");
                 System.out.println(dic.contains(word.charAt(i)) + "true");
                sum = 0;
                flagIsNotVowel = true;
            } 

            if(!flag && dic.contains(word.charAt(i))){
                 System.out.println(word.charAt(i)+ "ciao da dic");
                sum = 0;
                flagIsNotVowel = false;
            }
        }
      
        if(flagIsEven ==true  &&  flagIsNotVowel == true){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}