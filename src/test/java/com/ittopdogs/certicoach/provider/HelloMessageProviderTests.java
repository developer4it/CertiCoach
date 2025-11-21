package com.ittopdogs.certicoach.provider;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloMessageProviderTests {

    @Test
    public void testGetMessage_ReturnsHelloWorld() {
        // Arrange
        HelloMessageProvider provider = new HelloMessageProvider();

        // Act
        String message = provider.getMessage();

        // Assert
        assertEquals("Hello World!", message, "De boodschap moet 'Hello World!' zijn.");
    }
}
