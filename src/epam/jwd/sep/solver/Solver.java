package epam.jwd.sep.solver;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public enum Solver {
    GENERAL;

    public boolean solveFirst()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int num = sc.nextInt();
        int []arr = new int[4];
        int temp;
        int reduce = num;
        for (int i = 0; i < 4; i++) {
            temp = reduce%10;
            arr[i]=temp;
            reduce=reduce/10;
        }
        return (arr[0]+arr[1])==(arr[2]+arr[3]);
    }

    public double solveSecond()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, then b, then c");
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        double result=(b+Math.pow((b*b)+4*a*c, 0.5))/(2*a);
        result = result - (a*a*a*c) + (1/(b*b));
        return result;
    }

    public void solveThird()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, then b");
        double a=sc.nextDouble(), b=sc.nextDouble();
        double c = Math.pow(a*a+b*b, 0.5);
        System.out.println("Perimeter = " + (a+b+c)+"\nSquare = " + (a*b*0.5));
    }
    public boolean solveFourth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x, then y");
        double x=sc.nextDouble(), y=sc.nextDouble();
        if(x> 4.0 || x< (-4.0)) { return false; }
        if(y> 4.0 || y< -3.0) { return false; }
        if(x< 4.0 && x > -4.0 && y >= -3.0 && y <= 0) { return true;}
        if(x > -2.0 && x < 2.0 && y >=0 && y<= 4) { return true; }
        return false;
    }
    public void solveFifth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, then b, then c");
        double[] a = new double[3];
        a[0]=sc.nextDouble(); a[1]=sc.nextDouble(); a[2]=sc.nextDouble();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0) {a[i] = Math.pow(a[i], 2);}
            else{a[i] = Math.pow(a[i], 4);}
        }
        System.out.println("res = \n");
        for (double v : a) {
            System.out.println(v + ", ");
        }
    }
    public double solveSix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, then b, then c");
        double[] a = new double[3];
        a[0]=sc.nextDouble(); a[1]=sc.nextDouble(); a[2]=sc.nextDouble();
        double min = a[0], max = a[0];
        for (double v : a) {
            if (v >= max) {
                max = v;
            }
            if (v <= min) {
                min = v;
            }
        }
        return max+min;
    }
    public void solveSeventh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, then b, then h");
        double a=sc.nextDouble(), b=sc.nextDouble(), h=sc.nextDouble();
        LinkedList<Double> f =  new LinkedList<>();
        double temp=a;
        while(temp<=b)
        {
            f.addLast((Math.sin(temp)*Math.sin(temp)) - Math.cos(2*temp));
            temp = temp + h;
        }
        temp = a;
        f.addLast((Math.sin(b)*Math.sin(b)) - Math.cos(b));
        for (int i = 0; i < f.size()-1; i++) {
            System.out.println("("+temp+", " + f.get(i)+")\n");
        }
        System.out.println("("+b+", " + f.getLast()+")\n");
    }
    public int solveEight()
    {
        System.out.println("Enter number of numbers");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter k");
        int k = sc.nextInt();
        int n =sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+ (i+1) + " number");
            a[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <a.length; i++) {
            if(a[i]%k==0)
            {
                sum=sum+a[i];
            }
        }
        return sum;
    }

    public void solveNine()
    {
        System.out.println("Enter number of numbers");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+ (i+1) + " number");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of numbers");
        int n1 =sc.nextInt();
        int []a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter "+ (i+1) + " number");
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        int []res = new int[n+n1];
        for (int i = 0; i < k; i++) {
            res[i]=a[i];
        }
        int b=0;
        for (int i = k; i < k+n1; i++) {
            res[i]=a1[b];
            b++;
        }
        b=k;
        for (int i = k+n1; i < n1+n; i++) {
            res[i]=a[b];
            b++;
        }
        System.out.println("res = ");
        for (int re : res) {
            System.out.println(re + " ,");
        }
    }
    public void solveTen()
    {
        int k =5;
        int a[][] = new int [k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = (int) ((Math.random() * ((9-0)+1)) + 0);
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
