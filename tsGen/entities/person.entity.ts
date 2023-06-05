import {
	BaseEntity,
	Entity,
	PrimaryGeneratedColumn,
	Column
} from "typeorm"
@Entity("person")
export class Person extends BaseEntity {
	@PrimaryGeneratedColumn({})
	id : number
	@Column({})
	name : string
	@Column({})
	lastname : string
	
}

