import { DeepPartial, ObjectLiteral, Repository } from "typeorm";

import { appDataSource } from "../dataSource";
export default class BaseService<T extends ObjectLiteral> {
    protected repository: Repository<T>;

    constructor(entityClass: any) {
        this.repository = appDataSource.getRepository(entityClass);
    }

    async create(entityData: DeepPartial<T>): Promise<T> {
        const newEntity = this.repository.create(entityData);
        return this.repository.save(newEntity);
    }

    async get(id: any): Promise<T> {
        return this.repository.findOneByOrFail(id);
    }

    async update(id: any, entityData: DeepPartial<T>): Promise<T> {
        const entity = await this.repository.findOneByOrFail(id);
        this.repository.merge(entity, entityData);
        return this.repository.save(entity);
    }

    async delete(id: any): Promise<void> {
        await this.repository.delete(id);
    }
}
