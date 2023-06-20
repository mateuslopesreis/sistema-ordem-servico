/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.os.funcionario.FuncionarioMapper;
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
         uses = { FuncionarioMapper.class }
)
public interface RelatorioMapper extends ISimpleMapper<Relatorio, RelatorioDto, RelatorioForm>{
     public static final RelatorioMapper INSTANCE = Mappers.getMapper(RelatorioMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Relatorio formToEntity(RelatorioForm dto);
    
    @InheritConfiguration(name = "update")
    @Override
    public Relatorio update(RelatorioForm dto, @MappingTarget Relatorio entity);

    @Mapping(target = "funcionario", ignore = true)
     @Mapping(target = "ordemservico", ignore = true)
    @Override
    public Relatorio dtoToEntity(RelatorioDto dto);

    @Mapping(target = "nomeFuncionario", source = "entity.funcionario.nome")
    @Mapping(target = "nomeOrdemServico", source = "entity.ordemservico.nome")
    @Override
    public RelatorioDto toDto(Relatorio entity);

}
