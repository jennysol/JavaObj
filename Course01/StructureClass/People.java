/* Introdução:
    Structure file.java
*/
package javaobj.couse01.structureclass;

import java.util.Date;
import java.io.*;

class People {

    String name;
    String lastName;

    People(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    public String getAllName() {
        return this.name + this.lastName;
    }

}

interface Image {

}