import { Expose } from "class-transformer";
import {
PrimaryGeneratedColumn,
IsNotEmpty,
Column,
IsOptional,
} from "class-validator";
export class UserCreationDTO {
@IsNotEmpty()
password : string
@IsNotEmpty()
@IsEmail() 
email : string
@IsNotEmpty()
@MinLength(5) 
username : string
}
