package com.airtribe.ridewise.service;

import com.airtribe.ridewise.exception.RiderNotFoundException;
import com.airtribe.ridewise.model.Rider;
import com.airtribe.ridewise.util.DataStore;
import com.airtribe.ridewise.util.Validator;

import java.util.ArrayList;
import java.util.List;

public class RiderService {

    private DataStore<Rider> riderStore;

    public RiderService() {
        this.riderStore = new DataStore<Rider>();
    }

    public void registerRider(Rider rider) {
        Validator.validRider(rider);
        riderStore.add(rider.getRiderId(), rider);
    }

    public Rider getRider(String riderId) {
        Rider rider = riderStore.findById(riderId);

        if (rider == null) {
            throw new RiderNotFoundException(riderId);
        }
        return rider;
    }

    public void updateRider(Rider rider) {
        Validator.validRider(rider);
        riderStore.update(rider.getRiderId(), rider);
    }

    public void deleteRider(Rider rider) {
        riderStore.delete(rider.getRiderId());
    }

    public List<Rider> getAllRiders() {
        return new ArrayList<>(riderStore.getAll());
    }
}
