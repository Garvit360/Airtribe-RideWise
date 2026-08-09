# Object Relationships

## Core Relationships

- `Rider` has one `Location`.
- `Driver` has one `Location`.
- `Ride` references one `Rider`.
- `Ride` references one `Driver`.
- `Ride` has one `RideStatus`.
- `Ride` has one `VehicleType`.
- `FareReceipt` references a completed ride by `rideId`.

## Service Relationships

- `RiderService` owns rider registration and lookup behavior.
- `DriverService` owns driver registration, lookup, and availability filtering.
- `RideService` orchestrates rider lookup, available driver lookup, driver matching, ride state changes, and fare calculation.

## Strategy Relationships

- `RideService` depends on `RideMatchingStrategy`, not a concrete matching implementation.
- `RideService` depends on `FareCalculationStrategy`, not a concrete pricing implementation.
- Strategy implementations can be swapped at runtime without losing ride state.

## Utility Relationships

- `DataStore<T>` provides in-memory storage for services.
- `IdGenerator` generates entity IDs.
- `Validator` centralizes basic rider and driver validation.

## Presentation Relationships

- `Main` is the interactive console application.
- `Demo` is an automated walkthrough of the implemented features.
- Presentation classes call the service layer rather than mutating stores directly.
