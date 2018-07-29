package com.programmerCalculator.calculationAlgorithms.com.programmerCalculator.GUI.panels;

import com.programmerCalculator.GUI.panels.OperationsPanel;
import org.junit.Assert;
import org.junit.Test;


public class OperationPanelTestSuite {


    @Test
    public void shouldSetSpacesIntoDecimalResult(){
        //given
        OperationsPanel operationsPanel = new OperationsPanel();
        String decimal = "1274863";
        String expected = "1 274 863";
        //when
        String result = operationsPanel.setSpaceOctAndDec(decimal);
        //then
        Assert.assertEquals(expected, result);

    }


    @Test
    public void shouldRemoveSpacesFromStringResultIfExists() {
        //given
        OperationsPanel operationsPanel = new OperationsPanel();
        String decimal = "1 274 863";
        String expected = "1274863";
        //when
        String result = operationsPanel.removeSpaces(decimal);
        //then
        Assert.assertEquals(expected, result);

    }


    @Test
    public void shouldSetSpacesIntoBinaryResult() {
        //given
        OperationsPanel operationsPanel = new OperationsPanel();
        String binary = "1000101010101111101010110";
        String expected = "1 0001 0101 0101 1111 0101 0110";
        //when
        String result = operationsPanel.setSpaceBinAndHex(binary);
        //then
        Assert.assertEquals(expected, result);

    }


}
