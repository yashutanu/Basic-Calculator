class StackInteger
{
  private double[] s;
  private int top;
  private int size;

  public StackInteger(int sz)
  {
    s=new double[sz];
    size=sz;
    top=-1;
  }

  public void push(double x)
  {
    if(top == size-1)
        System.out.println("Stack full");
     else
       {
          top++;
          s[top]=x;
       }
    }


   public double pop()
   {
     double x=-1;
     if(top==-1)
         System.out.println("Stack empty");
      else
       {
         x=s[top];                  
         top--;
       }    
     return(x);
   }
   
    public void display()
    {
      int i;
     for(i=top;i>=0;i--)
       System.out.print(s[i]);
    }
}
     
