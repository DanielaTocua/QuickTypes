import { User } from "../entities/User.entity";
import BaseService from "./base.service";

class UserService extends BaseService<User> {
	constructor() {
		super(User);
	}

	// Here you can add additional methods for the User Service
}

export default new UserService();
