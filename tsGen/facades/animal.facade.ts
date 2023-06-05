import { GenericResponse } from "../dtos/genericResponse.dto";
import { AnimalCreationDTO, AnimalUpdateDTO } from "../dtos/animal.baseDto";
import { Animal } from "../entities/animal.entity";
import AnimalService from "../services/animal.service";

class AnimalFacade {
async create(AnimalData: AnimalCreationDTO): Promise<GenericResponse<string>> {
		await AnimalService.create(AnimalData);
		return {
			data: "Animal created",
		};
	}
async get(id : number, ): Promise<GenericResponse<Animal>> {
		return {
			data: await AnimalService.get({ id,  }),
		};
	}
async delete(id : number, ): Promise<GenericResponse<string>> {
		await AnimalService.delete({ id,  });
		return {
			data: "Animal deleted",
		};
	}
async update(
		id : number, 
		AnimalData: AnimalUpdateDTO,
	): Promise<GenericResponse<string>> {
		await AnimalService.update({ id,  }, AnimalData);
		return {
			data: "Animal updated",
		};
	}
}

export default new AnimalFacade();
