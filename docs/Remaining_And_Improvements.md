# Remaining Work And Improvements

## Remaining

- Add automated tests. The project currently verifies through direct compilation and the `Demo` flow, but there is no regression test suite.
- Add IntelliJ run configurations if this needs to be submitted with one-click `Main` and `Demo` targets.
- Decide whether `BUS` should remain in `VehicleType`. The assignment mentions `BIKE`, `AUTO`, and `CAR`; the implementation also supports `BUS`.

## Must-Fix Before Calling It Production-Ready

- Move console display methods out of model classes. Domain models should not print to `System.out`.
- Strengthen validation. `Validator` has email/phone helpers but `validRider` and `validDriver` currently only check blank fields.
- Make exception handling consistent. Some exceptions are checked, most are unchecked, and messages vary between raw IDs and human-readable text.
- Add tests for ride lifecycle transitions: request, assign, complete, cancel, invalid completion, no driver available, and strategy switching.
- Add tests for `DataStore` update/delete semantics.
- Make peak-hour pricing deterministic by injecting a clock instead of calling `LocalTime.now()` directly.

## Nice-To-Have Improvements

- Rename `FareCalculationStrategy` to `FareStrategy` if strict alignment with the assignment wording is required.
- Use constructor injection for `DataStore` to improve testability.
- Replace static ID counters with an injectable ID generator.
- Remove or isolate the `Searchable` interface if search remains only a console feature.
- Add a lightweight test runner script for plain Java, or introduce JUnit only if external dependencies are allowed.
- Normalize user-facing console symbols if the submission environment has limited Unicode support.
