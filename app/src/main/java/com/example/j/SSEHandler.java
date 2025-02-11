package com.example.j;

import com.launchdarkly.eventsource.MessageEvent;

public interface SSEHandler {
    void onSSEConnectionOpened();
    void onSSEConnectionClosed();
    void onSSEEventReceived(String event, MessageEvent messageEvent);
    void onSSEError(Throwable t);
}