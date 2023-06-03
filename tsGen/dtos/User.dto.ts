export class UserLoginDTO {
@Expose()
@IsNotEmpty
@Max(6) 
@Min(4) 
@IsEmail() 
@Min(3) 
@Max(2) 
@IsString
username: string;


@Expose()
@IsOptional
@Max(5) 
@Min(3) 
@Max(2) 
calificacion: number;
}
export class UserOutDTO {
@Expose()
@IsNotEmpty
@Max(6) 
@Min(4) 
@IsEmail() 
@Min(3) 
@Max(2) 
@IsString
username: string;


@Expose()
@IsOptional
@Max(5) 
@Min(3) 
@Max(2) 
calificacion: number;
}
