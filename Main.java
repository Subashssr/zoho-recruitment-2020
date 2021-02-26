import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char ch[] = str.toCharArray();
        int m = ch.length/2;
        int blankSpace = ch.length ;
        String pr ="";

        for(int ii = m; ii < ch.length; ii++){
            System.out.println("");
            int bs = blankSpace-1;
            while(bs-- >0){
                System.out.print(" ");
            }
            pr += ch[ii];
            System.out.print(pr);
            blankSpace--;

        }
        for(int ii = 0; ii < m; ii++){
            System.out.println("");
            int bs = blankSpace - 1;
            while(bs-- >0)
                System.out.print(" ");
            pr += ch[ii];
            System.out.print(pr);
            blankSpace--;

        }
    }
}
