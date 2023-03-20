import java.util.Scanner;

class Calculate_str
{
    int i = 0, count = 0;

    public void readStr()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("\nNo.of Characters in Given String is \t\t: " + calculateChar(str));
        System.out.println("\nNo.of Vowels in Given String is \t\t: " + calculateVowels(str));
        System.out.println("\nNo.of Consonants in Given String is \t\t: " + calculateConsonants(str));
        System.out.println("\nNo.of Special Characters in Given String is \t: " + calculateSpChar(str));
        System.out.println("\nNo.of Words in Given String is \t\t\t: " + calculateWords(str));
        System.out.println("\nNo.of Sentences in Given String is \t\t: " + calculateSentences(str));

        sc.close();
    }

    public int calculateChar(String str)
    {
        char[] ch = str.toCharArray();
        count = 0;

        for ( i = 0; i < ch.length; i++ )
        {
            if ( ((((int) ch[i]) >= 65) && (((int) ch[i]) <= 90)) || ((((int) ch[i]) >= 97) && (((int) ch[i]) <= 122)) )
            {
                count++;
            }
        }

        return count;
    }

    public int calculateVowels(String str)
    {
        char[] ch = str.toCharArray();

        count = 0;

        for ( i = 0; i < ch.length; i++ )
        {
            if ( Character.toString(ch[i]).equalsIgnoreCase("A") || Character.toString(ch[i]).equalsIgnoreCase("E") || Character.toString(ch[i]).equalsIgnoreCase("I") || Character.toString(ch[i]).equalsIgnoreCase("O") || Character.toString(ch[i]).equalsIgnoreCase("U") )
            {
                count++;
            }
        }

        return count;
    }

    public int calculateConsonants(String str)
    {
        return (calculateChar(str) - calculateVowels(str));
    }

    public int calculateSpChar(String str)
    {
        char[] ch = str.toCharArray();
        count = 0;

        for ( i = 0; i < ch.length; i++ )
        {
            if ( ((((int) ch[i]) >= 65) && (((int) ch[i]) <= 90)) || ((((int) ch[i]) >= 97) && (((int) ch[i]) <= 122)) )
            {
                continue; 
            }
            else if ( ((int) ch[i]) == 32 )
            {
                continue; 
            }
            else
            {
                count++;
            }
        }

        return count;
    }

    public int calculateWords(String str)
    {
        String[] words = str.split(" ");
        return (words.length);
    }

    public int calculateSentences(String str)
    {
        String[] sentences = str.split(" ");
        return (sentences.length);
    }

    public static void main(String []args)
    {
        Calculate_str cal_str = new Calculate_str();
        cal_str.readStr();
    }
}