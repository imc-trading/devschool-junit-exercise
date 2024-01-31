package com.imc.school;

import java.util.List;

public class OrderEventStore {
    public Orders getEvent(int eventId) {
        // Obviously this is canned data, but let's not get distracted with fancy simulations...
        return switch (eventId) {
            case 1 -> new Orders(
                    "RDSA",
                    List.of(
                            new OrderInfo("event1-1", 1.23, 100, Side.Buy),
                            new OrderInfo("event1-3", 1.25, 300, Side.Buy),
                            new OrderInfo("event1-2", 1.24, 200, Side.Buy)));

            case 2 -> new Orders("RDSA", List.of());
            default -> throw new IllegalArgumentException("Event not received: " + eventId);
        };
    }
}
