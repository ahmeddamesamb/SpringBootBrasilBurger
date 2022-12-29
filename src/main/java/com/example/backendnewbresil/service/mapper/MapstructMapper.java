package com.example.backendnewbresil.service.mapper;

import com.example.backendnewbresil.dto.CommandeDto;
import com.example.backendnewbresil.dto.ZoneDto;
import com.example.backendnewbresil.model.Commande;
import com.example.backendnewbresil.model.Zone;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapstructMapper {
    //Mappage d l entity Zone
    ZoneDto toDto(Zone zone);

    Zone toEntity(ZoneDto zoneDto);

    //Mappage d l entity Commande
    CommandeDto toDto(Commande commande);

    Commande toEntity(CommandeDto commandeDto);


}


