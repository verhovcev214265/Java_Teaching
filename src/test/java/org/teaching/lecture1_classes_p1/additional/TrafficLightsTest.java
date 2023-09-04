package org.teaching.lecture1_classes_p1.additional;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightsTest {

    @Test
    public void shouldReturnCorrectLight(){
        String green = "green", yellow = "yellow", red = "red";

        Assert.assertEquals(yellow, TrafficLights.updateLight(green));
        Assert.assertEquals(red, TrafficLights.updateLight(yellow));
        Assert.assertEquals(green, TrafficLights.updateLight(red));
    }
}
