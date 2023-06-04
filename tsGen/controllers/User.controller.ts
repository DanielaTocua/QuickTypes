import { NextFunction, Request, Response } from "express";

import UserFacade from "../facades/User.facade";

class UserController {
async delete(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await UserFacade.delete(parseInt(req.params.id), req.params.username))
			.status(200);
	}
async update(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await UserFacade.update(parseInt(req.params.id), req.params.username, req.body))
			.status(200);
	}
async get(req: Request, res: Response, next: NextFunction): Promise<void> {
		res
			.json(await UserFacade.get(parseInt(req.params.id), req.params.username))
			.status(200);
	}
async create(req: Request, res: Response, next: NextFunction): Promise<void> {
		res.json(await UserFacade.create(req.body)).status(200);
	}
}

export default new UserController();
