package com.example.backendnewbresil.service.mapper;

import com.example.backendnewbresil.dto.CommandeDto;
import com.example.backendnewbresil.dto.ZoneDto;
import com.example.backendnewbresil.model.Commande;
import com.example.backendnewbresil.model.Zone;
import com.example.backendnewbresil.repository.CommandeRepository;
import com.example.backendnewbresil.repository.ZoneRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2

@Component
public class MapstructMapperImpl implements MapstructMapper {
    private final CommandeRepository commandeRepository;
    private final ZoneRepository zoneRepository;

    public MapstructMapperImpl(ZoneRepository zoneRepository,
                               CommandeRepository commandeRepository) {
        this.zoneRepository = zoneRepository;
        this.commandeRepository = commandeRepository;
    }

    @Override
    public ZoneDto toDto(Zone zone) {
        zone.setEtatZone("praticable");
        ZoneDto newZoneDto = new ZoneDto();
        newZoneDto.setNomZone(zone.getNomZone());
        newZoneDto.setCoutLivraison(zone.getCoutLivraison());
        return newZoneDto;
    }

    @Override
    public Zone toEntity(ZoneDto zoneDto) {
        Zone newZone = new Zone();
        newZone.setCoutLivraison(zoneDto.getCoutLivraison());
        newZone.setNomZone(zoneDto.getNomZone());
        newZone.setEtatZone(zoneDto.getEtatZone());
        return newZone;
    }

    @Override
    public CommandeDto toDto(Commande commande) {
        ZoneDto newZoneDto = new ZoneDto();
        CommandeDto newCommandeDto = new CommandeDto();
        newCommandeDto.setEtatCommande(commande.getEtatCommande());
        newCommandeDto.setNumeroCommande(commande.getNumeroCommande());
        newCommandeDto.setStatusCommande(commande.getStatusCommande());
        newCommandeDto.setZoneId(newCommandeDto.getZoneId());

        log.debug(newCommandeDto);

        return newCommandeDto;
    }

    @Override
    public Commande toEntity(CommandeDto commandeDto) {
        Commande newCommande = new Commande();
        newCommande.setStatusCommande(commandeDto.getStatusCommande());
        newCommande.setNumeroCommande(commandeDto.getNumeroCommande());
        newCommande.setEtatCommande(commandeDto.getEtatCommande());
        newCommande.setPaiement(commandeDto.getPaiement());
        newCommande.setDateCommande(commandeDto.getDateCommande());
        return newCommande;
    }
}
