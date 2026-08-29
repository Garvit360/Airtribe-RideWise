package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.Ride;

public interface FareCalculationStrategy {

    double calculateFare(Ride ride);
}
