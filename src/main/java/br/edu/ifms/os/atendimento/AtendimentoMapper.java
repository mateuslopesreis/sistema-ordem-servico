/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.os.funcionario.FuncionarioMapper;
import br.edu.ifms.os.ordem_servico.OrdemServicoMapper;
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
         uses = { OrdemServicoMapper.class, FuncionarioMapper.class }
)
public interface AtendimentoMapper extends ISimpleMapper<Atendimento, AtendimentoDto, AtendimentoForm>{
     public static final AtendimentoMapper INSTANCE = Mappers.getMapper(AtendimentoMapper.class);

  
    @Mapping(target = "id", expression = """
                                         java(
                                            AtendimentoId.builder()
                                                    .ordemservicoId(dto.getOrdemservico().getId())
                                                    .funcionarioId(dto.getFuncionario().getId())
                                                    .build()
                                         )
                                         """)
    @Override
    public Atendimento formToEntity(AtendimentoForm dto);

    
    @Mapping(target = "id", ignore = true)
    @Override
    
     @Mapping(target = "ordemservico", ignore = true)
     @Mapping(target = "funcionario", ignore = true)
    
    public Atendimento dtoToEntity(AtendimentoDto dto);

    @Mapping(target = "nomeordemservico", source = "entity.ordemservico.nome")
    @Mapping(target = "nomefuncionario", source = "entity.funcionario.nome")

    @Override
    public AtendimentoDto toDto(Atendimento entity);
    
    
    @Mapping(target = "id", ignore = true)
    @Override
    public Atendimento update(AtendimentoForm dto, @MappingTarget Atendimento entity);
    
   

    
   
}
