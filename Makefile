# Makefile 
# Akhil Boddu

# A simple Makefile
# HelloWorld.class: HelloWorld.java
# javac HelloWorld.java

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

GSON = ./gson/gson-2.6.2.jar -sourcepath ./src ./src/$*.java


JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Car.class Driver.class Vehicle.class Passenger.class \
		UberApp.class Ride.class UberRide.class Database.class

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: Person.class Car.class Driver.class Vehicle.class Passenger.class \
			UberApp.class Ride.class UberRide.class Database.class
	      
GSON: test_classes
	
Person.class: Person.java
	javac -d $(BINDIR) -cp $(GSON)
Car.class: Car.java
	javac -d $(BINDIR) -cp $(GSON)
Driver.class: Driver.java
	javac -d $(BINDIR) -cp $(GSON)
Vehicle.class: Vehicle.java
	javac -d $(BINDIR) -cp $(GSON)
Passenger.class: Passenger.java
	javac -d $(BINDIR) -cp $(GSON)
UberApp.class: UberApp.java
	javac -d $(BINDIR) -cp $(GSON)
Ride.class: Ride.java
	javac -d $(BINDIR) -cp $(GSON)
UberRide.class: UberRide.java
	javac -d $(BINDIR) -cp $(GSON)
Database.class: Database.java
	javac -d $(BINDIR) -cp $(GSON)


#test_classes: SearchItLinearTest.java eDirectoryTest.java #SearchItTest.java PrintItTest.java
	      
#GSON: test_classes
#	javac -d $(BINDIR) -cp ../GSON/GSON-4.12.jar -sourcepath ./src $*.java
#	#java -cp $(BINDIR):$(GSON) org.GSON.runner.GSONCore $*.java	

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
