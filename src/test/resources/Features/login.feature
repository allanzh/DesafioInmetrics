#language: pt
Funcionalidade: Testes de Login no sistema

Cenario: Verificar login com credenciais válidas

Dado que o Usuario deseja efetuar login no sistema
Quando o usuario digitar o "<login>"
E o usuario digitar a "<senha>"
Entao ele sera direcionado para a home

Exemplos:
| login | senha |
| allaninmetrics | inmetrics |

Cenario: Verificar login com credenciais inválidas

Dado que o Usuario deseja efetuar login no sistema
Quando o usuario digitar o "<login>"
E o usuario digitar a "<senha>"
Entao o sistema notificará um erro

Exemplos:
| login | senha |
| @@allaninmetrics | inmetrics |
| allaninmetrics | senhaerrada |

