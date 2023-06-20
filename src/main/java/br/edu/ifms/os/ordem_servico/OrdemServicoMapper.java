/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.os.Cliente.ClienteMapper;
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
         uses = {ClienteMapper.class}
)
public interface OrdemServicoMapper extends ISimpleMapper<OrdemServico, OrdemServicoDto, OrdemServicoForm>{
     public static final OrdemServicoMapper INSTANCE = Mappers.getMapper(OrdemServicoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public OrdemServico formToEntity(OrdemServicoForm dto);
    
    @InheritConfiguration(name = "update")
    
    @Override
    public OrdemServico update(OrdemServicoForm dto, @MappingTarget OrdemServico entity);

    @Mapping(target = "clientes", ignore = true)
    @Override
    public OrdemServico dtoToEntity(OrdemServicoDto dto);

    @Mapping(target = "nomeClientes", source = "entity.clientes.nome")
    @Override
    
    public OrdemServicoDto toDto(OrdemServico entity);
}
