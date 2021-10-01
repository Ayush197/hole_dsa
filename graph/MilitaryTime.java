import java.util.Scanner;

class MilitaryTime
{
    String TimeConversion(String st)
    {
        int len=st.length();
        String getMeridian=st.substring(len-2);
        String hour=st.substring(0, 2);
        if(hour.charAt(0)=='0')
        hour.substring(1);
        int getHour=Integer.valueOf(hour);
        //System.out.println(getMeridian);
        if(hour.equals("12"))
        {
            if(getMeridian.equals("PM"))
               st= st.substring(0,len-2);
            else
              st= st.replace(hour,"00");
               st= st.substring(0,len-2);

               // System.out.println("zazaz");
            return st;
        }
        if(getMeridian.equals("PM"))
        {
            getHour+=12;
            String temp=String.valueOf(getHour);
            st=st.replace(hour,getHour<10?'0'+temp:temp);


         //12:05:45PM

        }
        st=st.substring(0,len-2);
        return st;

    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        String st=au.next();
        //System.out.println(st);
        MilitaryTime ob=new MilitaryTime();

        String res=ob.TimeConversion(st);
        System.out.println(res);
    }
}