#Author: Proservice
Feature: homePage xiaomi

  Scenario: selectionner un menu de la page dacceuil
    Given utilisateur est sur la page dacceuil
    When utilisateur survole la souris sur le menu "Smart Home" et clique sur submenu "Maison connectée"
    Then utilisateur est dirige vers la page "Maison Connectée"
