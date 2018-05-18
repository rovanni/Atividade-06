# Atividade-06
Trabalho de Mestrado do Programa de Pós-Graduação em Informática (PPGI), Mestrado Profissiona, utilizando TDD.  
UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ - UTFPR  
Campus Cornélio Procópio  
Disciplina: Validação e teste de software - 2018  
Prof. André Takeshi Endo  

addons:
  sonarcloud:
    organization: "andreendo-github"

script:
  - mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar
