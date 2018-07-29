package com.programmerCalculator.calculationAlgorithms;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigInteger;


public class DecimalSystemTestSuite {


    @Test
    public void testTransformDecToOct() {
        //given
        DecimalSystem decimalSystem = new DecimalSystem();
        BigInteger actionOne = BigInteger.ZERO;
        BigInteger actionTwo = BigInteger.ONE;
        BigInteger actionThree = BigInteger.valueOf(8);
        BigInteger actionFour = BigInteger.valueOf(970107);
        BigInteger actionFive = BigInteger.valueOf(16434824);

        BigInteger resultOne = BigInteger.ZERO;
        BigInteger resultTwo = BigInteger.ONE;
        BigInteger resultThree = BigInteger.TEN;
        BigInteger resultFour = BigInteger.valueOf(3546573);
        BigInteger resultFive = BigInteger.valueOf(76543210);
        //when
        BigInteger methodResultOne = decimalSystem.toOctal(actionOne);
        BigInteger methodResultTwo = decimalSystem.toOctal(actionTwo);
        BigInteger methodResultThree = decimalSystem.toOctal(actionThree);
        BigInteger methodResultFour = decimalSystem.toOctal(actionFour);
        BigInteger methodResultFive = decimalSystem.toOctal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


    @Test
    public void testTransformDecToHex() {
        //given
        DecimalSystem decimalSystem = new DecimalSystem();
        BigInteger actionOne = BigInteger.valueOf(0);
        BigInteger actionTwo = BigInteger.ONE;
        BigInteger actionThree = BigInteger.valueOf(123456789);
        BigInteger actionFour = BigInteger.valueOf(16702650);
        BigInteger actionFive = BigInteger.valueOf(987654321);

        String resultOne = "0";
        String resultTwo = "1";
        String resultThree = "75BCD15";
        String resultFour = "FEDCBA";
        String resultFive = "3ADE68B1";
        //when
        String resultMethodOne = decimalSystem.toHexadecimal(actionOne);
        String resultMethodTwo = decimalSystem.toHexadecimal(actionTwo);
        String resultMethodThree = decimalSystem.toHexadecimal(actionThree);
        String resultMethodFour = decimalSystem.toHexadecimal(actionFour);
        String resultMethodFive = decimalSystem.toHexadecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, resultMethodOne);
        Assert.assertEquals(resultTwo, resultMethodTwo);
        Assert.assertEquals(resultThree, resultMethodThree);
        Assert.assertEquals(resultFour, resultMethodFour);
        Assert.assertEquals(resultFive, resultMethodFive);

    }

    @Test
    public void testTransformDecToBin() {
        //given
        DecimalSystem decimalSystem = new DecimalSystem();
        BigInteger actionOne = BigInteger.valueOf(136);
        BigInteger actionTwo = BigInteger.valueOf(1);
        BigInteger actionThree = BigInteger.valueOf(1);
        BigInteger actionFour = BigInteger.valueOf(0);
        BigInteger actionFive = BigInteger.valueOf(13628843);

        String resultOne = "10001000";
        String resultTwo = "1";
        String resultThree = "1";
        String resultFour = "0";
        String resultFive = "110011111111010110101011";
        //when
        String methodResultOne = decimalSystem.toBinary(actionOne);
        String methodResultTwo = decimalSystem.toBinary(actionTwo);
        String methodResultThree = decimalSystem.toBinary(actionThree);
        String methodResultFour = decimalSystem.toBinary(actionFour);
        String methodResultFive = decimalSystem.toBinary(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


}
