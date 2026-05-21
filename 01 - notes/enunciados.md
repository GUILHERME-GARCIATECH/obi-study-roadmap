1 - 🏋️ O Desafio: Validador de Senhas Corporativas
Você deve criar um programa que simule o sistema de cadastro de senhas de uma empresa de segurança. O programa deve receber a senha do usuário e validar se ela cumpre todos os requisitos de segurança.
Requisitos do Sistema:
Estrutura Sequencial e Scanner: Solicite o nome do usuário e a senha desejada via console.
Estrutura de Repetição: Se a senha for inválida, o programa deve exibir os erros e solicitar uma nova senha. O ciclo só para quando a senha for 100% válida.
Uso de Funções: Toda a validação da senha deve acontecer dentro de uma função específica chamada validarSenha, que retorna um valor booleano (true se for válida, false se for inválida).
Estruturas Condicionais (As Regras da Senha):
Ter pelo menos 8 caracteres.
Conter pelo menos uma letra maiúscula.
Conter pelo menos uma letra minúscula.
Conter pelo menos um número.
Não pode conter o nome do usuário (ignorando letras maiúsculas/minúsculas)