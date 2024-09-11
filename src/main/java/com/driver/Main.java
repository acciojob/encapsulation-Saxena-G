package com.driver;

public class Main {
      public static void main(String[] args) {
            RWOnly rwOnly = new RWOnly();
            /*rwOnly.Name("gaurav");
            rwOnly.Address("islamnagar");
            System.out.println(rwOnly.Name);

            D:\encapsulation-Saxena-G-master\encapsulation-Saxena-G-master\src\main\java\com\driver\Main.java:6:19
            java: cannot find symbol
            symbol:   method Name(java.lang.String)
                    location: variable rwOnly of type com.driver.RWOnly
            D:\encapsulation-Saxena-G-master\encapsulation-Saxena-G-master\src\main\java\com\driver\Main.java:7:19
            java: cannot find symbol
            symbol:   method Address(java.lang.String)
                    location: variable rwOnly of type com.driver.RWOnly
            D:\encapsulation-Saxena-G-master\encapsulation-Saxena-G-master\src\main\java\com\driver\Main.java:8:38
            java: Name has private access in com.driver.RWOnly
*/

            rwOnly.setName("gaurav");
            System.out.println(rwOnly.getName());
      }


}
