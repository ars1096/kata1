
package kata1v1;

import java.util.Date;

public class Kata1v1 {

    public static void main(String[] args) {
        Person person= new Person("Adrian", new Date (96,1,1));
        System.out.println(person.getName()+ " tiene "+ person.getAge()+ " años ");
    }
}
