# Descrição do desafio
--------------------------------------------------------------------
## Criar uma aplicação Selenium com os seguintes casos de teste
## Caso de teste 1
Acessar o site da accenture e aceitar os cookies do LGPD<br>

<b>Cenário</b>: Aceitar o cookie LGPD<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
Então deve fechar a caixa de informação<br>

<b>Cenário</b>: Configurações do cookie<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
e clico em configurações de cookie<br>
Então devo ver o item de "sua privacidade"<br>
E devo ver "Cookies estritamente necessárias"<br>
e devo ver "Cookies Analíticos de Primeira Parte"<br>
e devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
e devo ver "Cookies de Publicidade e Redes Sociais"<br>

## Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: listar serviços da Accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
Então devo ver os serviços abaixo<br>
  | Accenture Strategy |
  | Application Services |
  | Artificial Intelligence |
  | Automation |
  | Business Process Services |
  | Change Management |
  | Cloud |
  | Customer Experience |
  | Data & Analytics |
  | Ecosystem Partners |
  | Finance Consulting |
  | Industry X |
  | Infrastructure |
  | Marketing |
  | Mergers & Acquisitions (M&A) |
  | Operating Models |
  | Security |
  | Supply Chain Management |
  | Sustainability |
  | Technology Consulting |
  | Technology Innovation |
  | Zero Based Budgeting (ZBB) |

<b>Cenário</b>: Clicar no serviço cloud<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
e clico no item do menu cloud<br>
Então devo encontrar o título "Serviços de Cloud"<br>

## Caso de teste
Acessar a lista de carreiras da accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
dado que eu estou no site da accenture<br>
e clico no menu carreiras<br>
e clico no item do menu vagas em tecnologia<br>
Então devo ver o destaque em "Carreiras em Tecnologia"<br>

<b>Cenário</b>: Procurando uma vaga<br>
dado que eu estou no site da accenture<br>
e digito no campo de busca "desenvolvedor"<br>
e clico no botão procurar<br>
Então devo encontrar vagas para programadores<br>

## Caso de teste
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu sobre a accenture<br>
e clico no item do menu sobre a accenture<br>
Então devo ver o destaque em "Nosso propósito"<br>
--------------------------------------------------------------------