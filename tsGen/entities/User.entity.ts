import {
	BaseEntity,
	Entity,
	PrimaryColumn,
	Column
} from "typeorm"
@Entity("user")
export class User extends BaseEntity {
	@PrimaryColumn({length : 10,default : "a",})
	calificacion : number
	@PrimaryColumn({length : 10,default : "a",})
	calificacion2 : number
	@Column({})
	username : string
	@Column({})
	email : string
	@Column({})
	password : string
}

