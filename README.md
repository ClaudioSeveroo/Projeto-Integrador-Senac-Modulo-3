# Sistema para Farmácia

Status do projeto: em desenvolvimento.

Tecnologias utilizadas: Net Beans, HTML, CSS, Java Script, Java, MySQL, JPA, Hibernate, Spring Boot.

Time: Cláudio Severo.

Objetivo do Software: Criar um sistema de controle de estoque de medicamentos para uma farmácia.

Funcionalidades do sistema (requisitos):

Requisitos Funcionais: 
Autenticação e Acesso: Logar usuário, Validar campos de login, Fechar sistema, Abrir sistema.
Navegação e Interface: Abrir páginas, Voltar à página anterior, Limpar campos de formulário.
Gestão de Medicamentos: Cadastrar medicamento, Atualizar informações do medicamento, Atualizar tabela com medicamentos cadastrados, Gerar tabela/listagem dos medicamentos.

Requisitos não Funcionais: Tempo de latência, Desempenho, Disponibilidade, Usabilidade, Segurança.

Regras de Negócios: 
Obrigatoriedade de preenchimento: Todos campos no formulário de cadastro devem ser preenchidos com exceção ao campo de observações.
Estoque mínimo: Se a quantidade de um medicamento for inferior a 5 unidades, o sistema deve exibir um aviso de “estoque baixo”.
Nome apenas com letras: O campo “nome do medicamento” não deve aceitar números ou símbolos.
Busca de medicamento: Se a busca por um medicamento não encontrar resultados, exibir "Nenhum medicamento encontrado".
Limpar campo: O botão "Limpar" deve apagar apenas os campos do formulário ativo, sem apagar dados do banco.

