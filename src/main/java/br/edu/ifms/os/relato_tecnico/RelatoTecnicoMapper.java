/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.os.atendimento.AtendimentoMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author mateu
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {AtendimentoMapper.class}
)
public interface RelatoTecnicoMapper extends ISimpleMapper<RelatoTecnico, RelatoTecnicoDto, RelatoTecnicoForm> {
    public static final RelatoTecnicoMapper INSTANCE = Mappers.getMapper(RelatoTecnicoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public RelatoTecnico formToEntity(RelatoTecnicoForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public RelatoTecnico update(RelatoTecnicoForm dto, @MappingTarget RelatoTecnico entity);

     @Mapping(target = "atendimento", ignore = true)
    @Override
    public RelatoTecnico dtoToEntity(RelatoTecnicoDto dto);
   
}
