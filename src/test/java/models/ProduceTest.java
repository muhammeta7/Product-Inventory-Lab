package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProduceTest {

    @Test
    public void nullaryConstructorTest(){
        Produce beans = new Produce();
        beans.setId(1);
        int expected = 1;
        // Then
        assertEquals(expected, beans.getId());
    }

    @Test
    public void constructorTest(){
        Produce beans = new Produce(1, "beans", 10.5, 5.50f);
        int expectedID = 1;
        String expectedName = "beans";
        double expectedWeight = 10.5;
        float expectedPrice = 5.50f;
        // Then
        assertEquals(expectedID, beans.getId());
        assertEquals(expectedName, beans.getName());
        assertEquals(expectedWeight, beans.getWeight(), .001);
        assertEquals(expectedPrice, beans.getPrice(), .001);
    }

    @Test
    public void setNameTest(){
        Produce beans = new Produce(1, "beans", 10.5, 5.50f);
        beans.setName("bacon");
        String expected = "bacon";
        assertEquals(expected, beans.getName());
    }

    @Test
    public void setWeightTest(){
       Produce beans = new Produce(1, "beans", 10.5, 5.50f);
        beans.setWeight(5.5);
        double expected = 5.5;
        assertEquals(expected, beans.getWeight(), .001);
    }

    @Test
    public void setPriceTest(){
        Produce beans = new Produce(1, "beans", 10.5, 5.50f);
        beans.setPrice(3.50f);
        float expected = 3.50f;
        assertEquals(expected, beans.getPrice(), .001);
    }

}
