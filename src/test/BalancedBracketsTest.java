package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

   @Test
   public void frontBracketsReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }


    @Test
    public void singleBracketsAroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void leftBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    @Test
    public void rightBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }

    @Test
    public void multipleBracketsAroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[test]]]"));
    }

    @Test
    public void doubleBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]test["));
    }

    @Test
    public void middleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("te[]st"));
    }

    @Test
    public void bothBracketsAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]test"));
    }

    @Test
    public void bothBracketsAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
    }

    @Test
    public void singleBracketNoTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multipleBracketPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Test] test [test test.]"));
    }

}
