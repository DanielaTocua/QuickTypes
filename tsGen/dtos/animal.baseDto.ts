import { Expose } from "class-transformer";
import {
IsNumber,
IsNotEmpty,
IsString,
IsOptional,
} from "class-validator";
export class AnimalCreationDTO {
	@IsNotEmpty()
	@IsNumber()
	@Expose()
	owner_id : number

	@IsNotEmpty()
	@IsString()
	@Expose()
	name : string

	@IsNotEmpty()
	@IsString()
	@Expose()
	breed : string

	@IsNotEmpty()
	@IsNumber()
	@Expose()
	age : number

}
export class AnimalUpdateDTO {
	@IsOptional()
	@IsNumber()
	@Expose()
	owner_id : number

	@IsOptional()
	@IsString()
	@Expose()
	name : string

	@IsOptional()
	@IsString()
	@Expose()
	breed : string

	@IsOptional()
	@IsNumber()
	@Expose()
	age : number

}
