import { NextFunction, Request, Response } from "express";

import AnimalFacade from "../facades/animal.facade";

class AnimalController {
async create(req: Request, res: Response, next: NextFunction): Promise<void> {
		res.json(await AnimalFacade.create(req.body)).status(200);
	}
async get(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await AnimalFacade.get(parseInt(req.params.id), ))
			.status(200);
	}
async update(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await AnimalFacade.update(parseInt(req.params.id),  req.body))
			.status(200);
	}
async delete(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await AnimalFacade.delete(parseInt(req.params.id), ))
			.status(200);
	}
}

export default new AnimalController();
