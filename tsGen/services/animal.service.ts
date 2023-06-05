import { Animal } from "../entities/animal.entity";
import BaseService from "./base.service";

class AnimalService extends BaseService<Animal> {
	constructor() {
		super(Animal);
	}

	// Here you can add additional methods for the Animal Service
}

export default new AnimalService();
