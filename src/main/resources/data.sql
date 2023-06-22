/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  1513003
 * Created: 2 de mai. de 2023
 */

INSERT INTO cliente (id, nome, email, telefone, rua, numero, bairro) VALUES
(1, 'Mateus', 'mateus@ifms.edu.br', '1469-7854','Rua dos Zootakus', '145', 'Chapeus de Palhas'),
(2, 'Luan', 'Luan@ifms.edu.br', '1469-7854','Rua dos Zootakus', '145', 'Chapeus de Palhas');

ALTER SEQUENCE cliente_sequence RESTART WITH 3;

INSERT INTO funcionario (id, nome, email, telefone, perfil, login, senha) VALUES
(1, 'Mateus', 'mateus@ifms.edu.br', '1469-7854', 'admin' , 'luffy', '123'),
(2, 'Luan', 'Luan@ifms.edu.br', '1469-7854', 'admin', '145', 'Chapeus de Palhas');

ALTER SEQUENCE funcionario_sequence RESTART WITH 3;

INSERT INTO ordem_servico (id, nome, problema,  prioridade, status, clientes_id) VALUES
(1, 'Verificar internet', 'internt nao pega', 'ALTA', 'FECHADO',1);

ALTER SEQUENCE ordem_servico_sequence RESTART WITH 2;

INSERT INTO atendimento (data_abertura, funcionario_id, ordem_servico_id) VALUES
('2023-01-06',1,1);


 INSERT INTO relatorio_tecnico (id, nome, data_fechamento,  relato, atendimento_funcionario_id, atendimento_ordem_servico_id) VALUES
 (1, 'Relato ordem de serviço para organizar cabos de rede', '2023-05-06', 'Fora até o local realizar os procedimentos....',1,1);
 
 ALTER SEQUENCE relatorio_tecnico_sequence RESTART WITH 2;


