/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio_tecnico;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
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
        config = BaseObjectMapper.class
)
public interface RelatorioTecnicoMapper extends ISimpleMapper<RelatorioTecnico, RelatorioTecnicoDto, RelatorioTecnicoForm> {
    public static final RelatorioTecnicoMapper INSTANCE = Mappers.getMapper(RelatorioTecnicoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public RelatorioTecnico formToEntity(RelatorioTecnicoForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public RelatorioTecnico update(RelatorioTecnicoForm dto, @MappingTarget RelatorioTecnico entity);

}
