# language: pt

Funcionalidade: Validar CPF
  Cenario: CPF Válido
    Dado que eu esteja na pagina de validação de cpf
    E digito um cpf válido "129.360.810-68"
    Quando eu clico no botão enviar
    Entao devo ver uma mensagem de "Foi validado com sucesso"

  Cenario: CPF Inválido
    Dado que eu esteja na pagina de validação de cpf
    E digito um cpf válido "129.360.810-69"
    Quando eu clico no botão enviar
    Entao devo ver uma mensagem de "Não validado com sucesso" para inválido