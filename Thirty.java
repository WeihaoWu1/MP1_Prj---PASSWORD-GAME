public class Thirty
{
    String password;
    boolean sums;
    public Thirty(String p,boolean s)
    {
        password = p;
        sums = s;
    }
    public boolean t()
    {
        if(sums == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void check()
    {
        int sum = 0;
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n1 =0;n1<password.length();n1++)
            {
                if(password.substring(x,y).equals("1"))
                {
                    sum =sum+1;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n2 =0;n2<password.length();n2++)
            {
                if(password.substring(x,y).equals("2"))
                {
                    sum =sum+2;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n3 =0;n3<password.length();n3++)
            {
                if(password.substring(x,y).equals("3"))
                {
                    sum+=3;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n4 =0;n4<password.length();n4++)
            {
                if(password.substring(x,y).equals("4"))
                {
                    sum =sum+4;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n5 =0;n5<password.length();n5++)
            {
                if(password.substring(x,y).equals("5"))
                {
                    sum =sum+5;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n6 =0;n6<password.length();n6++)
            {
                if(password.substring(x,y).equals("6"))
                {
                    sum =sum+6;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n7 =0;n7<password.length();n7++)
            {
                if(password.substring(x,y).equals("7"))
                {
                    sum =sum+7;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n8 =0;n8<password.length();n8++)
            {
                if(password.substring(x,y).equals("8"))
                {
                    sum =sum+8;
                }
                x++;
                y++;
            }
        }
        for(int i = 0; i<1;i++)
        {
            int x = 0;
            int y=1;
            for(int n9 =0;n9<password.length();n9++)
            {
                if(password.substring(x,y).equals("9"))
                {
                    sum =sum+9;
                }
                x++;
                y++;
            }
        }
        if(sum == 30)
        {
            sums = true;
        }
        else
        {
            sums = false;
        }

    }
}
