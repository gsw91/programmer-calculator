package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.BinaryException;
import org.junit.*;
import java.math.BigInteger;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;


public class BinarySystemTestsSuite {


    @Test
    public void testTransformBinToHex() {
        //given
        BinarySystem binarySystem = new BinarySystem();
        String actionOne = "0001";
        String actionTwo = "1000";
        String actionThree = "1111011100110001";
        String actionFour = "1010101010101010";
        String actionFive = "1000110011101111";

        String resultOne = "1";
        String resultTwo = "8";
        String resultThree = "F731";
        String resultFour = "AAAA";
        String resultFive = "8CEF";
        //when
        String methodResultOne = binarySystem.toHexadecimal(actionOne);
        String methodResultTwo = binarySystem.toHexadecimal(actionTwo);
        String methodResultThree = binarySystem.toHexadecimal(actionThree);
        String methodResultFour = binarySystem.toHexadecimal(actionFour);
        String  methodResultFive = binarySystem.toHexadecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


    @Test
    public void testTransformBinToOct() {
        //given
        BinarySystem binarySystem = new BinarySystem();
        String actionOne = "0001";
        String actionTwo = "1000";
        String actionThree = "1111011100110001";
        String actionFour = "1010101010101010";
        String actionFive = "1000110011101111";

        BigInteger resultOne = BigInteger.ONE;
        BigInteger resultTwo = BigInteger.valueOf(10);
        BigInteger resultThree = BigInteger.valueOf(173461);
        BigInteger resultFour = BigInteger.valueOf(125252);
        BigInteger resultFive = BigInteger.valueOf(106357);
        //when
        BigInteger methodResultOne = binarySystem.toOctal(actionOne);
        BigInteger methodResultTwo = binarySystem.toOctal(actionTwo);
        BigInteger methodResultThree = binarySystem.toOctal(actionThree);
        BigInteger methodResultFour = binarySystem.toOctal(actionFour);
        BigInteger methodResultFive = binarySystem.toOctal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


    @Test
    public void testFailTransformBinToDec() {
        //given
        BinarySystem binarySystem = new BinarySystem();
        String exception = "111000q101";
        //when&then
        try {
            binarySystem.toDecimal(exception);
            fail("Expected a BinaryException to be thrown");
        } catch (BinaryException e) {
            Assert.assertThat(e.getMessage(), is("Binary number should contain only 1 or 0"));
        }

    }


    @Test
    public void testTransformBinToDec() {
        //given
        BinarySystem binarySystem = new BinarySystem();
        String actionOne = "0001";
        String actionTwo = "1000";
        String actionThree = "1111011100110001";
        String actionFour = "1010101010101010";
        String actionFive = "1000110011101111";

        BigInteger resultOne = BigInteger.ONE;
        BigInteger resultTwo = BigInteger.valueOf(8L);
        BigInteger resultThree = BigInteger.valueOf(63281L);
        BigInteger resultFour = BigInteger.valueOf(43690L);
        BigInteger resultFive = BigInteger.valueOf(36079L);
        //when
        BigInteger methodResultOne = binarySystem.toDecimal(actionOne);
        BigInteger methodResultTwo = binarySystem.toDecimal(actionTwo);
        BigInteger methodResultThree = binarySystem.toDecimal(actionThree);
        BigInteger methodResultFour = binarySystem.toDecimal(actionFour);
        BigInteger methodResultFive = binarySystem.toDecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


}
