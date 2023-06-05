import {
	BaseEntity,
	Entity,
	JoinColumn,
	PrimaryGeneratedColumn,
	Column,
	ManyToOne
} from "typeorm"
import { Person} from "./person.entity"
@Entity("animal")
export class Animal extends BaseEntity {
	@PrimaryGeneratedColumn({})
	id : number
	@Column({})
	name : string
	@Column({})
	breed : string
	@Column({})
	age : number
	@Column({})
	owner_id : number
	
	@ManyToOne((type) =>Person, {onDelete :  "CASCADE" , })
	@JoinColumn({ name: "owner_id", referencedColumnName: "id" })
	person : Person
}

