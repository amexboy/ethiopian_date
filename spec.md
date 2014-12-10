# Spec

```java
  EthiopianDate myBirthDay1 = new EthiopianDate(21,3,1986); // given ethiopian date
  EthiopianDate myBirthDay2 = new EthiopianDate(new GregorianCalendar(1993,11,30)); // given greg calender
  EthiopianDate myBirthDay3 = new EthiopianDate(new Date( . . . )); // given date 
  EthiopianDate myBirthDay4 = new EthiopianDate(Calender.now()); // given calender
  EthiopianDate myBirthDay5 = new EthiopianDate(); // same as above
  EthiopianDate myBirthDay6 = new EthiopianDate(123456); // given unix timestamp
  
  boolean valid = myBirthDay1.isValid(); // return true
  boolean leapYear1 = myBirthDay1.isLeapYear(); // return false
  boolean leapYear2 = new EthiopianDate(1,1,2007).isLeapYear(); // return true
  
  Date date = myBirthDay1.getDate();
  GregorianCalendar gc = myBirthDay1.getGregorianCalendar();
  
  // . . . 
```
