package Recursion.PartyProblem;

// there are N number of people including you  , and all are going to party  , each person have its own bike using which they can go solo
//or only in pair , no. of ways in which they can go
public class LetsParty {
    //Using different way
    public static int differentWays(int n){
        if(n==1 || n==2){
            return n;
        }
        return differentWays(n-1) + (n-1)*differentWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println(k);
        int p=differentWays(5);
        System.out.println(p);
    }
}
