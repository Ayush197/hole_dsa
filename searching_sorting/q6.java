class q6
{
    static double sqr(double x)
    {
        return((x)*(x));
    }
    static int eps= (int)(1e-6)+1,n=5;

    static class point
    {
        int x,y;
        point()
        {}
        public point(int x,int y )
        {
            this.x=x;
            this.y=y;
        }
    };
    static class line
    {
        int a,b,c;
        
        public line(int a,int b,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
    };
    static double dist(double x,double y,point p)
    {
        return Math.sqrt(sqr(x-p.x)+sqr(y-p.y));

    }
    
    static double compute(point p[],int n, line l,double x)
    {
        double res=0;
        double y=-1*(l.c+l.a*x)/l.b;
        
        for(int i=0;i<n;i++)
        res+=dist(x,y,p[i]);

        return res;

    }
    static double opt(point p[],int n, line l)
    {
        double s=-1e6,q=1e6;

        while(q-s>eps)
        {
            double mid1=s+(q-s)/3,mid2=q-(q-s)/3;

            double dist1=compute(p, n, l, mid1),dist2=compute(p, n, l, mid2);

            if(dist1<dist2)
            q=mid2;
            else
            s=mid1;
        }

        return compute(p, n, l, (q+s)/2);

    }

    static double findopt(int points[][],line l)
    {
        point  p[]=new point[n];

        for(int i=0;i<n;i++)
        p[i] = new point(points[i][0], 
                         points[i][1]);

        return opt(p, n, l);             

    }
    public static void main(String[] args) {
    
        line l = new line(1, -1, -3);
    int points[][] = {{-3, -2}, {-1, 0}, {-1, 2},
                                 {1, 2}, {3, 4}};
    System.out.println(findopt(points, l));
    }
    
    
}