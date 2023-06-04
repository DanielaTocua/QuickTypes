import {
	BaseEntity,
	Entity,
	PrimaryColumn,
	PrimaryGeneratedColumn,
	Column
} from "typeorm"
@Entity("user")
export class User extends BaseEntity {
	@PrimaryGeneratedColumn({})
	id : number
	@PrimaryColumn({unique : true})
	username : string
	@Column({})
	email : string
	@Column({})
	password : string
	
}

