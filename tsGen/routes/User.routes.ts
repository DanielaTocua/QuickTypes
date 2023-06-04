import express from "express";

import UserController from "../controllers/User.controller";
import { UserCreationDTO, UserUpdateDTO } from "../dtos/User.baseDto";
import dtoValidationMiddleware from "../middlewares/dtoValidation.middleware";

const router = express.Router();
router.put("/:id", dtoValidationMiddleware(UserUpdateDTO), UserController.update);
router.delete("/:id", UserController.delete);
router.post("/", dtoValidationMiddleware(UserCreationDTO), UserController.create);
router.get("/:id", UserController.get);
export default router;
