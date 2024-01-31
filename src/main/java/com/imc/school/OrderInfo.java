package com.imc.school;

public record OrderInfo(String orderId, double price, long volume, Side side) {}
