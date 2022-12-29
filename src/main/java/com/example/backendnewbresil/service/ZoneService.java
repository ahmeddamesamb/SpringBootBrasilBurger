package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Zone;

import java.util.List;
import java.util.Optional;

public interface ZoneService {

    List<Zone> getAllZone();

    Zone createZone(Zone zone);

    Zone updateZone(long id, Zone zone);

    void deleteZone(long id);

    Optional<Zone> getZoneById(long id);
}
