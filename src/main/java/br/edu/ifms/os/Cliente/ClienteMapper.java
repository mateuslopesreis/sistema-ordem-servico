/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.Cliente;

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
public interface ClienteMapper extends ISimpleMapper<Cliente, ClienteDto, ClienteForm> {
    public static final ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Cliente formToEntity(ClienteForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Cliente update(ClienteForm dto, @MappingTarget Cliente entity);

}
