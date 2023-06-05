import { NextFunction, Request, Response } from "express";

import PersonFacade from "../facades/person.facade";

class PersonController {
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
