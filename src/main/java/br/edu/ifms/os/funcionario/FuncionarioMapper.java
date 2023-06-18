/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.funcionario;

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
public interface FuncionarioMapper extends ISimpleMapper<Funcionario, FuncionarioDto, FuncionarioForm>{
      public static final FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Funcionario formToEntity(FuncionarioForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Funcionario update(FuncionarioForm dto, @MappingTarget Funcionario entity);

}
