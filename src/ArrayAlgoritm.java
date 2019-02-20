public class ArrayAlgoritm {
    public static int solution(int[] tab) {
        int Sum_Value = 0,sum =0,index =0 ;
        String value ="";

        if( tab == null ) throw  new IllegalArgumentException("Tab is null");
        if( tab.length == 0 ) throw new IllegalArgumentException("Tab is empty");




        for(int a=tab.length-1;a>=0;a--){
            if(tab[a] <0)throw new IllegalArgumentException("Tab has value < 0");

            value += Integer.toString(tab[a]);
            if(value.equals("0")) throw new IllegalArgumentException("As first elemnt is zero");

        }

        Sum_Value = Integer.parseInt(value);
        Sum_Value *=17;

        for(int a=0;a<tab.length;a++){
            sum += Sum_Value%10;
            Sum_Value /= 10;
        }
        sum += Sum_Value;




        return sum;
    }
}
