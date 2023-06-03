import {
	BaseEntity,
	Entity,
	PrimaryColumn,
	OneToOne,
	JoinColumn,
	Column
} from "typeorm"
import { Profile} from "./Profile.entity"
@Entity("user")
export class User extends BaseEntity {
	@PrimaryColumn({length : 10,default : "a",})
	calificacion : number
	@PrimaryColumn({length : 10,default : "a",})
	calificacion2 : number
	@PrimaryColumn({length : 10,default : "a",})
	username : string
	@Column({})
	email : string
	@Column({})
	password : string
	
	@OneToOne((type) =>Profile, {onDelete :  "CASCADE" , nullable : true})
	@JoinColumn({ name: "idUser", referencedColumnName: "idProfile" })
	profile : Profile
}

