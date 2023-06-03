import {
	BaseEntity,
	Entity,
	PrimaryColumn,
	OneToOne,
	JoinColumn,
	Column
} from "typeorm"
import { Profile} from "./Profile.entity"
@Entity("profile")
export class Profile extends BaseEntity {
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
	
	@OneToOne((type) =>Profile, {nullable : true})
	@JoinColumn({ name: "idUser", referencedColumnName: "idProfile" })
	profile : Profile
}

