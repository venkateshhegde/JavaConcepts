package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class JavaTests {

    @Test(expected = NumberFormatException.class)
    public void testThis()
    {
        Integer.parseInt("100_000");
    }
}
