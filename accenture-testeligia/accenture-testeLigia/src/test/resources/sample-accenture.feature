#Author: lligya@hotmail.com

Feature: Escolha automotiva
   Eu como usuario quero acessar o site do sampleapp para escolher um veiculo

  
  Background: Acessar o site sampleapp
  	Given que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
  
  
  Scenario: Escolher automovel
    When Fizer o cadastro corretamente
    Then valido a informacao