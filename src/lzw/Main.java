package lzw;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //ABAABABBAABAABAAAABABBBBBBBB
        List<String> list=new ArrayList<String>();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for(int i=0;i<=127;i++){
            String result = Character.toString(i) ;
            list.add(result);
        }
        //System.out.println(list);
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        //List<Integer> decoded=new ArrayList<Integer>();
        for(int i=0;i<str.length();i++){ // aaabba
            if(list.contains(str.substring(i,i+1))){
                String s = "";
                int j=i;
                int temp = j;
                while(j<str.length()&&list.contains(str.substring(temp,j+1))){
                    s+=str.substring(j,j+1);
                    j++;
                }
                if(s.length()>1){
                    i+=s.length()-1;
                }
                mylist.add(list.indexOf(s));
                if(j+1<str.length()){
                    s+=str.substring(j,j+1);
                    list.add(s);
                }
            }
        }
        System.out.println(mylist);
    }



}