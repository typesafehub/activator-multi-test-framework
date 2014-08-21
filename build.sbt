name := """multi-test-framework"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
	"org.scalacheck" 	%% "scalacheck" % "1.11.5" 	% "test",
	"org.specs2" 		%% "specs2" 	% "2.4.1"	% "test",
	"org.scalatest"		%% "scalatest"	% "2.2.1"	% "test")