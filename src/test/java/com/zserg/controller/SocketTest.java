package com.zserg.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SocketTest  {

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}
