# SOLID Reflection

## Single Responsibility Principle

The project is mostly aligned:

- Models hold domain data and display helpers.
- Services own business workflows.
- Strategies own replaceable algorithms.
- Utilities own cross-cutting helper behavior.

Improvement: display logic currently lives in model classes. For a stricter separation, presentation formatting should move out of the domain model.

## Open/Closed Principle

The strategy interfaces support extension without modifying `RideService`:

- New driver matching algorithms can implement `RideMatchingStrategy`.
- New pricing algorithms can implement `FareCalculationStrategy`.

Improvement: fare rates are duplicated in default and peak-hour strategies. A shared rate table or base calculator would reduce duplication without changing the public design.

## Liskov Substitution Principle

Matching and fare strategies are substitutable through interfaces. `RideService` can use either implementation without knowing concrete class details.

Improvement: strategy behavior should be covered by tests so future implementations preserve expected contracts.

## Interface Segregation Principle

`Searchable` is small and focused. The strategy interfaces are also narrow.

Improvement: `Searchable` is a presentation-oriented concern. It may not belong on every domain object if the system grows beyond a console app.

## Dependency Inversion Principle

`RideService` depends on strategy abstractions for matching and pricing. That is the right direction for this assignment.

Improvement: services still directly instantiate `DataStore`. Passing stores into constructors would make the service layer easier to test and replace.
