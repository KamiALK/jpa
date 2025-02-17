#!/bin/bash

mvn clean compile && mvn clean compile exec:java -Dexec.mainClass="com.kamilo.hibernate.tests.TestEmpleados"
