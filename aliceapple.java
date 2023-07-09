import java.util.*;

class aliceApple {
    static int minApples(int M,int K,int N,int S,int W,int E)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired color of apple to pick from: ");
        String x = sc.nextLine();
        String s[] ={"Red","Green"};
        if (x.equals(s[0])){
            if(M<=S*K){
                return M;
            }

            else if(M<=S*K+E+W){
                return S*K +(M-S*K)*K;
            }
            else return -1;
        }
        else if(x.equals(s[1])){
            if(M<=N*K){return M;}

            else if(M<=N*K+E+W){return N*K +(M-N*K)*K;}
            else return -1;
        }
        else{
            return -1;
        }
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("M: ");
        int M = s.nextInt();
        System.out.println("K: ");
        int K = s.nextInt();
        System.out.println("N: ");
        int N = s.nextInt();
        System.out.println("S: ");
        int S = s.nextInt();
        System.out.println("W: ");
        int W = s.nextInt();
        System.out.println("E: ");
        int E = s.nextInt();
        System.out.println(minApples(M,K,N,S,W,E));
    }
}