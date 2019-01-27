public class EGimp{
    public static void main(String[] args) {
        
    
    int x = 10, y = 0;
    while (x > 5)
    {
        y = 3;
        while (y < x )
        {
            y *= 2;
            if (y % x == 1)
            y += x;
            
        }
        x -= 3;
    }
System.out.println(x + " " + y);
}
}