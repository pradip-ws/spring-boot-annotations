# spring-boot-annotations
Spring Boot Annotation use with example


1) @Component Annotaion

The @Component annotation indicates that an annotated class is a "Spring bean/component"
The @COmponent annotation tells spring container to autometically create spring bean.

Spring offers 3 wasys of congirations
    1.XML based congiration
    2.Annotation based congiration
    3.Java based congiration

2) @Autowired Annotation

The @Autowired annotation is used to inject the bean autometically
The @Autowired annotation is used in constructor injection, setter injection and feild injection

3) @Qualifier annotation

@Qualifier annotation is used in conjunction with autowired to avoid confusion when we have two or more beans configured for same types.


4) @Primary annotation

We use @Primary annotation to give higher preference to a bean when there are multiple beans of the same types.

5) @Bean annotation  (It is Java Based configuration)

@Bean annotation indicates that a method produces a bean to be managed by the spring container.
The @Bean annotation is usually declared in configuration class to create spring bean definations.

Note : it gives spring bean name as method name or you can explicitly provide bean passing name attribute in @Bean annotaion

-> Getting spring bean using appplicatin context getBean method
-> Injecting the dependency

@Bean annotaion provides initMethod and destroyMethod attributes to perform certain actions after bean initialization or before been destruction by a container.

 @Bean(initMethod = "init",destroyMethod = "destruct") // best usecase is whenever we needed to insert record in database on application start
 or you have requirement to delete those record when application getting shutdown


***** Stereotype annotations *******

1.These annotations are used to create spring beans autometically in the application context (Spring IOC Container)
2.The main stereotype annotaion is @Component
3.By using this annoation , Spring provides more stereotype meta annoatation such @Service, @Repository and @Controller
4.@Service annotation is used to create spring bean at service layer
5.@Repository annotation is used to create spring beans for the repositories at the DAO Layer
6.@Controller is used to create spring beans at the controller  layer


@Lazy annotation

By Default, Spring creates all singleton beans eagerly at the starup/ bootstrapping of application context.
you can load spring beans lazily (on-demand) using @Lazy annotation

@Lazy annotation can used with @Configuration, @Component and @Bean annotations

Eagar initailization is recommended : to avoid and detect all possible errors immediatly rather than at runtime.

Spring Bean Scopes

The latest version of spring framework defines 6 types of scopes

1.singletone
2.prototype
3.request
4.session
5.application
6.websocket

The last four scopes mentioned , request ,session, application, websocket are only available in web-aware application.

@Scope Annotation

@Scope annotation is used to define scope of the bean

We use @Scope to define the scope of a @Component class or @Bean defination

Singletone : only one instance of the bean is created and shared across the entire application. this is the default scope.

Prototype : a new instance of the bean is created every time it is requested
