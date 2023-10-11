public class Thirty
{
    String password;
    public Thirty(String p)
    {
        password = p;
    }
    public void check()//Turn string in to integers (only changes 1 for now)
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
        System.out.println(sum);
    }
}
