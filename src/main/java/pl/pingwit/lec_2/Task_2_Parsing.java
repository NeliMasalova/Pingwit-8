package pl.pingwit.lec_2;

public class Task_2_Parsing {
    public static void main(String[] args) {
        String myByteString = "77";
        Byte myParsedByte = Byte.parseByte(myByteString);
        System.out.println(myParsedByte);
        System.out.println(myParsedByte + 6);

        String myShortString = "12587";
        Short myParsedShort = Short.parseShort(myShortString);
        System.out.println(myParsedShort);
        System.out.println(myParsedShort + 6);

        String myIntString = "-78945627";
        Integer myParsedInteger = Integer.parseInt(myIntString);
        System.out.println(myParsedInteger);
        System.out.println(myParsedInteger + 6);

        String myFloatString = "123.6789";
        Float myParsedFloat = Float.parseFloat(myFloatString);
        System.out.println(myParsedFloat);
        System.out.println(myParsedFloat + 6);

        String myDoubleString = "-8965.876655";
        Double myParsedDouble = Double.parseDouble(myDoubleString);

        System.out.println(myParsedDouble);
        System.out.println(myParsedDouble + 6.5);

        String firstString = "789";
        String secondString = "3569";
        System.out.println(firstString + secondString);

        int x = 0;
        x = x + 1;
        x++;

        System.out.println(x);
        x = x + 1;

        System.out.println(x++);

        x = x + 1;
        System.out.println(x);

        System.out.println(++x);
    }
}
