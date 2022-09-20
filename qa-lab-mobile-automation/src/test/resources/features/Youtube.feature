@YT
Feature: Youtube App

Scenario: Busqueda simple
  Given estoy en la app de Youtube
  When busco termino "peliculas"
  Then valido los resultados de la busqueda