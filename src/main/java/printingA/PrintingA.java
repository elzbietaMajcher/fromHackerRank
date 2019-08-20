package printingA;

public class PrintingA {


    static long repeatedString(String s, long n) {
        long numberOfA = 0;
        char [] input = s.replaceAll("a", "").toCharArray();
        char [] chars = s.toCharArray();
        long wordLength = s.length();
        long aNumInWord = wordLength - input.length;

        long repeat = n / wordLength;

        long rest = n - (repeat * wordLength);

        long plus = 0;

        for (int i = 0; i < rest ; i++) {
            if (chars[i] == 'a') plus++;
        }

        numberOfA = (aNumInWord * repeat) + plus;


        return numberOfA;
    }
}
