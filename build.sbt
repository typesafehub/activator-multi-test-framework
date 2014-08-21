name := """multi-test-framework"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
        "com.novocode"           % "junit-interface" % "0.11"   % "test",
        "org.scalacheck"        %% "scalacheck"      % "1.11.5" % "test",
        "org.specs2"            %% "specs2"          % "2.4.1"  % "test",
        "org.scalatest"         %% "scalatest"       % "2.2.1"  % "test")
