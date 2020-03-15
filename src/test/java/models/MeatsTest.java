package models;


import static org.junit.Assert.*;
import org.junit.Test;



public class MeatsTest {

    @Test
    public void nullaryConstructorTest(){
        Meats fish = new Meats();
        fish.setId(1);
        int expected = 1;
        // Then
        assertEquals(expected, fish.getId());
    }

    @Test
    public void constructorTest(){
        Meats pork = new Meats(1, "pork", 10.5, 5.50f);
        int expectedID = 1;
        String expectedName = "pork";
        double expectedWeight = 10.5;
        float expectedPrice = 5.50f;
        // Then
        assertEquals(expectedID, pork.getId());
        assertEquals(expectedName, pork.getName());
        assertEquals(expectedWeight, pork.getWeight(), .001);
        assertEquals(expectedPrice, pork.getPrice(), .001);
    }

    @Test
    public void setNameTest(){
        Meats pork = new Meats(1, "pork", 10.5, 5.50f);
        pork.setName("bacon");
        String expected = "bacon";
        assertEquals(expected, pork.getName());
    }

    @Test
    public void setWeightTest(){
        Meats pork = new Meats(1, "pork", 10.5, 5.50f);
        pork.setWeight(5.5);
        double expected = 5.5;
        assertEquals(expected, pork.getWeight(), .001);
    }

    @Test
    public void setPriceTest(){
        Meats pork = new Meats(1, "pork", 10.5, 5.50f);
        pork.setPrice(3.50f);
        float expected = 3.50f;
        assertEquals(expected, pork.getPrice(), .001);
    }

}
