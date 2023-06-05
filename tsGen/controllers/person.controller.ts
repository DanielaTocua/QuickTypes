import { NextFunction, Request, Response } from "express";

import PersonFacade from "../facades/person.facade";

class PersonController {
async delete(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await PersonFacade.delete(parseInt(req.params.id), ))
			.status(200);
	}
async get(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await PersonFacade.get(parseInt(req.params.id), ))
			.status(200);
	}
async create(req: Request, res: Response, next: NextFunction): Promise<void> {
		res.json(await PersonFacade.create(req.body)).status(200);
	}
async update(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await PersonFacade.update(parseInt(req.params.id),  req.body))
			.status(200);
	}
}

export default new PersonController();
