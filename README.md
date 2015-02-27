designObject
============
Projet Architecture logiciel (Framework Logger)

Architecture du projet
======================
 * Package com :
  * Maclass.java : class qui permet de lancer l'affichage, avec présentation de l'affichage en console sur trois niveaux (DEBUG, INFO et ERROR)
  	Parametrage possible en changeant directement les PrintStream dans la classe LoggerFactory. Console et fichier pris en compte.

 * Package com.Logger :
  * BasicLogger.java : class qui centralise l'affichage et la sortie du flux en console
  * LevelOfLog.java : enum qui définie l'ensemble des niveaux de log de base (DEBUG, INFO et ERROR)
  * Logger.java : class qui implemente les méthodes permettant de jouer sur le niveau d'affichage des logs
  * LoggerFactory : class qui redirige l'appel du logger qui a été fait vers le bon niveau de log et la class BasicLogger.java

Membre du groupe
================
 * Nicolas MOREAU <nmoreau@et.esiea.fr>
 * Alexandre MLANAO AMADI <mlanaoamadi@et.esiea.fr>