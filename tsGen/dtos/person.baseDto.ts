import { Expose } from "class-transformer";
import {
IsNotEmpty,
IsString,
IsOptional,
} from "class-validator";
export class PersonCreationDTO {
	@IsNotEmpty()
	@IsString()
	@Expose()
	name : string

	@IsNotEmpty()
	@IsString()
	@Expose()
	lastname : string

}
export class PersonUpdateDTO {
	@IsOptional()
	@IsString()
	@Expose()
	name : string

	@IsOptional()
	@IsString()
	@Expose()
	lastname : string

}
