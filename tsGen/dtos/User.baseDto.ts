import { Expose } from "class-transformer";
import {
IsEmail,
IsNotEmpty,
IsOptional,
MinLength,
} from "class-validator";
export class UserUpdateDTO {
	@IsOptional()
	@Expose()
	password : string

	@IsOptional()
	@IsEmail() 
	@Expose()
	email : string

	@IsOptional()
	@MinLength(5) 
	@Expose()
	username : string

}
export class UserCreationDTO {
	@IsNotEmpty()
	@Expose()
	password : string

	@IsNotEmpty()
	@IsEmail() 
	@Expose()
	email : string

	@IsNotEmpty()
	@MinLength(5) 
	@Expose()
	username : string

}
