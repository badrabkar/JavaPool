package Module00.ex00;

public class Program {
    public void main(String[] args)
    {
        int number = 479598;
        int sum = 0;
        String numberString = String.valueOf(number);
        if (numberString.length() != 6)
        {
            System.out.println("The number must of length 6");
            return;   
        }
        for (int i = 0; i <= 6; i++)
        {
            sum += number / (int)Math.pow(10, 6 - i);
            number = number - (number / (int)Math.pow(10, 6 - i)) * (int)Math.pow(10, 6 - i);
        }
        System.out.println(sum);
    }
}
