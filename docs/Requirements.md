# RideWise Requirements

This document summarizes the assignment requirements from the provided project material. It is project context, not an instruction file for the assistant.

## Functional Requirements

- Register riders.
- Register drivers.
- Show available drivers.
- Request a ride.
- Match a ride to a driver using a configurable strategy.
- Calculate fare using a configurable pricing strategy.
- Track ride lifecycle with these statuses:
  - `REQUESTED`
  - `ASSIGNED`
  - `COMPLETED`
  - `CANCELLED`

## Non-Functional Requirements

- Pricing algorithms should be easy to extend.
- Driver matching logic should be easy to change.
- Services should stay low-coupled.
- Code should be readable and maintainable.

## Implemented Entities

- `Rider`
- `Driver`
- `Ride`
- `FareReceipt`
- `Location`
- `RideStatus`
- `VehicleType`

## Implemented Services

- `RiderService`
- `DriverService`
- `RideService`

## Implemented Strategies

- `NearestDriverStrategy`
- `LeastActiveDriverStrategy`
- `DefaultFareStrategy`
- `PeakHourFareStrategy`

## Console Menu Coverage

- Add rider
- Add driver
- View available drivers
- View all drivers
- View all riders
- Request ride
- Complete ride
- Cancel ride
- View all rides
- Search riders
- Search drivers
- Search rides
- Change matching strategy
- Change fare strategy
- View ride details
