# Object Oriented Programming Task
## You have 3 mandatory classes:
* Human
* Car
* CarPart

### Class requirements:
#### HUMAN:
* Has a Car
* Has First and Last name
* Has birth Date
* Has driving experience****
* Has money
* Has ID (a personal document with a type, and an expiration date)
    * Only possible documents are ID-card, drivers' licence and ISIC card

What we can do with every human:
* Get or change his car
* Get or change his personal details
* Get or change his ID
* Human can drive his car
    * If driving, there is 1 in 10 chance that car breaks
    * Human can't drive his car if it is broken!
    * Driving must ask for how fast to drive (in km/h) and what distance (in kilometers)
        * Human can't drive faster than car max speed - this is forbidden!
        * If human drives over 100 km/h - he finishes driving and police takes away 500 euros from him
    * We have to know how long did it take to drive (in minutes).
    * After driving human gets driving experience - 1 xp for every kilometer
        * He doesn't get experience if he was driving for less than 30 minutes or if police fined him


* Human can repair his car for 100 euros
    * Then he can drive again
    

#### CAR
* Has a Type - We only have BMW, Toyota, Audi, Mercedes. No other cars
* Has 2 CarParts
* Has color
* Has max speed
* Is working or broken
* Has mileage (how much has this car driven)

What we can do with every car:

* Drive it
    * After driving a car the mileage must increase
    * If car mileage is > 5000, the car breaks and human must repair it
* Repair it
    * After repairing, car mileage is 0
* Change color, max speed. We can't change a Car's type.
* Replace car parts


#### CAR PART
* Has name and Type
    * Only possible Car Part types - Turbo, Exhaust, Tire, Wheel
    
## Feel free to add any other Classes/files if you think you need them
