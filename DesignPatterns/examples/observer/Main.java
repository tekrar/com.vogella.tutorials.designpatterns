
package main;

import java.util.Iterator;

import mydomain.MyModel;
import mydomain.MyModel.Person;
import myobserver.MyObserver;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyModel model = new MyModel();
		MyObserver observer = new MyObserver(model);
		// We change the last name of the person, observer will get notified
		for (Iterator iterator = model.getPersons().iterator(); iterator
				.hasNext();) {
			Person person = (Person) iterator.next();
			person.setLastName(person.getLastName() + "new");
		}
		// We change the first name of the person, observer will get notified
		for (Iterator iterator = model.getPersons().iterator(); iterator
				.hasNext();) {
			Person person = (Person) iterator.next();
			person.setFirstName(person.getFirstName() + "new");
		}
	}
}
