@Entity("user")
export class User extends BaseEntity {
@PrimaryColumn({length : 10,default : "a",})
	calificacion:number
@Column()
	password:string
@Column()
	email:string
@Column()
	username:string
}

