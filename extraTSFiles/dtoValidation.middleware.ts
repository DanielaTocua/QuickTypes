import { plainToInstance } from "class-transformer";
import { validate, ValidationError } from "class-validator";
import { NextFunction, Request, Response } from "express";

export default <T>(dtoType: new () => T, skipMissingProperties = false) => {
    return (req: Request, res: Response, next: NextFunction) => {
        const dtoObj = plainToInstance(dtoType, req.body, {
            excludeExtraneousValues: true,
        });
        validate(dtoObj as object, { skipMissingProperties }).then(
            (errors: ValidationError[]) => {
                if (errors.length > 0) {
                    const dtoErrors = errors
                        .map((error: ValidationError) =>
                            (Object as any).values(error.constraints),
                        )
                        .join(", ");
                    next(new Error(dtoErrors));
                } else {
                    req.body = dtoObj;
                    next();
                }
            },
        );
    };
};
