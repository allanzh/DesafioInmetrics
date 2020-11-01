Feature: Testes de Login no sistema

Scenario: Verificar login com credenciais válidas

Given Usuario deseja efetuar login no sistema
When o usuario digitar o login
And o usuario digitar a senha
Then ele sera direcionado para a home

Scenario: Verificar login com credenciais inválidas

Given Usuario deseja efetuar login no sistema
When o usuario digitar o login errado
And o usuario digitar a senha
Then o sistema notificará um erro