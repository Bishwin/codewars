import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void test () {
        assertEquals("MMXIX", Kata.toRomanNumeral(2019));
    }

    @Test
    public void test0 () {
        assertEquals("CMXCIX", Kata.toRomanNumeral(999));
    }

    @Test
    public void test1 () {
        assertEquals("CDXLIV", Kata.toRomanNumeral(444));
    }

    @Test
    public void test2 () {
        assertEquals("CXXIII", Kata.toRomanNumeral(123));
    }

    @Test
    public void test3 () {
        assertEquals("CDLVI", Kata.toRomanNumeral(456));
    }

    @Test
    public void test4 () {
        assertEquals("DCCLXXXIX", Kata.toRomanNumeral(789));
    }

    @Test
    public void test111 () {
        assertEquals("CXI", Kata.toRomanNumeral(111));
    }

    @Test
    public void test222 () {
        assertEquals("CCXXII", Kata.toRomanNumeral(222));
    }

    @Test
    public void test333 () {
        assertEquals("CCCXXXIII", Kata.toRomanNumeral(333));
    }

    @Test
    public void test444 () {
        assertEquals("CDXLIV", Kata.toRomanNumeral(444));
    }

    @Test
    public void test555 () {
        assertEquals("DLV", Kata.toRomanNumeral(555));
    }

    @Test
    public void test666 () {
        assertEquals("DCLXVI", Kata.toRomanNumeral(666));
    }

    @Test
    public void test777 () {
        assertEquals("DCCLXXVII", Kata.toRomanNumeral(777));
    }

    @Test
    public void test888 () {
        assertEquals("DCCCLXXXVIII", Kata.toRomanNumeral(888));
    }

    @Test
    public void whenInputIs369ReturnCCCLXIX () {
        assertEquals("CCCLXIX", Kata.toRomanNumeral(369));
    }

    @Test
    public void whenInputIs420ReturnCCCLXIX () {
        assertEquals("CDXX", Kata.toRomanNumeral(420));
    }

    @Test
    public void whenInputIs1ReturnI() {
        assertEquals("I", Kata.toRomanNumeral(1));
    }

    @Test
    public void whenInputIs2ReturnII() {
        assertEquals("II", Kata.toRomanNumeral(2));
    }

    @Test
    public void whenInputIs3ReturnIII() {
        assertEquals("III", Kata.toRomanNumeral(3));
    }

    @Test
    public void whenInputIs4ReturnIV() {
        assertEquals("IV", Kata.toRomanNumeral(4));
    }

    @Test
    public void WhenInputIs5ReturnV() {
        assertEquals("V", Kata.toRomanNumeral(5));
    }

    @Test
    public void WhenInputIs10ReturnX() {
        assertEquals("X", Kata.toRomanNumeral(10));
    }

    @Test
    public void WhenInputIs50ReturnL() {
        assertEquals("L", Kata.toRomanNumeral(50));
    }

    @Test
    public void WhenInputIs100ReturnC() {
        assertEquals("C", Kata.toRomanNumeral(100));
    }

    @Test
    public void WhenInputIs500ReturnD() {
        assertEquals("D", Kata.toRomanNumeral(500));
    }

    @Test
    public void WhenInputIs1000ReturnM() {
        assertEquals("M", Kata.toRomanNumeral(1000));
    }

    @Test
    public void WhenInputIs3000ReturnMMM() {
        assertEquals("MMM", Kata.toRomanNumeral(3000));
    }

    @Test
    public void shouldReturnErrorWhenInputIsLessThan0() {
        assertEquals("enter value between 1-3000", Kata.toRomanNumeral(0));
    }

    @Test
    public void shouldReturnErrorWhenInputIsMoreThan3000() {
        assertEquals("enter value between 1-3000", Kata.toRomanNumeral(3001));
    }
}
