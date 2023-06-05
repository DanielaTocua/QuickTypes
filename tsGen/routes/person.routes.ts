import express from "express";

import PersonController from "../controllers/person.controller";
import { PersonCreationDTO, PersonUpdateDTO } from "../dtos/person.baseDto";
import dtoValidationMiddleware from "../middlewares/dtoValidation.middleware";

const router = express.Router();
router.post("/", dtoValidationMiddleware(PersonCreationDTO), PersonController.create);
router.get("/:id", PersonController.get);
router.delete("/:id", PersonController.delete);
router.put("/:id", dtoValidationMiddleware(PersonUpdateDTO), PersonController.update);
export default router;
