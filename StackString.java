class StackString
{
   String [] s;
   int top;
   
   public StackString(int sz)
   {
     s= new String[sz];
     top=-1;
   }
  
   public void push(String x)
   {
     s[++top]=x;
   } 
  
   public String pop()
   {
    String x;
    x=s[top--];
    return x;
   }

   public String peek()
   {
      return s[top];
    }
}
