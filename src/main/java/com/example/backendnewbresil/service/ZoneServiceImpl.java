package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Zone;
import com.example.backendnewbresil.repository.ZoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneServiceImpl implements ZoneService{
    private final ZoneRepository zoneRepository;

    public ZoneServiceImpl(ZoneRepository zoneRepository) {
        this.zoneRepository = zoneRepository;
    }

    @Override
    public List<Zone> getAllZone() {
        return zoneRepository.findAll();
    }

    @Override
    public Zone createZone(Zone zone) {
        return zoneRepository.save(zone);
    }

    @Override
    public Zone updateZone(long id, Zone zone) {
        return null;
    }

    @Override
    public void deleteZone(long id) {

    }

    @Override
    public Optional<Zone> getZoneById(long id) {
        return zoneRepository.findById(id);
    }
}
