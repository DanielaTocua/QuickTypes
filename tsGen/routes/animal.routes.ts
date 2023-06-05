import express from "express";

import AnimalController from "../controllers/animal.controller";
import { AnimalCreationDTO, AnimalUpdateDTO } from "../dtos/animal.baseDto";
import dtoValidationMiddleware from "../middlewares/dtoValidation.middleware";

const router = express.Router();
router.post("/", dtoValidationMiddleware(AnimalCreationDTO), AnimalController.create);
router.get("/:id", AnimalController.get);
router.put("/:id", dtoValidationMiddleware(AnimalUpdateDTO), AnimalController.update);
router.delete("/:id", AnimalController.delete);
export default router;
