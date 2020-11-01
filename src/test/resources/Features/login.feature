#language: pt
Funcionalidade: Testes de Login no sistema

Cenario: Verificar login com credenciais válidas

Dado Usuario deseja efetuar login no sistema
Quando o usuario digitar o login
E o usuario digitar a senha
Entao ele sera direcionado para a home

Cenario: Verificar login com credenciais inválidas

Dado Usuario deseja efetuar login no sistema
Quando o usuario digitar o login errado
E o usuario digitar a senha
Entao o sistema notificará um erro
