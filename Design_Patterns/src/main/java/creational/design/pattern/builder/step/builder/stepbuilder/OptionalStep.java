package creational.design.pattern.builder.step.builder.stepbuilder;

import creational.design.pattern.builder.step.builder.builder.HttpRequest;

public interface OptionalStep {

    OptionalStep body(String body);
    OptionalStep timeout(Integer timeout);
    HttpRequest build();
}
