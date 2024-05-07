package learning;

public class Four {
    static int a, b;
    public Four(int x, int y)
    {
        a = x;
        b = y;

    }
        protected void add()
        {
            int add = 0;
            add = a + b;
            System.out.println("Result of Addition is : " + add);
        }
        public void sub()
        {
            int sub = 0;
            sub = a - b;
            System.out.println("Result of Subtraction is : " + sub);
        }
        public void mul()
        {
            int mul = 0;
            mul = a * b;
            System.out.println("Result of Multiplication is : " + mul);
        }
        public void div()
        {
            int div = 0;
            div = a / b;
            System.out.println("Result of Division is : " + div);
        }
    }