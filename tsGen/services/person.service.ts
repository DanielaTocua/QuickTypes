import { Person } from "../entities/person.entity";
import BaseService from "./base.service";

class PersonService extends BaseService<Person> {
	constructor() {
		super(Person);
	}

	// Here you can add additional methods for the Person Service
}

export default new PersonService();
