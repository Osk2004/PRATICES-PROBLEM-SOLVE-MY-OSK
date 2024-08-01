import java.util.ArrayList;

public class Array {
    public static void reverse(ArrayList<Integer> list,int start,int end){
        //Question:-REVERSE ARRAYLIST
        while (start<end){
            int temp= list.get (start);
            list.set (start, list.get (end)  );
            list.set ( end,temp );
            start++;
            end--;
        }

    }
    public static void rotate(ArrayList<Integer>list,int k){
        //ROTATE ARRAY AT K POSITION
        k%= list.size ();

        reverse ( list,0,list.size ()-1 );
        reverse ( list,0,k-1 );
        reverse ( list, k, list.size ()-1 );

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<> ();
       list.add ( 1 );
       list.add ( 2 );
       list.add ( 3 );
       list.add ( 4 );
       list.add ( 5 );
        System.out.println (list);
      rotate ( list,51 );
        System.out.println (list);
    }
}
