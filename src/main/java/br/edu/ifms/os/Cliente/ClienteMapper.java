/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.Cliente;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

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
    
     @Override
    public Cliente dtoToEntity(ClienteDto dto);
    
     @Override
    public  ClienteDto toDto(Cliente entity);
    
    @InheritConfiguration(name = "update")
    
    @Override
    public Cliente update(ClienteForm dto, @MappingTarget Cliente entity);

    @Override
    public List<Cliente> toEntityList(List<ClienteDto> items);

    @Override
    public List<ClienteDto> toDtoList(List<Cliente> items);

    @Override
    public default Page<ClienteDto> toDtoPage(Page<Cliente> items) {
        return items.map(entity -> toDto(entity));
    }
}
