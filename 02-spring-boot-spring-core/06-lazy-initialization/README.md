# Lazy Initialization

A component can be initialized lazily, i.e. at the time it is needed and NOT at the startup of the application.

There are 2 ways to do so:

1. Mark the class lazy
```java

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Coach {
    public Coach() {
        ...
    }
}

```

2. Mark everything as lazy in application.properties
```application.properties
spring.main.lazy-initialization=true
```

