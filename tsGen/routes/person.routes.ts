import express from "express";

import PersonController from "../controllers/person.controller";
import { PersonCreationDTO, PersonUpdateDTO } from "../dtos/person.baseDto";
import dtoValidationMiddleware from "../middlewares/dtoValidation.middleware";

const router = express.Router();
router.post("/", dtoValidationMiddleware(PersonCreationDTO), PersonController.create);
router.put("/:id", dtoValidationMiddleware(PersonUpdateDTO), PersonController.update);
router.delete("/:id", PersonController.delete);
router.get("/:id", PersonController.get);
export default router;
