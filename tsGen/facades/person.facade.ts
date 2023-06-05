import { GenericResponse } from "../dtos/genericResponse.dto";
import { PersonCreationDTO, PersonUpdateDTO } from "../dtos/person.baseDto";
import { Person } from "../entities/person.entity";
import PersonService from "../services/person.service";

class PersonFacade {
async delete(id : number, ): Promise<GenericResponse<string>> {
		await PersonService.delete({ id,  });
		return {
			data: "Person deleted",
		};
	}
async get(id : number, ): Promise<GenericResponse<Person>> {
		return {
			data: await PersonService.get({ id,  }),
		};
	}
async create(PersonData: PersonCreationDTO): Promise<GenericResponse<string>> {
		await PersonService.create(PersonData);
		return {
			data: "Person created",
		};
	}
async update(
		id : number, 
		PersonData: PersonUpdateDTO,
	): Promise<GenericResponse<string>> {
		await PersonService.update({ id,  }, PersonData);
		return {
			data: "Person updated",
		};
	}
}

export default new PersonFacade();
