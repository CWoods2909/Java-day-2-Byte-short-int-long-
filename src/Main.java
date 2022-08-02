public class Main {
    public static void main(String[] args) {
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        The max and min of int data types are in the billions and takes up 32 bytes or memory.
//        System.out.println("Integer minimum value = " + myMinIntValue);
//        System.out.println("Integer maximum value = " + myMaxIntValue);
        /*If you try and add to the max or min you will have an underflow or overflow.  In the case of the max, it will
         have an overflow and will become MIN_Value.  The MIN value has the same type of behavior.*/

//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte min value = " + myMinByteValue);
//        System.out.println("Byte max value = " + myMaxByteValue);
//        The max and min of Bytes are only -128 and 127 and takes 8 bytes of memory
        
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short min value = " + myMinShortValue);
//        System.out.println("Short max value = " + myMaxShortValue);
//        Min and max for Long values are 32767 and takes 16 bytes of memory


//        long myLongValue = 100L;
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long min value = " + myMinLongValue);
//        System.out.println("Long max value = " + myMaxLongValue);
//        Long values take up 64 bytes of memory and takes huge numbers, above a trillion.

//    byte myNewByteValue = (byte) (myMinByteValue / 2);
//    This is casting that value into a byte.
//        System.out.println(myNewByteValue);


//        TEST Primitive types!!!

        byte byteTestVar = 127;
        short shortTestVar = 32767;
        int intTestVar = 3289000;
        long longTestVar = 50000L + 10L * (byteTestVar + shortTestVar + intTestVar );

        System.out.println(longTestVar);
    }
}