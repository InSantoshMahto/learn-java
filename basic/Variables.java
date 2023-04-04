package basic;

class Variables {
  public static void main(String[] args) {
    System.out.println("Learn Variable in Java");
    // integer
    int speedLimit = 80;
    System.out.println(speedLimit);
    System.out.println("Change speed limit");
    speedLimit = 99;
    System.out.println(speedLimit);

    // binary
    int myBinary = 0b10010; // 0b represent binary
    System.out.println(myBinary);

    // octal
    int myOctal = 027; // 0 represent octal
    System.out.println(myOctal);

    // decimal
    int myDecimal = 34; // by default
    System.out.println(myDecimal);

    // hexadecimal
    int myHexaDecimal = 0x2F; // 0x represents hexadecimal
    System.out.println(myHexaDecimal);

    // double
    double myDouble = 3.4;
    System.out.println(myDouble);

    // float
    float myFloat = 2.5f;
    System.out.println(myFloat);

    // character
    char myChar = 'F';
    System.out.println(myChar);

    // boolean
    boolean flag = true;
    System.out.println(flag);

    // string
    String lang = "Java Programming";
    String name = "InSantoshMahto";
    System.out.println(lang + " By " + name);

    // More on number
    byte myByte = 127; // byte range are -128 to 127
    System.out.println(myByte);
    short myShort = -32768; // short range are -32,768 to 32,767
    System.out.println(myShort);
    short myInt = -32768; // int range are -2^31 to -2^31 - 1
    System.out.println(myInt);
    long myLong = 99L; // long range are -2^63 to -2^63 - 1
    System.out.println(myLong);
  }
}
