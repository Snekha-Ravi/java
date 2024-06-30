import java.util.Scanner;
public class stringrotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int r=sc.nextInt();
      
        System.out.println(isrotated(s1,s2));
        System.out.println(leftrotated(s1,r));
        System.out.println(rightrotated(s1,r));
        sc.close();

        
    }
    private static String leftrotated(String s1,int r){
        String rotatedstring=s1.substring(r)+s1.substring(0,r);
        return rotatedstring;

    }
    private static String rightrotated(String s1,int r){
        int l=s1.length();
        String rotatedstring=s1.substring(l-r)+s1.substring(0,l-r);
        return rotatedstring;

    }
    private static boolean isrotated(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3=s1+s1;
        if(s3.contains(s2)){
            return true;
        }
        return false;
    }   

}
