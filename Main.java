public class Main{
    public static void main(String[] args) {
        String str1 = "WELCOME";
        String str2 = "WATER";
        soln(str1);
        soln(str2);

    }
    public static void soln(String str){
        System.out.println("Input:" + str);
        System.out.println("Output:");
        int index  = str.length();
        for(int i =0; i < str.length(); i++){
            index  = str.length()/2;
            for(int j =0; j < str.length(); j++){
                if((str.length() - 1) - i <= j){
                    if(index > str.length() - 1){
                        index =0;
                    }
                    System.out.print(str.charAt(index)+" ");
                    index = index+1;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
