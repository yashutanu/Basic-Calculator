import java.util.StringTokenizer;
import java.lang.Math;
class Eval_calc
 {  public int split_string(String a)
    {
       StringTokenizer s=new StringTokenizer(a,"+-*/^()",true);
       int l=0;
       int i=0;
       while(s.hasMoreTokens())
       {   s.nextToken();
           l++;
       }
       
      return l;
    }
    public String [] fn(String a)
    {   int s=split_string(a);
        String []n=new String[s];
        int i=0;
        StringTokenizer d=new StringTokenizer(a,"+-*/^()",true);
        while(d.hasMoreTokens())
        {
           n[i]=d.nextToken();
           i++;
        }
        
        return n ;      
    }
    public String[] convert(String input[])
    {
     int n=input.length;
     StackString s=new StackString(n);
     String []postfix=new String[n];
     s.push("#");
     int j=0;
     for(int i=0;i<n;++i)
     {
       String sym=input[i];
       while(stackPre(s.peek())>inputPre(sym))
       {  postfix[j]=s.pop();
          j++;
       }
       if(stackPre(s.peek())!=inputPre(sym))
          s.push(sym);
       else
          s.pop();
     }
     while(s.peek()!="#")
     {  postfix[j]=s.pop();
        j++;
     }
    return postfix;
   } 
   public boolean isNumber(String str) {
    try {
        double d = Double.parseDouble(str); 
    } catch (Exception e) {
        return false;
    }
    return true;
   }

   //stack precedence

   public int stackPre(String ch)
   {
    switch(ch)
    {
       case "+":
       case "-":return 2;
       case "*":
       case "/":return 4;
       case "^":return 6;
       case "(":return 0;
       case "#":return -1;
       default :return 8;
     }
   }

   //input precedence
   public int inputPre(String ch)
   {
    switch(ch)
    {
       case "+":
       case "-":return 1;
       case "*":
       case "/":return 3;
       case "^":return 5;
       case "(":return 9;
       case ")":return 0;
       default :return 7;
     }
   }

   public double eval(String e[])
   {  int l=e.length;
      double res=0;
      StackInteger r=new StackInteger(l);
      for(int i=0;i<l;i++)    
      { if(e[i]!=null)
        {
        if(isNumber(e[i]))
        {
          double num = Double.parseDouble(""+e[i]);
          r.push(num);
        }
        else
        {
         double x=r.pop();
         double y=r.pop();
         switch(e[i])
         {
           case "+" :res=x+y;
                     break; 
           case "-":res=y-x;
                    break;
           case "*":res=x*y;
                    break;
           case "/":res=y/x;
                    break;
           case "^":res=Math.pow(y,x);
         }
          r.push(res);
        }
      }
     }
      double result=r.pop();
      return(result);
    }
 
 }
