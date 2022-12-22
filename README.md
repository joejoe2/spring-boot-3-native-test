#

## note
1. use `@RegisterReflectionForBinding` for any ObjectMapper serialization/deserialization

2. mockito is not supported now

3. HandlerInterceptor preHandle() can get annotations from a HandlerMethod

## test
```mvn -PnativeTest test```

can use @ActiveProfiles("test") to load application-test.env

## build
```mvn -Pnative native:comile```

this will build with application.env

## run
```./target/demo```

you can use `env "demo.config=env" bash` to set env