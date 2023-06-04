import express from "express";

import UserController from "../controllers/User.controller";
import { UserCreationDTO, UserUpdateDTO } from "../dtos/User.baseDto";
import dtoValidationMiddleware from "../middlewares/dtoValidation.middleware";

const router = express.Router();
router.delete("/:id/:username", UserController.delete);
router.put("/:id/:username", dtoValidationMiddleware(UserUpdateDTO), UserController.update);
router.get("/:id/:username", UserController.get);
router.post("/", dtoValidationMiddleware(UserCreationDTO), UserController.create);
export default router;
