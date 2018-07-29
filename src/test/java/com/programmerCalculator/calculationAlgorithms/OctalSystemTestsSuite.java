package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.OctalException;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigInteger;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;


public class OctalSystemTestsSuite {


    @Test
    public void testTransformOctToHex() {
        //given
        OctalSystem octalSystem = new OctalSystem();
        BigInteger actionOne = BigInteger.ZERO;
        BigInteger actionTwo = BigInteger.ONE;
        BigInteger actionThree = BigInteger.TEN;
        BigInteger actionFour = BigInteger.valueOf(3546573);
        BigInteger actionFive = BigInteger.valueOf(76543210);

        String resultOne = "0";
        String resultTwo = "1";
        String resultThree = "8";
        String resultFour = "ECD7B";
        String resultFive = "FAC688";
        //when
        String methodResultOne = octalSystem.toHexadecimal(actionOne);
        String methodResultTwo = octalSystem.toHexadecimal(actionTwo);
        String methodResultThree = octalSystem.toHexadecimal(actionThree);
        String methodResultFour = octalSystem.toHexadecimal(actionFour);
        String methodResultFive = octalSystem.toHexadecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


    @Test
    public void testTransformOctToBin() {
        //given
        OctalSystem octalSystem = new OctalSystem();
        BigInteger actionOne = BigInteger.ZERO;
        BigInteger actionTwo = BigInteger.ONE;
        BigInteger actionThree = BigInteger.TEN;
        BigInteger actionFour = BigInteger.valueOf(3546573);
        BigInteger actionFive = BigInteger.valueOf(76543210);

        String resultOne = "0";
        String resultTwo = "1";
        String resultThree = "1000";
        String resultFour = "11101100110101111011";
        String resultFive = "111110101100011010001000";
        //when
        String methodResultOne = octalSystem.toBinary(actionOne);
        String methodResultTwo = octalSystem.toBinary(actionTwo);
        String methodResultThree = octalSystem.toBinary(actionThree);
        String methodResultFour = octalSystem.toBinary(actionFour);
        String methodResultFive = octalSystem.toBinary(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


    @Test
    public void testFailTransformOctToDec() {
        //given
        OctalSystem octalSystem = new OctalSystem();
        BigInteger exception = BigInteger.valueOf(1289);
        //when&then
        try {
            octalSystem.toDecimal(exception);
            fail("Expected a OctalException to be thrown");
        } catch (OctalException e) {
            Assert.assertThat(e.getMessage(), is("Octal number should only contain values from 7 to 0"));
        }

    }


    @Test
    public void testTransformOctToDec() {
        //given
        OctalSystem octalSystem = new OctalSystem();
        BigInteger actionOne = BigInteger.ZERO;
        BigInteger actionTwo = BigInteger.ONE;
        BigInteger actionThree = BigInteger.TEN;
        BigInteger actionFour = BigInteger.valueOf(3546573);
        BigInteger actionFive = BigInteger.valueOf(76543210);

        BigInteger resultOne = BigInteger.ZERO;
        BigInteger resultTwo = BigInteger.ONE;
        BigInteger resultThree = BigInteger.valueOf(8);
        BigInteger resultFour = BigInteger.valueOf(970107);
        BigInteger resultFive = BigInteger.valueOf(16434824);
        //when
        BigInteger methodResultOne = octalSystem.toDecimal(actionOne);
        BigInteger methodResultTwo = octalSystem.toDecimal(actionTwo);
        BigInteger methodResultThree = octalSystem.toDecimal(actionThree);
        BigInteger methodResultFour = octalSystem.toDecimal(actionFour);
        BigInteger methodResultFive = octalSystem.toDecimal(actionFive);
        //then
        Assert.assertEquals(resultOne, methodResultOne);
        Assert.assertEquals(resultTwo, methodResultTwo);
        Assert.assertEquals(resultThree, methodResultThree);
        Assert.assertEquals(resultFour, methodResultFour);
        Assert.assertEquals(resultFive, methodResultFive);

    }


}
