import { MsgResponse } from "../dtos/GenericResponse.dto";
import { UserCreationDTO, UserUpdateDTO } from "../dtos/User.baseDto";
import { User } from "../entities/User.entity";
import UserService from "../services/User.service";

class UserFacade {
async delete(id : number, username : string, ): Promise<GenericResponse<string>> {
		await UserService.delete({ id, username,  });
		return {
			data: "User deleted",
		};
	}
async update(
		id : number, username : string, 
		UserData: UserUpdateDTO,
	): Promise<GenericResponse<string>> {
		await UserService.update({ id, username,  }, UserData);
		return {
			data: "User updated",
		};
	}
async get(id : number, username : string, ): Promise<GenericResponse<User>> {
		return {
			data: await UserService.get({ id, username,  }),
		};
	}
async create(UserData: UserCreationDTO): Promise<GenericResponse<string>> {
		await UserService.create(UserData);
		return {
			data: "User created",
		};
	}
}

export default new UserFacade();
