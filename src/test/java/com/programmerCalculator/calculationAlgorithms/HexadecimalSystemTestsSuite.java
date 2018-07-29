package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.HexadecimalException;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigInteger;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;


public class HexadecimalSystemTestsSuite {


    @Test
    public void testTransformHexToBin() {
        //given
        HexadecimalSystem hexadecimalSystem = new HexadecimalSystem();
        String actionOne = "0";
        String actionTwo = "1";
        String actionThree = "0123456789";
        String actionFour = "FEDCBA";
        String actionFive = "ABCDEF";

        String resultOne = "0";
        String resultTwo = "1";
        String resultThree = "100100011010001010110011110001001";
        String resultFour = "111111101101110010111010";
        String resultFive = "101010111100110111101111";
        //when
        String resultMethodOne = hexadecimalSystem.toBinary(actionOne);
        String resultMethodTwo = hexadecimalSystem.toBinary(actionTwo);
        String resultMethodThree = hexadecimalSystem.toBinary(actionThree);
        String resultMethodFour = hexadecimalSystem.toBinary(actionFour);
        String resultMethodFive = hexadecimalSystem.toBinary(actionFive);
        //then
        Assert.assertEquals(resultOne, resultMethodOne);
        Assert.assertEquals(resultTwo, resultMethodTwo);
        Assert.assertEquals(resultThree, resultMethodThree);
        Assert.assertEquals(resultFour, resultMethodFour);
        Assert.assertEquals(resultFive, resultMethodFive);

    }


    @Test
    public void testTransformHexToOct() {
        //given
        HexadecimalSystem hexadecimalSystem = new HexadecimalSystem();
        String actionOne = "0";
        String actionTwo = "1";
        String actionThree = "0123456789";
        String actionFour = "FEDCBA";
        String actionFive = "ABCDEF";

        BigInteger resultOne = BigInteger.ZERO;
        BigInteger resultTwo = BigInteger.ONE;
        BigInteger resultThree = new BigInteger("44321263611");
        BigInteger resultFour = new BigInteger("77556272");
        BigInteger resultFive = new BigInteger("52746757");
        //when
        BigInteger resultMethodOne = hexadecimalSystem.toOctal(actionOne);
        BigInteger resultMethodTwo = hexadecimalSystem.toOctal(actionTwo);
        BigInteger resultMethodThree = hexadecimalSystem.toOctal(actionThree);
        BigInteger resultMethodFour = hexadecimalSystem.toOctal(actionFour);
        BigInteger resultMethodFive = hexadecimalSystem.toOctal(actionFive);
        //then
        Assert.assertEquals(resultOne, resultMethodOne);
        Assert.assertEquals(resultTwo, resultMethodTwo);
        Assert.assertEquals(resultThree, resultMethodThree);
        Assert.assertEquals(resultFour, resultMethodFour);
        Assert.assertEquals(resultFive, resultMethodFive);

    }


    @Test
    public void testFailTransformHexToDec() {
        //given
        HexadecimalSystem hexadecimalSystem = new HexadecimalSystem();
        String exception = "0241fgws";
        //when&then
        try {
            hexadecimalSystem.toDecimal(exception);
            fail("Expected a HexadecimalException to be thrown");
        } catch (HexadecimalException e) {
            Assert.assertThat(e.getMessage(),
                    is("Hexadecimal number should contain values from 9 to 0 and letters from A to F"));
        }

    }


    @Test
    public void testTransformHexToDec() {
        //given
        HexadecimalSystem hexadecimalSystem = new HexadecimalSystem();
        String actionOne = "0";
        String actionTwo = "1";
        String actionThree = "0123456789";
        String actionFour = "FEDCBA";
        String actionFive = "ABCDEF";

        BigInteger resultOne = BigInteger.ZERO;
        BigInteger resultTwo = BigInteger.ONE;
        BigInteger resultThree = BigInteger.valueOf(4886718345L);
        BigInteger resultFour = BigInteger.valueOf(16702650L);
        BigInteger resultFive = BigInteger.valueOf(11259375L);
        //when
        BigInteger resultMethodOne = hexadecimalSystem.toDecimal(actionOne);
        BigInteger resultMethodTwo = hexadecimalSystem.toDecimal(actionTwo);
        BigInteger resultMethodThree = hexadecimalSystem.toDecimal(actionThree);
        BigInteger resultMethodFour = hexadecimalSystem.toDecimal(actionFour);
        BigInteger resultMethodFive = hexadecimalSystem.toDecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, resultMethodOne);
        Assert.assertEquals(resultTwo, resultMethodTwo);
        Assert.assertEquals(resultThree, resultMethodThree);
        Assert.assertEquals(resultFour, resultMethodFour);
        Assert.assertEquals(resultFive, resultMethodFive);

    }


}
