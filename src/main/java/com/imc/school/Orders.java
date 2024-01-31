package com.imc.school;

import java.util.List;

public record Orders(String book, List<OrderInfo> orders) {}
